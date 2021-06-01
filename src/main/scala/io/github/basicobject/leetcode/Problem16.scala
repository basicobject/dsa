package io.github.basicobject.leetcode

import scala.annotation.tailrec

// Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to
// target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

object Problem16 {
  def threeSumClosest(nums: Seq[Int], target: Int): Int = {
    def twoSum(el: Int, tail: Seq[Int], closestSum: Int): Int = {
      var i = 0
      var j = tail.length - 1
      var sum = 0
      var newClosestSum = closestSum

      while (i < j) {
        sum = el + tail(i) + tail(j)

        if (math.abs(sum - target) < math.abs(newClosestSum - target))
          newClosestSum = sum

        if (sum < target) i = i + 1
        else j = j - 1
      }

      newClosestSum
    }

    @tailrec
    def targetSum(arr: Seq[Int], closest: Int): Int =
      arr match {
        case head :: tail =>
          val newClosest = twoSum(head, tail, closest)
          targetSum(tail, newClosest)
        case Nil => closest
      }

    targetSum(nums.sorted, nums.sorted.take(3).sum)
  }
}
