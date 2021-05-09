package io.github.basicobject.leetcode

import org.scalatest.MustMatchers.convertToAnyMustWrapper
import org.scalatest.WordSpec

class Problem5Test extends WordSpec {
  import Problem5._
  "returns longest palindromic substring" when {
    "emty string" in {
      longestPalindromicSubStr("") mustBe ""
    }

    "single char string" in {
      longestPalindromicSubStr("a") mustBe "a"
    }

    "for a string input" in {
      longestPalindromicSubStr("babad") mustBe "bab"
      longestPalindromicSubStr("cbbd") mustBe "bb"
      longestPalindromicSubStr("bbb") mustBe "bbb"
      longestPalindromicSubStr("bbbb") mustBe "bbbb"
      longestPalindromicSubStr("ab") mustBe "a"
      longestPalindromicSubStr("abb") mustBe "bb"
    }
  }
}
