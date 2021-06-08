package io.github.basicobject.leetcode

import org.scalatest.MustMatchers.convertToAnyMustWrapper
import org.scalatest.WordSpec

class Problem18Test extends WordSpec {
  import Problem18._

  "targetSum" should {
    "return two pointer sum" in {
      targetSum(Seq(-1, 0, 1, -3, 3), 0, 2) mustBe Seq(Seq(-3, 3), Seq(-1, 1))
      targetSum(Seq(-1, 0, 1, 3), 3, 2) mustBe Seq(Seq(0, 3))
      targetSum(Seq(0, 1, 3), 1, 2) mustBe Seq(Seq(0, 1))
    }

    "return three point sum" in {
      targetSum(Seq(-1, 0, 1, -3, 3), 0, 3) mustBe Seq(
        Seq(-3, 0, 3),
        Seq(-1, 0, 1)
      )
    }

    "return four point sum" in {
      targetSum(Seq(-1, 0, 1, -3, 3), 0, 4) mustBe Seq(
        Seq(-3, -1, 1, 3)
      )
    }

    "return five number sum" in {
      targetSum(Seq(-1, 0, 1, -3, 3), 0, 5) mustBe Seq(
        Seq(-3, -1, 0, 1, 3)
      )
    }

    "not return anything if the number of elements is less than count" in {
      targetSum(Seq(-1, 1, -3, 3), 0, 5) mustBe (Nil: Seq[Seq[Int]])
      targetSum(Seq(-1), 0, 2) mustBe (Nil: Seq[Seq[Int]])
      targetSum(Seq(0), 0, 2) mustBe (Nil: Seq[Seq[Int]])
    }

    "not return anything if there are no target sum found" in {
      targetSum(Seq(-1, 1, 4, -3, 3), 6, 2) mustBe (Nil: Seq[Seq[Int]])
    }
  }
}
