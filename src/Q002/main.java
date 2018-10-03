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
    List<Subset> dividedSubsets = inputSubset.divideSubsetInHalf();
    Subset subset1 = dividedSubsets.get(0);
    Subset subset2 = dividedSubsets.get(1);

    List<Subset> subsets1 = getSubsets(subset1);
    List<Subset> subsets2 = getSubsets(subset2);

    for (Subset tmpSubset1 : subsets1) {
      for (Subset tmpSubset2 : subsets2) {
        Subset subset = new Subset(tmpSubset1.getElements());
        subset.addElement(tmpSubset2.getElements());
        resultSubsets.add(subset);
      }
      resultSubsets.add(tmpSubset1);
    }
    resultSubsets.addAll(subsets2);

    return resultSubsets;
  }
}
