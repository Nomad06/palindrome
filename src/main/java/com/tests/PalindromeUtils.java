package com.tests;

public class PalindromeUtils {

  private PalindromeUtils(){}

  public static int getPalindromizeStepsCount(int num, int stepsLimit) throws Exception {
    return palindromize(num, 0, stepsLimit);
  }

  private static int palindromize(int num, int stepsCounter, int stepsLimit) throws Exception {
    if(isPalindrome(num)) return 0;

    int reverseNum = reverseNumber(num);
    int resultNum = reverseNum + num;
    stepsCounter++;
    if(stepsCounter <= stepsLimit){
      if(isPalindrome(resultNum)){
        return stepsCounter;
      }
      return palindromize(resultNum, stepsCounter, stepsLimit);
    }
    else {
      throw new Exception(String.format("Making palindrome took more than %d steps", stepsLimit));
    }
  }

  public static boolean isPalindrome(int num){
    return num >= 0 && num < 10 || num == reverseNumber(num);
  }

  private static int reverseNumber(int num){
    return Integer.valueOf(new StringBuilder().append(num).reverse().toString());
  }

}
