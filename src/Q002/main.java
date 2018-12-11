package Q002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    List<Integer> inputElement = new ArrayList<>();

    int count = 0;
    int numOfElement = scanner.nextInt();
    int sum = scanner.nextInt();

    for (int idx=0 ; idx < numOfElement ; idx++) {
      inputElement.add(scanner.nextInt());
    }

    for (Subset subset : getSubsets(new Subset(inputElement))) {
      if (subset.sumElements() == sum) {
        count++;
      }
    }

    System.out.println(count);
  }

  private static List<Subset> getSubsets(Subset inputSubset) {

    if ( inputSubset.getElements().size() == 1 ) {
      return new ArrayList<>(Arrays.asList(inputSubset));
    }

    List<Subset> resultSubsets = new ArrayList<Subset>();

    System.out.println("============");
    Subset subset1 = new Subset();
    subset1.addElement(inputSubset.getElements(0, 1));
    Subset subset2 = new Subset();
    subset1.addElement(inputSubset.getElements(1, inputSubset.getElements().size()));

    System.out.println(inputSubset.getElements(0, 1));
    System.out.println(inputSubset.getElements(1, 5));

    System.out.println(subset1.getElements());
    System.out.println(subset2.getElements());


    List<Subset> subsets = getSubsets(subset2);

    for (Subset subset : subsets) {
      resultSubsets.add(subset);
      Subset newSubset = new Subset(subset.getElements());
      newSubset.addElement(subset1.getElements());
      resultSubsets.add(newSubset);
    }
    resultSubsets.add(subset1);

    return resultSubsets;
  }
}
