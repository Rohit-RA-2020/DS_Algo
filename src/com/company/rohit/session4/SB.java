package com.company.rohit.session4;

public class SB {
    public static void main(String[] args) {
//        String num = "";
//        for (int i = 0; i < 100; i++) {
//            num += i + " ";
//        }
//        System.out.println(num);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append(i).append(" ");
        }
        System.out.println(builder);
    }
}
