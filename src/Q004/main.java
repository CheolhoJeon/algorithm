package Q004;

public class main {

  public static void main(String[] args) {
    int[] result = Converter.eliminateDuplicateNumbers(1, 1, 1, 2, 2, 2, 3, 3, 3, 1, 1, 1, 1);

    for (int element : result) {
      System.out.print(element);
    }
  }

}
