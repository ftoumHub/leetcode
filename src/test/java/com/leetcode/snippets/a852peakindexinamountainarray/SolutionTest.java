package com.leetcode.snippets.a852peakindexinamountainarray;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testPeakIndexInMountainArray1() {
    int[] a = {0, 1, 0};
    int expect = 1;
    int actual = solution.peakIndexInMountainArray(a);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testPeakIndexInMountainArray2() {
    int[] a = {0,2,1,0};
    int expect = 1;
    int actual = solution.peakIndexInMountainArray(a);
    assertEquals(actual, expect);
  }
}
