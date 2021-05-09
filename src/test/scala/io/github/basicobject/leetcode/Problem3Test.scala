package io.github.basicobject.leetcode

import org.scalatest.MustMatchers.convertToAnyMustWrapper
import org.scalatest.WordSpec

class Problem3Test extends WordSpec {
  "should return longest non repeating substring length" in {
    Problem3.lengthOfLongestSubStr("bbbbbbbbb") mustBe 1
    Problem3.lengthOfLongestSubStr("pwwkew") mustBe 3
//    Problem3.lengthOfLongestSubStr("") mustBe 0
  }
}
