package io.github.basicobject.leetcode

import org.scalatest.MustMatchers.convertToAnyMustWrapper
import org.scalatest.WordSpec

class Problem9Test extends WordSpec {
  import Problem9._

  "check if a number is palindrom" in {
    isPalindrome("121") mustBe true
  }
}
