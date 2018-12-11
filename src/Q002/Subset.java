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

  public List<Integer> getElements(int offset, int limit) {
    return new ArrayList<Integer>(elements.subList(offset, limit));
  }
}
