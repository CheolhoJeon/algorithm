package Q011;

import java.util.Arrays;

public class Solution {

  public static int[] solution(int[] arr) {
    return arr.length == 1 ? new int[]{-1} : Arrays.stream(arr).filter(value -> value != Arrays.stream(arr).min().getAsInt()).toArray();
  }

}
