package io.github.basicobject.leetcode

import org.scalatest.AsyncWordSpec
import org.scalatest.Matchers.convertToAnyShouldWrapper

class Problem24Test extends AsyncWordSpec {
  import Problem24._

  "swaps the adjacent elements of a list" in {
    val list = LinkedList(1, 2, 3, 4, 5)
    swapPairs(list) shouldBe LinkedList(2, 1, 4, 3, 5)

    swapPairs(Empty) shouldBe Empty

    swapPairs(LinkedList(1)) shouldBe LinkedList(1)
  }
}
