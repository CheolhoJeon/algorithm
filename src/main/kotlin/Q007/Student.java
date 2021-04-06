package Q007;

public class Student {

  int no;
  int[] pattern;
  int score;

  Student(int no, int[] pattern) {
    this.no = no;
    this.pattern = pattern;
  }

  Sheet takeExam(Sheet sheet) {
    int questions = sheet.getQuestions();
    int[] answers = new int[questions];

    for (int i = 0; i < questions; i++) {
      answers[i] = pattern[i % pattern.length];
    }

    sheet.setStudentNo(no);
    sheet.writeAnswers(answers);
    return sheet;
  }

  void setScore(final int score) {
    this.score = score;
  }

  int getScore() {
    return score;
  }

}
