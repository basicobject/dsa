package io.github.basicobject.leetcode

// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that
// i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.

object Problem15 {
  def threeSum(nums: Seq[Int]): Seq[Seq[Int]] = {

    def targetSum0(
        el: Int,
        tail: List[Int],
        triplets: Seq[Seq[Int]]
    ): Seq[Seq[Int]] = {
      var i = 0
      var j = tail.length - 1
      val mutList = scala.collection.mutable.ArrayBuffer.empty[Seq[Int]]

      while (i < j) {
        if (el + tail(i) + tail(j) == 0) {
          if (!triplets.contains(Seq(el, tail(i), tail(j))))
            mutList.addOne(Seq(el, tail(i), tail(j)))
          i = i + 1
        } else if (el + tail(i) + tail(j) > 0) j = j - 1
        else i = i + 1
      }

      triplets ++ mutList.toSeq
    }

    def findSum(arr: Seq[Int], triplets: Seq[Seq[Int]]): Seq[Seq[Int]] =
      arr match {
        case Nil         => triplets
        case head :: Nil => triplets
        case head :: tail =>
          val newTriplets = targetSum0(head, tail, triplets)
          findSum(tail, newTriplets)
      }

    findSum(nums.sorted, Seq.empty)
  }
}
