package io.github.basicobject.leetcode

object Problem21 {
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
}
