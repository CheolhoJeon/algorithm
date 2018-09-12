package Q001;

public class Timer {

  private static long start;

  public static void start() {
    start = System.nanoTime();
  }

  public static long stop() {
    return System.nanoTime() - start;
  }
}
