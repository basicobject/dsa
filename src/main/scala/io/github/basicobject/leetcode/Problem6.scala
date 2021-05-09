package io.github.basicobject.leetcode

/*
   The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
   (you may want to display this pattern in a fixed font for better legibility)

    P   A   H   N
    A P L S I I G
    Y   I   R

    And then read line by line: "PAHNAPLSIIGYIR"
    Write the code that will take a string and make this conversion given a number of rows:
    string convert(string s, int numRows);
 */

import scala.collection.mutable

object Problem6 {
  def convert(str: String, numberOfRows: Int): String = {
    val rows: Vector[mutable.Queue[Char]] =
      Vector.fill(numberOfRows) {
        mutable.Queue.empty[Char]
      }

    val getAdder = (k: Int, current: Int) => {
      k match {
        case _ if k == 0                  => 1
        case _ if k == (numberOfRows - 1) => -1
        case _                            => current
      }
    }

    var j = 0
    var adder = 1

    for (i <- 0 until str.length) {
      rows(j).addOne(str(i))
      adder = getAdder(j, adder)
      j = j + adder
    }

    println(rows)

    rows.map(_.mkString("")).mkString("")
  }
}
