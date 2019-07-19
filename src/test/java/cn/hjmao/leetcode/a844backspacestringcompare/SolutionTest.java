package cn.hjmao.leetcode.a844backspacestringcompare;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testBackspaceCompare1() {
    String s = "ab#c";
    String t = "ad#c";
    boolean actual = solution.backspaceCompare(s, t);
    assertTrue(actual);
  }

  @Test
  public void testBackspaceCompare2() {
    String s = "ab##";
    String t = "c#d#";
    boolean actual = solution.backspaceCompare(s, t);
    assertTrue(actual);
  }

  @Test
  public void testBackspaceCompare3() {
    String s = "a##c";
    String t = "#a#c";
    boolean actual = solution.backspaceCompare(s, t);
    assertTrue(actual);
  }

  @Test
  public void testBackspaceCompare4() {
    String s = "a#c";
    String t = "b";
    boolean actual = solution.backspaceCompare(s, t);
    assertFalse(actual);
  }
}