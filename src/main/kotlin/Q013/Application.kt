package Q013

import atomictest.eq

fun main() {
  solution(
    intArrayOf(1, 5, 2, 6, 3, 7, 4),
    arrayOf(
      intArrayOf(2, 5, 3),
      intArrayOf(4, 4, 1),
      intArrayOf(1, 7, 3)
    ),
  ) eq intArrayOf(5, 6, 3)
}

fun pick(array: IntArray, first: Int, last: Int, order: Int): Int =
  array.slice(first - 1 until last).sorted()[order - 1]

fun solution(array: IntArray, commands: Array<IntArray>): IntArray =
  commands.map { pick(array, it[0], it[1], it[2]) }.toIntArray()


