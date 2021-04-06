package Q005;

// 람다 공부한 뒤에 프로그래머스 풀이 다시 보기
public class Application {

  public static void main(String[] args) {
    int[] numbers = new int[]{1, 3, 5, 10};
    int[] result = Divider.checkDividingNumber(numbers, 5);

    for (int element : result) {
      System.out.println(element);
    }
  }

}
