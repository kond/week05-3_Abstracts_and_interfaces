package main.java.music;

/**
 * Created by kond on 2017. 03. 01..
 */
public abstract class StringedInstrument extends Instrument {
  protected int numberOfStrings;
  protected String sound;
  protected final String formatForPlay = "%s, a %d-stringed instrument that %s\n";

  public StringedInstrument(String name, int numberOfStrings, String sound) {
    super(name);
    this.numberOfStrings = numberOfStrings;
    this.sound = sound;
  }

  public void play() {
    System.out.printf(this.formatForPlay, this.name, this.numberOfStrings, this.sound);
  }

}
