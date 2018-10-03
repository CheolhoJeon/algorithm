package Q001;

public class RepetitionSumZeroToInput extends SumZeroToInput {

  public RepetitionSumZeroToInput() {
    this.method = "Repetition";
  }

  public int calculate(int input) {
    int result = 0;

    for (int start = 0; start <= input; start++) {
      result += start;
    }

    return result;
  }
}
