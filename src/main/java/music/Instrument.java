package main.java.music;

/**
 * Created by kond on 2017. 03. 01..
 */
public abstract class Instrument {
  protected String name;

  public abstract void play(); // Prints a confirmation message

  public Instrument(String name) {
    this.name = name;
  }
}
