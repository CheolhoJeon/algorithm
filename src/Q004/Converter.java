package Q004;

import java.util.ArrayList;
import java.util.List;

class Converter {

  static List<Integer> result = new ArrayList<>();

  private Converter() {

  }

  static int[] eliminateDuplicateNumbers(int... numbers) {
    result.add(numbers[0]);

    for (int number : numbers) {
      if (result.get(result.size() - 1) != number) {
        result.add(number);
      }
    }

    int[] arr = new int[result.size()];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = result.get(i);
    }

    return arr;
  }

}
