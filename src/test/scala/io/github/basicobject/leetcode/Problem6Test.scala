package io.github.basicobject.leetcode

import org.scalatest.WordSpec
import org.scalatest.MustMatchers.convertToAnyMustWrapper

class Problem6Test extends WordSpec {
  import Problem6._

  "convert should convert the word to zigzag" in {
    convert("PAYPALISHIRING", 3) mustBe "PAHNAPLSIIGYIR"
    convert("PAYPALISHIRING", 4) mustBe "PINALSIGYAHRPI"
  }
}
