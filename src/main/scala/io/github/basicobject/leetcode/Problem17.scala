package io.github.basicobject.leetcode

// Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the
// number could represent. Return the answer in any order.
// A mapping of digit to letters (just like on the telephone buttons) is given below.
// Note that 1 does not map to any letters.

object Problem17 {
  val mapping = Map(
    '2' -> Seq('a', 'b', 'c'),
    '3' -> Seq('d', 'e', 'f'),
    '4' -> Seq('g', 'h', 'i'),
    '5' -> Seq('j', 'k', 'l'),
    '6' -> Seq('m', 'n', 'o'),
    '7' -> Seq('p', 'q', 'r', 's'),
    '8' -> Seq('t', 'u', 'v'),
    '9' -> Seq('w', 'x', 'y', 'z')
  )

  def combinations(str: String): Seq[String] = {
    def charCombination(l: Seq[Char], acc: Seq[Char]): Seq[String] =
      l match {
        case Nil => Seq(acc.mkString)
        case head :: tail =>
          mapping(head).flatMap(c => charCombination(tail, acc :+ c))
      }

    charCombination(str.toList, Seq.empty[Char])
  }
}
