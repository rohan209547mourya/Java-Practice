import java.io.*;
import java.lang.*;
import java.util.*;

// Given a positive integer N. Find the Nth fibonacci number.

// __NOTE__ : In mathematics, the Fibonacci numbers, commonly denoted Fn, form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. The beginning of the sequence is thus
// `[0,1,2,3,5,8,13,21,34,...]`

class Main{
  //This function returns the Nth fibonacci number.
  public static int nthFibonacci(int n){
    if (n == 0) return 0;
    if (n == 1) return 1;
    return nthFibonacci(n-1) + nthFibonacci(n-2);
  }
  //Main Function
  public static void main(String[] args){
    int n = 4;
    System.out.println(nthFibonacci(n));
  }
}