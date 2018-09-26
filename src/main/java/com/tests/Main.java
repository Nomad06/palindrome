package com.tests;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter steps limit : ");
    int stepsLimit = sc.nextInt();
    System.out.println("Enter a number : ");
    do {
      int num = sc.nextInt();
      if(num < 0){
        break;
      }
      try {
        System.out.println(PalindromeUtils.getPalindromizeStepsCount(num, stepsLimit));
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
      System.out.println("Enter a number : ");
    }
    while (sc.hasNext());
  }

}
