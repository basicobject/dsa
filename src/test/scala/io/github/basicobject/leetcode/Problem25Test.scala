package io.github.basicobject.leetcode

import org.scalatest.AsyncWordSpec
import org.scalatest.Matchers.convertToAnyShouldWrapper

class Problem25Test extends AsyncWordSpec {
  import Problem25._

  "reverses k group list" in {
    val list = LinkedList(1, 2, 3, 4, 5)

    reverseKGroup(list, 2) shouldBe LinkedList(2, 1, 4, 3, 5)
    reverseKGroup(list, 3) shouldBe LinkedList(3, 2, 1, 4, 5)
    reverseKGroup(LinkedList(1, 2, 3, 4), 2) shouldBe LinkedList(2, 1, 4, 3)
    reverseKGroup(LinkedList(1, 2, 3, 4, 5, 6), 3) shouldBe
      LinkedList(3, 2, 1, 6, 5, 4)
  }
}
