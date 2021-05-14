package io.github.basicobject.leetcode

import org.scalatest.MustMatchers.convertToAnyMustWrapper
import org.scalatest.WordSpec

class Problem13Test extends WordSpec {
  import Problem13._

  "romanToInt" should {
    "convert number for a valid string input" in {
      romanToInt("III") mustBe 3
    }

    "throws error for invalid chars" in {
      intercept[RuntimeException](romanToInt("ABCD"))
    }

    "throws error for length more than 15" in {
      intercept[RuntimeException](romanToInt("MMMMCDIXIIIVIIIVICDL"))
    }

    "return 9 for input IX" in {
      romanToInt("IX") mustBe 9
    }

    "return 4 for input IV" in {
      romanToInt("IV")
    }

    "return 58 for LVIII" in {
      romanToInt("LVIII") mustBe 58
    }

    "return 1994 for MCMXCIV" in {
      romanToInt("MCMXCIV") mustBe 1994
    }
  }
}
