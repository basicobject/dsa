package io.github.basicobject.leetcode

import scala.annotation.tailrec

//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

object Problem7 {
  def reverseInt(num: Int): Int = {
    @tailrec
    def reverse(n: Int, rev: Int): Int = {
      if (n > 0) {
        val pop = n % 10

        if (rev > (Int.MaxValue / 10)) 0
        else if ((rev == (Int.MaxValue / 10)) && (pop > 7)) 0
        else reverse(n / 10, rev * 10 + pop)
      } else rev
    }

    if (num < 0) -1 * reverse(num * -1, 0)
    else reverse(num, 0)
  }
}
