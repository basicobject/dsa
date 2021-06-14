package io.github.basicobject.leetcode

import org.scalatest.{AsyncWordSpecLike, Matchers}

class Problem22Test extends AsyncWordSpecLike with Matchers {
  import Problem22._

  "generateParanthesis" should {
    "generate valid brackets from n pairs of ()" in {
      generateParanthesis(1) shouldBe Seq("()")
      generateParanthesis(2) shouldBe Seq("(())", "()()")
      generateParanthesis(3) shouldBe List(
        "((()))",
        "(()())",
        "(())()",
        "()(())",
        "()()()"
      )
    }
  }
}
