package com.tests;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeUtilsTest {

  @Test
  public void getStepsCountTest() throws Exception {
    final int STEPS_LIMIT = 20;
    int steps = PalindromeUtils.getPalindromizeStepsCount(47, STEPS_LIMIT);
    Assert.assertEquals(steps, 1);
    steps = PalindromeUtils.getPalindromizeStepsCount(79, STEPS_LIMIT);
    Assert.assertEquals(steps, 6);
  }

  @Test(expected = Exception.class)
  public void getStepsCountOverheadStepsLimitTest() throws Exception {
    final int STEPS_LIMIT = 5;
    PalindromeUtils.getPalindromizeStepsCount(79, STEPS_LIMIT);
  }

  @Test
  public void isPalindromeTest(){
    Assert.assertTrue(PalindromeUtils.isPalindrome(474));
    Assert.assertTrue(!PalindromeUtils.isPalindrome(47));
  }
}
