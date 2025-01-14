package meteor.audio

import client.events.WavePlay
import client.events.WaveReplay
import org.rationalityfrontline.kevent.KEVENT
import java.io.InputStream
import javax.sound.sampled.*

class SoundPlayer(stream: AudioInputStream, delay: Int) {
    companion object {
        init {
            KEVENT.subscribe<WavePlay> {
                SoundPlayer(AudioSystem.getAudioInputStream(it.data.soundStream), 0)
            }
            KEVENT.subscribe<WaveReplay> {
                WavePlay.lastWave.reset()
                SoundPlayer(AudioSystem.getAudioInputStream(WavePlay.lastWave), 0)
            }
        }

        fun init(){}
    }
    private var stream: AudioInputStream? = null
    private var info: DataLine.Info? = null
    private var sound: Clip? = null

    private var soundStream: InputStream? = null
    private var delay: Int? = null

    init {
        this.soundStream = stream
        this.delay = delay
        run()
    }

    fun run() {
        try {
            stream = soundStream as AudioInputStream
            info = DataLine.Info(Clip::class.java, stream!!.format)
            sound = AudioSystem.getLine(info) as Clip
            sound!!.open(stream)
            if (delay!! > 0) {
                Thread.sleep(delay!!.toLong())
            }
            sound!!.start()
            sound!!.drain()
            sound!!.flush()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}