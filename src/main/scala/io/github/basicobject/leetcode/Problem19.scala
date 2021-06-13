package io.github.basicobject.leetcode

object Problem19 {
  sealed trait LinkedList

  object LinkedList {
    def apply(xs: Int*): LinkedList =
      if (xs.isEmpty) Empty else ListNode(xs.head, apply(xs.tail: _*))
  }
  case class ListNode(x: Int, next: LinkedList) extends LinkedList
  case object Empty extends LinkedList

  def removeFromEnd(list: LinkedList, n: Int): LinkedList = {
    def removeNthFromEndOfList(list: LinkedList): (LinkedList, Int) = {
      list match {
        case ListNode(x, next) =>
          val (l, pos) = removeNthFromEndOfList(next)
          if (pos < n) (list, pos + 1)
          else if (pos == n) (next, pos + 1)
          else (ListNode(x, l), pos + 1)
        case Empty => (list, 1)
      }
    }

    removeNthFromEndOfList(list)._1
  }
}
