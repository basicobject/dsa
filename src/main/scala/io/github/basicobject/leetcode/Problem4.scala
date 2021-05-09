package io.github.basicobject.leetcode

import scala.annotation.tailrec

object Problem4 {
  def medianOfSortedArrays(list1: Seq[Int], list2: Seq[Int]): Float = {
    val finalLength = (list1.length + list2.length)
    val midPositions =
      if ((finalLength % 2) == 0) Seq(finalLength / 2 - 1, finalLength / 2)
      else Seq(finalLength / 2)

    @tailrec
    def findMidElements(
        l1: Seq[Int],
        l2: Seq[Int],
        k: Int = 0,
        acc: Seq[Int] = Seq.empty
    ): Seq[Int] = {
      if (acc.length == midPositions.length)
        acc
      else {
        (l1, l2) match {
          case (Nil, Nil) => Seq.empty
          case (Nil, head2 :: tail2) =>
            val newAcc = if (midPositions.contains(k)) acc :+ head2 else acc
            findMidElements(Nil, tail2, k + 1, newAcc)
          case (head1 :: tail1, Nil) =>
            val newAcc = if (midPositions.contains(k)) acc :+ head1 else acc
            findMidElements(tail1, Nil, k + 1, newAcc)
          case (head1 :: tail1, head2 :: tail2) if head1 <= head2 =>
            val newAcc = if (midPositions.contains(k)) acc :+ head1 else acc
            findMidElements(tail1, l2, k + 1, newAcc)
          case (head1 :: tail1, head2 :: tail2) =>
            val newAcc = if (midPositions.contains(k)) acc :+ head2 else acc
            findMidElements(l1, tail2, k + 1, newAcc)
        }
      }
    }

    if (finalLength > 0) {
      val middleValues = findMidElements(list1, list2)
      middleValues.sum / middleValues.length.toFloat
    } else 0f
  }
}
