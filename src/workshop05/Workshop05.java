package workshop05;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by kond on 2017. 03. 01..
 */
public class Workshop05 {
  public static void main(String[] args) {
    List<String> tvModels= new ArrayList<String>();

    tvModels.add("Samsung S19E200BW");
    tvModels.add("LG 19MB35D");
    tvModels.add("NEC MultiSync EA193Mi");
    tvModels.add("Asus VE198S");

    //do something here
    Collections.sort(tvModels);

    //write the output now
    int i = 0;
    for(String tvModel : tvModels) {
      System.out.println("Model " + ++i + " : " + tvModel);
    }

  }
}
