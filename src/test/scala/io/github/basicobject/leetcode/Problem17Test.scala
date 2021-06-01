package io.github.basicobject.leetcode

import org.scalatest.MustMatchers.convertToAnyMustWrapper
import org.scalatest.WordSpec

class Problem17Test extends WordSpec {
  import Problem17._

  "combinations" should {
    "return possible combinations" in {
      val a = "23"
      val result = combinations(a)
      result mustBe List("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")
    }
  }
}
