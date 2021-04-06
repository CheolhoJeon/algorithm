package Q007;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

  List<Student> students;

  int[] test(int... answers) {
    List<Sheet> sheets = new ArrayList<>();

    for (Student student : students) {
      Sheet stuSheet = student.takeExam(new Sheet(answers.length));
      int[] stuAnswers = stuSheet.getAnswers();
      int score = 0;

      for (int i = 0; i < answers.length; i++) {
        if (answers[i] == stuAnswers[i]) {
          score++;
        }
      }
      stuSheet.setScore(score);
      sheets.add(stuSheet);
    }

    int maxScore = 0;
    for (Sheet sheet : sheets) {
      int stuScore = sheet.getScore();

      if (stuScore > maxScore) {
        maxScore = stuScore;
      }
    }

    List<Integer> bestStudents = new ArrayList<>();
    int idx=0;
    for (Sheet sheet : sheets) {
      if(sheet.getScore() == maxScore) {
        bestStudents.add(sheet.getStudentNo());
      }
    }

    Integer[] result = new Integer[bestStudents.size()];
    bestStudents.toArray(result);

    int[] result2 = new int[result.length];
    for (int i=0; i<result2.length ;i++) {
      result2[i] = result[i];
    }

    return result2;
  }

  void isInChargeOf(List<Student> students) {
    this.students = students;
  }

}
