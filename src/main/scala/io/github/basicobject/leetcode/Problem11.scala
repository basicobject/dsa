package io.github.basicobject.leetcode

import scala.annotation.tailrec

//Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
//n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0).
//Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
//Notice that you may not slant the container.

object Problem11 {
  def maxArea(heights: Seq[Int]): Int = {
    @tailrec
    def boxArea(left: Int, right: Int, maxArea: Int): Int = {
      if (left < right) {
        val area = Seq(heights(left), heights(right)).min * (right - left)
        val newArea = if (area > maxArea) area else maxArea

        if (heights(left) < heights(right)) boxArea(left + 1, right, newArea)
        else boxArea(left, right - 1, newArea)

      } else maxArea
    }

    boxArea(0, heights.length - 1, 0)
  }
}
