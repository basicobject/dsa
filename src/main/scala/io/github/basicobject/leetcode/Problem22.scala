package io.github.basicobject.leetcode

object Problem22 {
  def generateParanthesis(n: Int): Seq[String] = {
    val validList = scala.collection.mutable.ListBuffer.empty[String]

    def generate(
        str: String,
        left: Int,
        right: Int
    ): Unit = {
      if (left == 0 && right == 0) { validList.addOne(str) }
      else if (left > right) ()
      else {
        if (left > 0) generate(str ++ "(", left - 1, right)
        if (right > 0) generate(str ++ ")", left, right - 1)
      }
    }

    generate("(", n - 1, n)
    validList.toList
  }
}
