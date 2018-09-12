package Q001;

public class SeriesSumZeroToInput extends SumZeroToInput{

  public SeriesSumZeroToInput() {
    this.method = "Series";
  }

  public int calculate(int input) {
    return (input * (input + 1)) / 2;
  }
}
