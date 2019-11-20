package Q010;

public class Solution {

  public static String solution(String s, int n) {
    return s.chars()
        .map(i -> Character.isLowerCase(i) ? (i - 'a' + n) % 26 + 'a' : i)
        .map(i -> Character.isUpperCase(i) ? (i - 'A' + n) % 26 + 'A' : i)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
  }

}
