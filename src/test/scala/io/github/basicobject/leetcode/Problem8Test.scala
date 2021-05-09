package io.github.basicobject.leetcode

import org.scalatest.MustMatchers.convertToAnyMustWrapper
import org.scalatest.WordSpec

class Problem8Test extends WordSpec {
  import Problem8._

  "it converts a +ve number string to integer" in {
    myAtoi("+123") mustBe 123
    myAtoi("123") mustBe 123
  }

  "it converts a -ve number string to integer" in {
    myAtoi("-123") mustBe -123
  }

  "it converts 0 string to integer" in {
    myAtoi("000") mustBe 0
  }

  "it converts 027ab string to integer" in {
    myAtoi("027ab") mustBe 27
  }

  "it converts string to integer" in {
    myAtoi("027ab") mustBe 27
  }

  """it converts "  + 23 6" to integer""" in {
    myAtoi("  + 23 6") mustBe 0
  }

  """it converts "  -23 6" to integer""" in {
    myAtoi("  -23 6") mustBe -23
  }

  """it converts "32 ok" to integer""" in {
    myAtoi("32 ok") mustBe 32
  }
}
