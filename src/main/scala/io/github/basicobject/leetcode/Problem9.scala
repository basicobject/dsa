package io.github.basicobject.leetcode

//Given an integer x, return true if x is palindrome integer.
//An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

object Problem9 {
  def isPalindrome(str: String): Boolean = {
    val num = Problem8.myAtoi(str)
    num == Problem7.reverseInt(num)
  }
}
