package io.github.basicobject.leetcode

import org.scalatest.AsyncWordSpec

class Problem20Test extends AsyncWordSpec {
  import Problem20._

  "isValid checks if the brackets are valid" in {
    assert(!isValid("(]"))
    assert(isValid("()[]{}"))
    assert(!isValid("([)]"))
    assert(isValid("{[]}"))
  }
}
