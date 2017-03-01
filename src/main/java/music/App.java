package main.java.music;

/**
 * Created by kond on 2017. 03. 01..
 */
public class App {
  public static void main(String[] args) {
    System.out.println("Test 1, create ElectricGuitar, Bass and Violin with default strings.");
    ElectricGuitar guitar = new ElectricGuitar();
    ElectricBassGuitar bassGuitar = new ElectricBassGuitar();
    Violin violin = new Violin();

    System.out.println("Test 1 Play");
    guitar.play();
    bassGuitar.play();
    violin.play();

    System.out.println("Test 2, create ElectricGuitar, Bass with 7 and 5 strings .");
    guitar = new ElectricGuitar(7);
    bassGuitar = new ElectricBassGuitar(5);

    System.out.println("Test 2 Play");
    guitar.play();
    bassGuitar.play();
  }

}
