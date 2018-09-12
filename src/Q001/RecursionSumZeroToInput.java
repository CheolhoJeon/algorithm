package Q001;

public class RecursionSumZeroToInput extends SumZeroToInput {

  public RecursionSumZeroToInput() {
    this.method = "Recursion";
  }

  public int calculate(int input) {
    return input == 1 ? 1 : input + calculate(input - 1);
  }
}
