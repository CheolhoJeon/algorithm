package Q005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Divider {

  static List<Integer> resultList = new ArrayList<>();

  static int[] checkDividingNumber(int[] numbers, int divisor) {
    for (int number : numbers) {
      if ((number % divisor) == 0) {
        resultList.add(number);
      }
    }

    Collections.sort(resultList);

    int[] resultArray;
    if (resultList.size() > 0) {
      resultArray = new int[resultList.size()];

      for (int i = 0; i < resultArray.length; i++) {
        resultArray[i] = resultList.get(i);
      }
    } else {
      resultArray = new int[]{-1};
    }

    return resultArray;
  }

}
