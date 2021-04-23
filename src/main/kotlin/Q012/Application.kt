package Q012

import atomictest.eq

fun solution(n: Int) = n.toString().toCharArray().sumOf { it - '0' }

fun main() {
  solution(5) eq 5
  solution(123) eq 6
  solution(987) eq 24
}