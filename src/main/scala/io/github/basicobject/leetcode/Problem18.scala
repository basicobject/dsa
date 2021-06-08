package io.github.basicobject.leetcode

import scala.annotation.tailrec

object Problem18 extends App {
  private def twoSum(nums: Vector[Int], target: Int): Seq[Seq[Int]] = {
    def twoPointerSum(s: Int, e: Int): Seq[Seq[Int]] = {
      val result = scala.collection.mutable.ListBuffer.empty[Seq[Int]]

      var i = s
      var j = e
      var sum = 0

      while (i < j) {
        sum = nums(i) + nums(j)
        if (target == sum) {
          result.addOne(Seq(nums(i), nums(j)))
          i = i + 1
          j = j - 1
        } else if (target < sum) j = j - 1
        else {
          i = i + 1
        }
      }
      result.toSeq
    }

    if (nums.length < 2) Vector.empty
    else twoPointerSum(0, nums.length - 1)
  }

  private def targetSum(
      nums: Vector[Int],
      target: Int,
      count: Int
  ): Seq[Seq[Int]] = {

    @tailrec
    def findTargetSum(
        numbers: Vector[Int],
        target: Int,
        count: Int,
        acc: Seq[Int]
    ): Seq[Seq[Int]] = {
      if (
        (numbers.take(count).sum > target) ||
        (numbers.takeRight(count).sum < target)
      ) Nil
      else if (count > 2)
        findTargetSum(
          numbers.tail,
          target - numbers.head,
          count - 1,
          acc :+ numbers.head
        )
      else {
        println("Two sum " + numbers + "Target " + target)
        twoSum(numbers, target).map(acc ++ _)
      }
    }

    if (count == 2) twoSum(nums, target)
    else if (count == nums.length)
      if (nums.sum == target) Seq(nums.toSeq) else Nil
    else {
      nums.zipWithIndex.take(nums.length - count + 1).flatMap {
        case (_, i) =>
          findTargetSum(
            nums.drop(i + 1),
            target - nums(i),
            count - 1,
            Seq(nums(i))
          )
      }
    }
  }

  def targetSum(nums: Seq[Int], target: Int, count: Int): Seq[Seq[Int]] =
    targetSum(nums.toVector.sorted, target, count)
}
