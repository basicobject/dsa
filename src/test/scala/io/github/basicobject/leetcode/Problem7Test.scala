package io.github.basicobject.leetcode

import org.scalatest.WordSpec
import org.scalatest.MustMatchers.convertToAnyMustWrapper

class Problem7Test extends WordSpec {
  import Problem7._

  "reverse a positive number" in {
    reverseInt(123) mustBe 321
  }

  "reverse a negative number" in {
    reverseInt(-123) mustBe -321
  }

  "returns 0 if the reversed number is bigger than MaxInt" in {
    reverseInt(Int.MaxValue) mustBe 0
  }

  "returns 0 if the reversed number is smaller than SmallInt" in {
    reverseInt(Int.MinValue) mustBe 0
  }
}
