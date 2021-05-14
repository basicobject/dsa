package io.github.basicobject.leetcode

import org.scalatest.MustMatchers.convertToAnyMustWrapper
import org.scalatest.WordSpec

class Problem15Test extends WordSpec {
  "threeSum" should {
    import Problem15._
    "return triplet lists with 0 as triplet sum" in {
      threeSum(Seq(-1, 0, 1, 2, -1, -4)) mustBe Seq(
        Seq(-1, -1, 2),
        Seq(-1, 0, 1)
      )
    }

    "returns empty if there is no triplet with 0 as triplet sum" in {
      threeSum(Seq(1, 0, 1, 2, 1, 4)) mustBe Seq.empty
    }

    "return empty if the input is empty" in {
      threeSum(Seq.empty[Int]) mustBe Seq.empty[Int]
    }
  }
}
