package com.company.rohit.session4;

// import java.util.Arrays;
//import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
//        String pr1 = "Rohit";
//        String pr2 = "रोहित";

//        System.out.println(pr1 == pr2);
//        System.out.println(pr1.equals(pr2));
//        System.out.println(pr2);

//        char[] arr = pr1.toCharArray();
//        System.out.println(Arrays.toString(arr));
//
//        String names = "Rohit, Hello, Class, Rigging";
//        String[] namesArr = names.split(",");
//        System.out.println(Arrays.toString(namesArr));
//
//        String sent = "This is a sentence";
//
//        for(char ch : sent.toCharArray()) {
//            System.out.println(ch);
//        }
//
//        int[] nums = {3,434,54,5,34,2};
//        for(int num : nums) {
//            System.out.println(num + "");
//        }

        //Scanner s = new Scanner(System.in);
//        int t = Integer.parseInt(s.nextLine());
//        while (t-- > 0) {
//
//            String str = s.next();
//            System.out.println(str);
//        }
        
        String str = "String";
        subStrings(str);
        System.out.println(palindrome(str));
    }

    private static boolean  palindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }

    private static void subStrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <str.length() + 1 ; j++) {
                System.out.println(str.substring(i,j));
            }
        }
    }
}
