package Q012;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {

  public static int solution(int n) {
    int result = 0;

    while (n != 0) {
      result += n % 10;
      n /= 10;
    }

    return result;
  }

  public static int solution_stream(int n) {
    return Arrays.stream(String.valueOf(n).split("")).mapToInt(value -> Integer.parseInt(value)).sum();
  }

}
