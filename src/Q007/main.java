package Q007;

import java.util.ArrayList;
import java.util.List;

public class main {

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>(3);

    students.add(new Student(1, new int[]{1, 2, 3, 4, 5}));
    students.add(new Student(2, new int[]{2, 1, 2, 3, 2, 4, 2, 5}));
    students.add(new Student(3, new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}));

    int[] bestStudents;
    Teacher teacher = new Teacher();
    teacher.isInChargeOf(students);
    bestStudents = teacher.test(1, 1, 1);
    for (int num : bestStudents) {
      System.out.println(num);
    }
  }

}
