package meteor.audio

import meteor.Main
import meteor.events.PlaySound
import org.rationalityfrontline.kevent.KEVENT
import java.io.ByteArrayInputStream
import java.io.InputStream
import javax.sound.sampled.*

class SoundPlayer(stream: AudioInputStream, delay: Int) {
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
            val gain = sound!!.getControl(FloatControl.Type.MASTER_GAIN) as FloatControl
            gain.value = getDecibels(gain, Main.client.waveVol)
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

    fun getDecibels(volumeControl: FloatControl, level: Int): Float {
        val range = volumeControl.maximum - volumeControl.minimum
        val min = volumeControl.minimum
        return when (level) {
            0 -> min + (range * .90f)
            -400 -> min + (range * .74f)
            -800 -> min + (range * .62f)
            -1200 -> min + (range * .50f)
            else -> min
        }
    }
}