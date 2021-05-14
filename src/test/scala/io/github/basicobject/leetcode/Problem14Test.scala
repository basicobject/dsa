package io.github.basicobject.leetcode

import org.scalatest.MustMatchers.convertToAnyMustWrapper
import org.scalatest.WordSpec

class Problem14Test extends WordSpec {
  import Problem14._

  "#longestCommonPrefix" should {
    "return longest common prefix" when {
      "a set of strings are inputed" in {
        longestCommonPrefix(Seq("flower", "flow", "flight")) mustBe "fl"
      }
    }

    "returns empty when there is no common substring" in {
      longestCommonPrefix(Seq("dog", "racecar", "car")) mustBe ""
    }
  }
}
