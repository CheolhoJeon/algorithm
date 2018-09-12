package Q0001;

import Q001.*;

import java.util.Scanner;

public class main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.printf("입력: ");
    int input = scanner.nextInt();

    execute(input, new RecursionSumZeroToInput());
    execute(input, new RepetitionSumZeroToInput());
    execute(input, new SeriesSumZeroToInput());
  }

  private static void execute(int input, SumZeroToInput sumZeroToInput) {

    Timer.start();
    System.out.println("결과(" + sumZeroToInput.getMethod() + "): " + sumZeroToInput.calculate(input));
    System.out.println("실행시간: " + Timer.stop() + " ns");
  }
}
