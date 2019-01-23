package Q008;

public class PrimeCalculator {

  public static int getPrimeCount(int last) {
    int count = 0;

    for (int num = 2; num <= last; num++) {
      if (isPrime(num)) {
        count++;
      }
    }
    return count;
  }

  private static boolean isPrime(int num) {
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (isMultiple(num, i)) {
        return false;
      }
    }
    return true;
  }

  private static boolean isMultiple(int dividend, int divisor) {
    return dividend % divisor == 0 ? true : false;
  }

}
