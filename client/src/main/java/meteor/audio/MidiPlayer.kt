package meteor.audio

import client.events.MidiPlay
import client.events.MidiStop
import meteor.Main
import org.rationalityfrontline.kevent.KEVENT
import java.io.File
import java.io.IOException
import java.util.*
import javax.sound.midi.*

object MidiPlayer {
    var soundfont: Soundbank? = null
    var sequencer: Sequencer? = null
    var synthesizer: Synthesizer? = null
    private var currentSong: String? = null
    var preventLoginMusic = false

    fun init(){}

    init {
        KEVENT.subscribe<MidiPlay> {
            playSong(it.data.name, true)
        }
        KEVENT.subscribe<MidiStop> {
            stop()
        }
    }

    fun playSong(midi: String, forced: Boolean) {
        if (!Main.client.ingame && preventLoginMusic)
            return

        if (sequencer != null) if (sequencer!!.sequence != null) sequencer!!.start()

        if ((midi == currentSong && !forced)) {
            return
        }

        val songFile = File(midi)
        if (!songFile.exists()) return

        currentSong = midi

        try {
            if (soundfont == null) {
                soundfont = MidiSystem.getSoundbank(
                    Objects.requireNonNull(
                        ClassLoader.getSystemClassLoader().getResourceAsStream("SCC1_Florestan.sf2")
                    )
                )
            }
            if (sequencer == null) {
                sequencer = MidiSystem.getSequencer(false)
            }

            if (synthesizer == null) {
                synthesizer = MidiSystem.getSynthesizer()
            }

            if (sequencer!!.isRunning) sequencer!!.stop()
            sequencer = MidiSystem.getSequencer(false)
            synthesizer = MidiSystem.getSynthesizer()
            sequencer!!.close()
            synthesizer!!.close()

            sequencer!!.open()
            synthesizer!!.open()
            synthesizer!!.loadAllInstruments(soundfont)

            sequencer!!.transmitter.receiver = synthesizer!!.receiver
            try {
                val sequence = MidiSystem.getSequence(songFile)
                sequencer!!.sequence = sequence
            } catch (e: InvalidMidiDataException) {
                e.printStackTrace()
            } catch (e: IOException) {
                e.printStackTrace()
            }

            sequencer!!.start()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun stop() {
        if (sequencer?.isRunning == true) sequencer?.stop()
    }
}