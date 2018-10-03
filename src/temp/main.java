package temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
  public static void main(String[] args) {
    List<Integer> A = new ArrayList<>(Arrays.asList(1));
    List<Integer> B = new ArrayList<>(Arrays.asList(2, 3));

    A.addAll(B);

    for (Integer element : A) {
      System.out.println(element);
    }
  }
}
