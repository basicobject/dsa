package io.github.basicobject.leetcode

import org.scalatest.{AsyncWordSpecLike, Matchers}

class Problem21Test extends AsyncWordSpecLike with Matchers {
  import Problem21._

  "merge" should {
    "merge two sorted lists and return a sorted list" in {
      val l1 = Link(1, Link(3, Link(5, Empty)))
      val l2 = Link(2, Link(4, Link(6, Empty)))

      merge(l1, l2) shouldBe Link(
        1,
        Link(2, Link(3, Link(4, Link(5, Link(6, Empty)))))
      )
    }
  }
}
