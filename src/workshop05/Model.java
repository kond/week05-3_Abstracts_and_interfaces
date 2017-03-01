package workshop05;

import java.util.Comparator;

/**
 * Created by kond on 2017. 03. 01..
 */
public class Model implements Comparable {
  private String name;
  private String size;
  private int rtV4M;

  public Model(String name, String size, int rtV4M) {
    super();
    this.name = name;
    this.size = size;
    this.rtV4M = rtV4M;
  }

  public int getRtV4M() {
    return rtV4M;
  }

  public String getName() {
    return name;
  }

  public String getSize() {
    return size;
  }

  public String toString() {
    return this.name + " - " + this.size + " diagonal (" + this.rtV4M + ")";
  }

  @Override
  public int compareTo(Object otherModel) {
    return this.rtV4M - ((Model) otherModel).getRtV4M();
  }

  public static Comparator<Model> ModelNameComparator = new Comparator<Model>() {
    @Override
    public int compare(Model model1, Model model2) {
      String model1Name = model1.getName().toUpperCase();
      String model2Name = model2.getName().toUpperCase();

      return model1Name.compareTo(model2Name);
    }
  };

  public static Comparator<Model> ModelSizeComparator = new Comparator<Model>() {
    @Override
    public int compare(Model model1, Model model2) {
      String model1Size = model1.getSize().toUpperCase();
      String model2Size = model2.getSize().toUpperCase();

      return model1Size.compareTo(model2Size);
    }
  };

}
