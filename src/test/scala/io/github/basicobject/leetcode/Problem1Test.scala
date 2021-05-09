package io.github.basicobject.leetcode

import org.scalatest.MustMatchers.convertToAnyMustWrapper
import org.scalatest.WordSpec

class Problem1Test extends WordSpec {
  "twoSum returns indices of numbers" when {
    "target sum is found" in {
      Problem1.twoSum(Vector(4, 3, 2, 1, 5), 9) mustBe Some(0, 4)
    }

    "target sum is not found" in {
      Problem1.twoSum(Vector(4, 3, 2, 1, 5), 11) mustBe None
    }
  }
}
