package io.github.basicobject.leetcode

import org.scalatest.MustMatchers.convertToAnyMustWrapper
import org.scalatest.WordSpec

class Problem2Test extends WordSpec {
  "return the number as digit list" in {
    val num1 = 102
    Problem2.toDigitList(num1) mustBe List(2, 0, 1)
  }

  "returns the sum of two digit lists" when {
    "same number of digits" in {
      val list1 = Problem2.toDigitList(234)
      val list2 = Problem2.toDigitList(211)

      Problem2.sum(list1, list2) mustBe List(5, 4, 4)
    }

    "different number of digits" in {
      val list1 = Problem2.toDigitList(234)
      val list2 = Problem2.toDigitList(21)

      Problem2.sum(list1, list2) mustBe List(5, 5, 2)
    }
  }
}
