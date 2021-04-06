package Q005

import atomictest.eq

fun main() {
  // 코틀린 좀 더 공부해서 eq 함수 수정하자
//  solution(intArrayOf(5, 9, 7, 10), 5) eq "[5, 10]"
//  solution(intArrayOf(2, 36, 1, 3), 1) eq "[1, 2, 3, 36]"
//  solution(intArrayOf(3, 2, 6), 10) eq "[-1]"
}

//fun solution(arr: IntArray, divisor: Int): IntArray {
//  var result = intArrayOf()
//
//  arr.forEach { if (it % divisor == 0) result += it }
//
//  if (result.isEmpty()) result += -1
//
//  return result.sortedArray()
//}

fun solution(arr: IntArray, divisor: Int): IntArray {
  var result = arr
    .filter { it % divisor == 0 }
    .sorted()
    .toIntArray()

  return if (result.isEmpty()) intArrayOf(-1) else result
}