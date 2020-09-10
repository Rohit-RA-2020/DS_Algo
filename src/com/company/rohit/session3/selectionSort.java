package com.company.rohit.session3;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] nums = {1, 10, 5, 12, 15, 11};

         selection(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void selection(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i+1; j<n; j++)
                if(nums[j] < nums[min_idx])
                    min_idx = j;
        int temp = nums[min_idx];
        nums[min_idx] = nums[i];
        nums[i] = temp;

        }
    }
}
