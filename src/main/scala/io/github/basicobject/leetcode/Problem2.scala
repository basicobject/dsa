//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit.
//Add the two numbers and return the sum as a linked list. You may assume the two numbers do not contain any leading zero, except the number 0 itself.

package io.github.basicobject.leetcode
import scala.annotation.tailrec

object Problem2 {
  def toDigitList(num: Int): List[Int] = {
    @tailrec
    def extractDigit(num: Int, acc: List[Int] = List.empty): List[Int] = {
      if (num == 0) acc
      else extractDigit(num / 10, acc ++ List(num % 10))
    }

    extractDigit(num)
  }

  def sum(num1: Seq[Int], num2: Seq[Int]): Seq[Int] = {
    @tailrec
    def sumLoop(
        l1: Seq[Int],
        l2: Seq[Int],
        carry: Int = 0,
        acc: Seq[Int] = Seq.empty
    ): Seq[Int] = {
      (l1, l2) match {
        case (Nil, Nil) => acc
        case (Nil, head2 :: tail2) =>
          val sum = head2 + carry
          sumLoop(Nil, tail2, sum / 10, acc ++ Seq(sum % 10))
        case (head1 :: tail1, Nil) =>
          val sum = head1 + carry
          sumLoop(tail1, Nil, sum / 10, acc ++ Seq(sum % 10))
        case (head1 :: tail1, head2 :: tail2) =>
          val sum = head1 + head2 + carry
          sumLoop(tail1, tail2, sum / 10, acc ++ Seq(sum % 10))
      }
    }

    sumLoop(num1, num2)
  }
}
