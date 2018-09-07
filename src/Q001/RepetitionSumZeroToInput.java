package Q001;

public class RepetitionSumZeroToInput implements SumZeroToInput {

  public int calculate(int input) {
    int result = 0;

    for (int start = 0; start <= input; start++) {
      result += start;
    }

    return result;
  }

}
