package Q0001;

import Q001.RecursionSumZeroToInput;
import Q001.RepetitionSumZeroToInput;
import Q001.SumZeroToInput;

import java.util.Scanner;

public class main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    SumZeroToInput sumZeroToInput;
    long calculateStartTime;

    System.out.printf("입력: ");
    int input = scanner.nextInt();

    sumZeroToInput = new RecursionSumZeroToInput();
    calculateStartTime = System.nanoTime();
    System.out.println("결과(Recursion): " + sumZeroToInput.calculate(input));
    System.out.println("실행시간: " + (System.nanoTime() - calculateStartTime) / 1000000 + " ms");

    sumZeroToInput = new RepetitionSumZeroToInput();
    calculateStartTime = System.currentTimeMillis();
    System.out.println("결과(Repetition): " + sumZeroToInput.calculate(input));
    System.out.println("실행시간: " + (System.nanoTime() - calculateStartTime) / 1000000 + " ms");
  }
}
