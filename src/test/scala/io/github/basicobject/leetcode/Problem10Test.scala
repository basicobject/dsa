package io.github.basicobject.leetcode

import org.scalatest.MustMatchers.convertToAnyMustWrapper
import org.scalatest.WordSpec

class Problem10Test extends WordSpec {
  import Problem10._

  "does not matches the pattern" in {
    isMatch("aa", "a") mustBe false
    isMatch("mississippi", "mis*is*p*.") mustBe false
  }

  "matches the pattern" in {
    isMatch("aa", "a*") mustBe true
    isMatch("ab", ".*") mustBe true
    isMatch("aab", "c*a*b") mustBe true
  }
}
