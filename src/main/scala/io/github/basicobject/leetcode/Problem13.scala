package io.github.basicobject.leetcode

// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
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
//  For example, 2 is written as II in Roman numeral, just two one's added together.
//  12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//
//  Roman numerals are usually written largest to smallest from left to right. However, the numeral for four
//  is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it
//  making four. The same principle applies to the number nine, which is written as IX. There are six instances
//  where subtraction is used:
//
//  I can be placed before V (5) and X (10) to make 4 and 9.
//  X can be placed before L (50) and C (100) to make 40 and 90.
//  C can be placed before D (500) and M (1000) to make 400 and 900.
//
//  Given a roman numeral, convert it to an integer.

// 1 <= s.length <= 15
// s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
// It is guaranteed that s is a valid roman numeral in the range [1, 3999].

object Problem13 {
  def romanToInt(s: String): Int = {
    def toInt(roman: String, num: Int): Int =
      roman match {
        case s"M$tail"  => toInt(tail, num + 1000)
        case s"CM$tail" => toInt(tail, num + 900)
        case s"D$tail"  => toInt(tail, num + 500)
        case s"CD$tail" => toInt(tail, num + 400)
        case s"C$tail"  => toInt(tail, num + 100)
        case s"XC$tail" => toInt(tail, num + 90)
        case s"L$tail"  => toInt(tail, num + 50)
        case s"XL$tail" => toInt(tail, num + 40)
        case s"X$tail"  => toInt(tail, num + 10)
        case s"IX$tail" => toInt(tail, num + 9)
        case s"V$tail"  => toInt(tail, num + 5)
        case s"IV$tail" => toInt(tail, num + 4)
        case s"I$tail"  => toInt(tail, num + 1)
        case ""         => num
      }

    if (
      (s.length <= 15) && s
        .forall(c => Seq('I', 'V', 'X', 'L', 'C', 'D', 'M').contains(c))
    ) {
      toInt(s, 0)
    } else throw new RuntimeException("Invalid roman number")
  }
}
