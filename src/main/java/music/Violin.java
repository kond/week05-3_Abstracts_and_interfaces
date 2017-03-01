package main.java.music;

/**
 * Created by kond on 2017. 03. 01..
 */
public class Violin extends StringedInstrument {

  public Violin() {
    super("Violin", 4, "Screech");
  }

  public Violin(int strings) {
    super("Violin", strings, "Screech");
  }

}
