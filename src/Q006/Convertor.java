package Q006;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Convertor {

  static String convertFromDecToOneTwoFour(int decimalNumber) {
    String result = "";
    List<Integer> reverseTrinaryNumber = convertFromDecToReverseTri(decimalNumber);
    List<Integer> oneTwoFourNumber = convertFromTriToOneTwoFour(reverseTrinaryNumber);

    Collections.reverse(oneTwoFourNumber);

    for (int number : oneTwoFourNumber) {
      result += String.valueOf(number);
    }

    return result;
  }

  private static List<Integer> convertFromDecToReverseTri(int decimalNumber) {
    List<Integer> reverseTrinaryNumber = new ArrayList<>();

    while (decimalNumber >= 3) {
      reverseTrinaryNumber.add(decimalNumber % 3);
      decimalNumber /= 3;
    }
    reverseTrinaryNumber.add(decimalNumber);

    return reverseTrinaryNumber;
  }

  private static List<Integer> convertFromTriToOneTwoFour(List<Integer> reverseTrinaryNumber) {
    List<Integer> result = new LinkedList<>();

    boolean flag = false;

    for (int i = 0; i < reverseTrinaryNumber.size(); i++) {
      int number = reverseTrinaryNumber.get(i);

      if (flag) {
        if (number == 0) {
          number = 2;
        } else {
          number -= 1;
          flag = false;
        }
      }

      if (number == 0 && i == (reverseTrinaryNumber.size() - 1)) {
        break;
      }

      if (number == 0) {
        result.add(4);
        flag = true;
      } else {
        result.add(number);
      }
    }

    return result;
  }

}
