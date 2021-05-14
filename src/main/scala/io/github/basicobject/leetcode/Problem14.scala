package io.github.basicobject.leetcode

//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".

object Problem14 {
  def longestCommonPrefix(strings: Seq[String]): String = {
    val len = strings.map(_.length).min
    var i = 0
    while ((i < len) && (strings.map(_(i)).distinct.length == 1)) { i = i + 1 }
    strings.head.substring(0, i)
  }
}
