package Q003;

public class MiddleLetterSelector {

  static String select(String str) {
    return str.substring((str.length() - 1) / 2, str.length() / 2 + 1);
  }

}
