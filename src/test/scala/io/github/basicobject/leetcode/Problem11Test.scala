package io.github.basicobject.leetcode

import org.scalatest.MustMatchers.convertToAnyMustWrapper
import org.scalatest.WordSpec

class Problem11Test extends WordSpec {
  import Problem11._
  "returns the max area of the heights array" in {
    maxArea(Seq(1, 8, 6, 2, 5, 4, 8, 3, 7)) mustBe 49
  }
}
