package io.github.basicobject.leetcode

import io.github.basicobject.leetcode.Problem21

object Problem23 {
  sealed trait LinkedList

  object LinkedList {
    def apply(xs: Int*): LinkedList =
      if (xs.isEmpty) Empty else Link(xs.head, apply(xs.tail: _*))
  }
  case class Link(get: Int, next: LinkedList) extends LinkedList
  case object Empty extends LinkedList

  def merge(l1: LinkedList, l2: LinkedList): LinkedList = {
    (l1, l2) match {
      case (Empty, Empty) => Empty
      case (_, Empty)     => l1
      case (Empty, _)     => l2
      case (Link(x1, xs1), Link(x2, xs2)) =>
        if (x1 <= x2) Link(x1, merge(xs1, l2))
        else Link(x2, merge(l1, xs2))
    }
  }

  def mergeKLists(lists: Array[LinkedList]): LinkedList = {
    def divideAndMerge(start: Int, end: Int): LinkedList = {
      if (start < end) {
        val mid = (start + end) / 2
        val l = divideAndMerge(start, mid)
        val r = divideAndMerge(mid + 1, end)
        merge(l, r)
      } else lists(start)
    }

    divideAndMerge(0, lists.length - 1)
  }
}
