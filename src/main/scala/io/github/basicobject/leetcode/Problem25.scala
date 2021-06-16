package io.github.basicobject.leetcode

import scala.annotation.tailrec

object Problem25 {
  sealed trait LinkedList
  object LinkedList {
    def apply(xs: Int*): LinkedList =
      if (xs.isEmpty) Empty else Link(xs.head, apply(xs.tail: _*))
  }

  case class Link(x: Int, next: LinkedList) extends LinkedList
  case object Empty extends LinkedList

  def reverseKGroup(list: LinkedList, k: Int): LinkedList = {
    @tailrec
    def findAndReverse(
        l: LinkedList,
        acc: List[Int],
        n: Int,
        solList: List[Int]
    ): LinkedList =
      l match {
        case Link(x, xs) if n > 0 =>
          findAndReverse(xs, x :: acc, n - 1, solList)
        case Link(x, xs) if n == 0 =>
          findAndReverse(xs, List(x), k - 1, solList ++ acc)
        case Empty if n == 0 => LinkedList.apply((solList ++ acc): _*)
        case Empty           => LinkedList.apply((solList ++ acc.reverse): _*)
        case _               => Empty
      }

    findAndReverse(list, List.empty[Int], k, List.empty[Int])
  }
}
