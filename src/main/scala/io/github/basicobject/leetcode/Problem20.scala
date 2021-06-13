package io.github.basicobject.leetcode

import scala.collection.mutable

object Problem20 {
  def isValid(str: String): Boolean = {
    val stack = mutable.Stack.empty[Char]

    val map = Map('}' -> '{', ']' -> '[', ')' -> '(')
    var yes = true

    str.forall { c =>
      if (Seq('{', '[', '(').contains(c)) {
        stack.push(c)
        yes
      } else {
        yes = stack.pop() == map(c)
        yes
      }
    }

    yes && stack.isEmpty
  }
}
