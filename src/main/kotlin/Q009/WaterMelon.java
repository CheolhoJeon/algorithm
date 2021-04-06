package Q009;

public class WaterMelon {

  public static StringBuilder str;

  public static String getString(int num) {
    str = new StringBuilder();
    for (int i = 1; i <= num; i++) {
      str.append(i % 2 != 0 ? "수" : "박");
    }
    return new String(str);
  }

}
