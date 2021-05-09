package io.github.basicobject.leetcode

//Given a string s, find the length of the longest substring without repeating characters.

object Problem3 {
  def lengthOfLongestSubStr(str: String): Int = {
    val stack = scala.collection.mutable.Stack.empty[Char]
    var i = 0
    var maxLength = 0

    while (i < str.length) {
      var c = str(i)
      if (stack.contains(c)) {
        var length = stack.length
        if (length > maxLength) maxLength = length
        // from current position go back to stack frame start = i - length
        // go forward till the position on repeated char = start + stack.indexOf(c) + 1
        i = i - length + stack.indexOf(c) + 1
        stack.popAll()
      } else {
        stack.push(c)
        i = i + 1
      }
    }

    maxLength
  }
}
