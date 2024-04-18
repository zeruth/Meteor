package audio;

import javax.sound.midi.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import static sign.signlink.midi;

public class MidiPlayer {

  static Soundbank soundfont;
  static Sequencer sequencer;
  public static Synthesizer synthesizer;
  private static String currentSong;
  public static int volume;

  public static void playSong(boolean forced) {
    if (midi == null) {
      sequencer.stop();
    } else {
      if (sequencer != null)
        if (sequencer.getSequence() != null)
          sequencer.start();
    }

    if (midi == null || (midi.equals(currentSong)  && !forced)) {
      return;
    }

    File songFile = new File(midi);
    if (!songFile.exists())
      return;

    currentSong = midi;

    try {
      if (soundfont == null) {
        soundfont = MidiSystem.getSoundbank(
            Objects.requireNonNull(
                ClassLoader.getSystemClassLoader().getResourceAsStream("SCC1_Florestan.sf2")));
      }
      if (sequencer == null) {
        sequencer = MidiSystem.getSequencer(false);
      }

      if (synthesizer == null) {
        synthesizer = MidiSystem.getSynthesizer();
      }

      if (sequencer.isRunning())
        sequencer.stop();
      sequencer = MidiSystem.getSequencer(false);
      synthesizer = MidiSystem.getSynthesizer();
      sequencer.close();
      synthesizer.close();

      sequencer.open();
      synthesizer.open();
      synthesizer.loadAllInstruments(soundfont);

      sequencer.getTransmitter().setReceiver(synthesizer.getReceiver());
      try {
        Sequence sequence = MidiSystem.getSequence(songFile);
        sequencer.setSequence(sequence);
      } catch (InvalidMidiDataException | IOException e) {
        e.printStackTrace();
      }

      sequencer.start();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void stop() {
    if (sequencer.isRunning())
      sequencer.stop();
  }
}