package io.github.basicobject.leetcode

object Problem24 {
  sealed trait LinkedList
  object LinkedList {
    def apply(xs: Int*): LinkedList =
      if (xs.isEmpty) Empty else Link(xs.head, apply(xs.tail: _*))
  }

  case class Link(x: Int, next: LinkedList) extends LinkedList
  case object Empty extends LinkedList

  def swapPairs(list: LinkedList): LinkedList =
    list match {
      case Empty                => Empty
      case Link(x, Empty)       => list
      case Link(x, Link(y, xs)) => Link(y, Link(x, swapPairs(xs)))
    }
}
