package io.github.basicobject.leetcode

import scala.annotation.tailrec

object Problem1 {
  def twoSum(nums: Vector[Int], target: Int): Option[(Int, Int)] = {

    val sortedNums = nums.sorted

    @tailrec
    def targetSum(i: Int, j: Int): Option[(Int, Int)] = {
      if (i < j) {
        val sum = sortedNums(i) + sortedNums(j)
        if (sum == target) Some((sortedNums(i), sortedNums(j)))
        else if (sum < target) targetSum(i + 1, j)
        else targetSum(i, j - 1)
      } else None
    }

    targetSum(0, nums.length - 1).map {
      case (a, b) => (nums.indexOf(a), nums.indexOf(b))
    }
  }
}
