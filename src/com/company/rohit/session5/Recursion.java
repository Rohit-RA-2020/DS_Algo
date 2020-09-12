package com.company.rohit.session5;

public class Recursion {
    public static void main(String[] args) {
//        int n = 6;
//      print(n);

        System.out.println(factorial(5));
        int[] nums = {2,5,1,4,34,3};
        System.out.println(find(nums, 3, 0));
      }

    public static boolean find(int[] nums, int ele, int ind){
        if(ind == nums.length) {
            return false;
        }

        if (nums[ind] == ele){
            return true;
        }

       return find(nums, ele, ind+1);
    }

    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }

//    public static void print(int n) {
//
//          if(n == -50000) {
//              return;
//          }
//        System.out.println(n);
//        print(n-1);
//    }
}
