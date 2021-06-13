package io.github.basicobject.leetcode

import org.scalatest.AsyncWordSpec
import org.scalatest.MustMatchers.convertToAnyMustWrapper

class Problem19Test extends AsyncWordSpec {
  import Problem19._

  "generates a linked list of integers" in {
    val list = LinkedList(1, 2, 3, 4, 5)
    list mustBe ListNode(
      1,
      ListNode(2, ListNode(3, ListNode(4, ListNode(5, Empty))))
    )
  }

  "removes nth item from the end" in {
    val list = LinkedList(1, 2, 3, 4, 5)
    val newList = removeFromEnd(list, 3)
    newList mustBe ListNode(1, ListNode(2, ListNode(4, ListNode(5, Empty))))
  }
}
