package Q003

import atomictest.eq

fun main() {
  solution("abcde") eq "c"
  solution("qwer") eq "we"
}

fun solution(s: String) = s.substring(
  startIndex = (s.length - 1) / 2,
  endIndex = s.length / 2 + 1,
)

// fun solution(s: String) = s.slice(((s.length - 1) / 2)..(s.length / 2))

//fun solution(s: String): String {
//  val start = (s.length - 1) / 2
//  val end = s.length / 2
//  return s.slice(start..end)
//}