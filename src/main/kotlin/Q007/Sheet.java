package Q007;

public class Sheet {

  private int questions;
  private int[] answers;
  private int studentNo;
  private int score;

  Sheet(int questions) {
    this.questions = questions;
  }

  public int getQuestions() {
    return questions;
  }

  public int[] getAnswers() {
    return answers;
  }

  public int getStudentNo() {
    return studentNo;
  }

  public int getScore() {
    return score;
  }

  public void setQuestions(final int questions) {
    this.questions = questions;
  }

  public void writeAnswers(final int[] answers) {
    this.answers = answers;
  }

  public void setStudentNo(final int studentNo) {
    this.studentNo = studentNo;
  }

  public void setScore(final int score) {
    this.score = score;
  }

}
