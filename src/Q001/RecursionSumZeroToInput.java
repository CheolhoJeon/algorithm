package Q001;

public class RecursionSumZeroToInput implements SumZeroToInput {

  public int calculate(int input) {
    return input == 1 ? 1 : input + calculate(input - 1);
  }

}
