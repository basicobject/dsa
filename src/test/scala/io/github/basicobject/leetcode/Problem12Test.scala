package io.github.basicobject.leetcode

import org.scalatest.MustMatchers.convertToAnyMustWrapper
import org.scalatest.WordSpec

class Problem12Test extends WordSpec {
  import Problem12._
  "intToRoman" should {
    "throws exception when 0 is given" in {
      intercept[RuntimeException] { intToRoman(0) }
    }

    "convert 1 to I" in {
      intToRoman(1) mustBe "I"
    }

    "convert 2 to II" in {
      intToRoman(2) mustBe "II"
    }

    "convert 3 to III" in {
      intToRoman(3) mustBe "III"
    }

    "convert 4 to IV" in {
      intToRoman(4) mustBe "IV"
    }

    "convert 5 to V" in {
      intToRoman(5) mustBe "V"
    }

    "convert 6 to VI" in {
      intToRoman(6) mustBe "VI"
    }

    "convert 7 to VII" in {
      intToRoman(7) mustBe "VII"
    }

    "convert 8 to VIII" in {
      intToRoman(8) mustBe "VIII"
    }

    "convert 9 to IX" in {
      intToRoman(9) mustBe "IX"
    }

    "convert 10 to X" in {
      intToRoman(10) mustBe "X"
    }

    "convert 14 to XIV" in {
      intToRoman(14) mustBe "XIV"
    }

    "convert 15 to X" in {
      intToRoman(15) mustBe "XV"
    }

    "convert 20 to XX" in {
      intToRoman(20) mustBe "XX"
    }

    "convert 39 to XXXIX" in {
      intToRoman(39) mustBe "XXXIX"
    }

    "convert 40 to XL" in {
      intToRoman(40) mustBe "XL"
    }

    "convert 49 to XLIX" in {
      intToRoman(49) mustBe "XLIX"
    }

    "convert 50 to L" in {
      intToRoman(50) mustBe "L"
    }

    "convert 60 to LX" in {
      intToRoman(60) mustBe "LX"
    }

    "convert 89 to LXXXIX" in {
      intToRoman(89) mustBe "LXXXIX"
    }

    "convert 90 to XC" in {
      intToRoman(90) mustBe "XC"
    }

    "convert 58 to LVIII" in {
      intToRoman(58) mustBe "LVIII"
    }

    "convert 1994 to MCMXCIV" in {
      intToRoman(1994) mustBe "MCMXCIV"
    }

    "convert 3999 to MMMCMXCIX" in {
      intToRoman(3999) mustBe "MMMCMXCIX"
    }
  }
}
