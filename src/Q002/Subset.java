package Q002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {

  private List<Integer> elements;

  public Subset() {
    elements = new ArrayList<Integer>();
  }

  public Subset(List<Integer> elements) {
    this.elements = new ArrayList<>(elements);
  }

  public List<Subset> divideSubsetInHalf() {
    Subset subset1 = new Subset();
    Subset subset2 = new Subset();

    for (int idx=0 ; idx < elements.size() ; idx++) {
      if (idx < (elements.size() / 2)) {
        subset1.addElement(elements.get(idx));
      } else {
        subset2.addElement(elements.get(idx));
      }
    }

    return new ArrayList<>(Arrays.asList(subset1, subset2));
  }

  public void addElement(int element) {
    elements.add(element);
  }

  public void addElement(List<Integer> elements) {
    this.elements.addAll(elements);
  }

  public int sumElements() {
    int sum=0;

    for (int element : elements) {
      sum += element;
    }

    return sum;
  }

  public void printElements() {
    String str = "{ ";

    for (int element : elements) {
      str += element + " ";
    }

    str += "}";

    System.out.println(str);
  }

  public List<Integer> getElements() {
    return elements;
  }
}
