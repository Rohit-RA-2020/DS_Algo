package com.company.rohit.session3;

import java.util.Arrays;
//import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
        int[] nums = {1, 6, 2, 9, 4, 2};

//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = s.nextInt();
//        }

        System.out.println(Arrays.toString(nums));
        int ele = 6;
        int ind = linearSearch(nums, ele);

        System.out.println(ind);
    }

    public static int linearSearch(int[] nums, int ele) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ele) {
                return i;
            }
        }
        return -1;
    }
}
