package io.github.basicobject.leetcode

import org.scalatest.{AsyncWordSpec, Matchers}

class Problem23Test extends AsyncWordSpec with Matchers {
  import Problem23._

  "merge K lists merges n sorted lists" in {
    val lists = Array(
      LinkedList(1, 3, 5),
      LinkedList(2, 4, 6),
      LinkedList(9, 11),
      LinkedList(5, 7)
    )

    mergeKLists(lists) shouldBe LinkedList(1, 2, 3, 4, 5, 5, 6, 7, 9, 11)
  }
}
