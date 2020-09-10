package com.company.rohit.session3;

public class Binary {
    public static void main(String[] args) {
        int[] nums = {1, 5, 10, 14, 16};

        int ele = 10;
//        int ind = binarySearch(nums, ele);
//        System.out.println(ind);

        System.out.println(maxElement(nums));
    }

    public static int binarySearch(int[] nums, int ele) {
        int start = 0, end = (nums.length - 1);
        while(start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] == ele) {
                return mid;
            } else if (nums[mid] < ele) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static int maxElement(int[] nums) {
        int maxInd = 0;
        for (int i = 1; i < nums.length ; i++) {
            if(nums[maxInd] < nums[i]) {
                maxInd = i;
            }
        }
        return maxInd;
    }
}
