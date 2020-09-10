package com.company.rohit.session2;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int f = prime(n);

        if(f == 0) {
            System.out.println("Number is prime");
        } else if(f == 1){
            System.out.println("Number is not prime");
        }
    }

    public static int prime(int n) {

        int flag = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        return flag;
    }
}
