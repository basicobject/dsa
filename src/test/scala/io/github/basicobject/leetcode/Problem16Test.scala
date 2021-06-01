package io.github.basicobject.leetcode

import org.scalatest.MustMatchers.convertToAnyMustWrapper
import org.scalatest.WordSpec

class Problem16Test extends WordSpec {
  import Problem16._

  "should return" when {
    "target sum closest to the target" in {
      threeSumClosest(Seq(-1, 2, 1, -4), 1) mustBe 2
      threeSumClosest(Seq(1, 2, 3, 4), 11) mustBe 9
      threeSumClosest(Seq(1, 2, 3, -4), -5) mustBe -1
    }
  }
}
