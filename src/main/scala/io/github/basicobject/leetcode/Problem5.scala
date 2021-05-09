package io.github.basicobject.leetcode
//Given a string s, return the longest palindromic substring in s.
object Problem5 {
  def longestPalindromicSubStr(str: String): String = {
    var l = 0
    var r = 0
    var maxLengthStr = ""

    for (i <- 0 until str.length) {
      l = i
      r = i
      // if adjacent chars are same group them
      while ((r < str.length - 1) && (str(l) == str(r + 1))) { r = r + 1 }
      // move to left and right of the group
      l = l - 1
      r = r + 1
      // keep moving to left and right while they match
      while ((l > -1) && (r < str.length) && (str(l) == str(r))) {
        l = l - 1
        r = r + 1
      }
      // once the boundary letters doesn't match reset the boundaries to the last matched positions
      l = l + 1
      r = r - 1

      if (maxLengthStr.length < (r - l + 1))
        maxLengthStr = str.substring(l, r + 1)
    }

    maxLengthStr
  }
}
