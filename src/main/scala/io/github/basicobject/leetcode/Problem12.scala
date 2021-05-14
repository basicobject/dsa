package io.github.basicobject.leetcode

import scala.annotation.tailrec

//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//  Symbol       Value
//  I             1
//  V             5
//  X             10
//  L             50
//  C             100
//  D             500
//  M             1000
//
//  For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//
//  Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//
//  I can be placed before V (5) and X (10) to make 4 and 9.
//  X can be placed before L (50) and C (100) to make 40 and 90.
//  C can be placed before D (500) and M (1000) to make 400 and 900.
//
//  Given an integer, convert it to a roman numeral.
//  Constraint: 1 <= num <= 3999

object Problem12 {
  def intToRoman(num: Int): String = {

    @tailrec
    def toRoman(n: Int, acc: String = ""): String =
      n match {
        case 0                               => acc
        case 4                               => acc ++ "IV"
        case 5                               => acc ++ "V"
        case 9                               => acc ++ "IX"
        case _ if (1 to 3).contains(n)       => toRoman(n - 1, acc ++ "I")
        case _ if (6 to 8).contains(n)       => toRoman(n - 5, acc ++ "V")
        case _ if (10 to 39).contains(n)     => toRoman(n - 10, acc ++ "X")
        case _ if (40 to 49).contains(n)     => toRoman(n - 40, acc ++ "XL")
        case _ if (50 to 89).contains(n)     => toRoman(n - 50, acc ++ "L")
        case _ if (90 to 99).contains(n)     => toRoman(n - 90, acc ++ "XC")
        case _ if (100 to 399).contains(n)   => toRoman(n - 100, acc ++ "C")
        case _ if (400 to 499).contains(n)   => toRoman(n - 400, acc ++ "CD")
        case _ if (500 to 899).contains(n)   => toRoman(n - 500, acc ++ "D")
        case _ if (900 to 999).contains(n)   => toRoman(n - 900, acc ++ "CM")
        case _ if (1000 to 3999).contains(n) => toRoman(n - 1000, acc ++ "M")
      }

    if ((num <= 0) || (num > 3999))
      throw new RuntimeException(s"Out of range input $num")
    else toRoman(num)
  }
}
