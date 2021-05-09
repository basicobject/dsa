package io.github.basicobject.leetcode

import org.scalatest.MustMatchers.convertToAnyMustWrapper
import org.scalatest.WordSpec

class Problem4Test extends WordSpec {
  import Problem4._

  "returns the median" when {
    "the total array length is odd" in {
      medianOfSortedArrays(Seq(1, 2, 3), Seq(4, 5)) mustBe 3
      medianOfSortedArrays(Seq(1), Seq()) mustBe 1f
    }

    "the total array length is even" in {
      medianOfSortedArrays(Seq(1, 2, 3), Seq(4, 5, 6)) mustBe 3.5f
      medianOfSortedArrays(Seq(), Seq()) mustBe 0f
    }
  }
}
