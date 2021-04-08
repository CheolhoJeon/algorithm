package Q007

import atomictest.eq

class Sheet(
  val answers: List<Int>,
) {
  var studentNo: Int = 0
  var score: Int = 0
  val totalQuestion: Int
    get() = answers.size

  fun solve(questionNo: Int, answer: Int) {
    if (answers[questionNo] == answer) score++
  }
}

class Student(
  val studentNo: Int,
  val pattern: List<Int>,
) {
  fun takeTest(sheet: Sheet): Sheet {
    sheet.studentNo = studentNo

    repeat(sheet.totalQuestion) { questionNo ->
      sheet.solve(questionNo, answer = pattern[questionNo % pattern.size])
    }
    return sheet
  }
}

fun solution(answers: IntArray): IntArray {
  val students = listOf(
    Student(studentNo = 1, pattern = listOf(1, 2, 3, 4, 5)),
    Student(2, listOf(2, 1, 2, 3, 2, 4, 2, 5)),
    Student(3, listOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)),
  )
  val sheets = mutableListOf<Sheet>()
  students.forEach { sheets += it.takeTest(Sheet(answers = answers.toList())) }

  val maxScore = sheets.maxOf { it.score }
  val bestStudentNumbers = mutableListOf<Int>()
  sheets.forEach { if (it.score == maxScore) bestStudentNumbers += it.studentNo }

  return bestStudentNumbers.toIntArray()
}

fun main() {
  solution(intArrayOf(1, 2, 3, 4, 5)).toList() eq "[1]"
  solution(intArrayOf(1, 3, 2, 4, 2)).toList() eq "[1, 2, 3]"
}