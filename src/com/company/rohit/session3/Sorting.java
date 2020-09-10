package com.company.rohit.session3;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] num = {1,5,2,9,43,26};

        System.out.println(Arrays.toString(num));

        bubbleSort(num);

        System.out.println(Arrays.toString(num));
    }

    private static void bubbleSort(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for(int j = 0; j < num.length - 1 -i; j++) {
               if (num[j] > num[j + 1]) {
                   swap(num, j, j+1);
               }
            }
            
        }
    }

    public static void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;

    }
}
