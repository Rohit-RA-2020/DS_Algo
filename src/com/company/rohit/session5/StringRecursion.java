package com.company.rohit.session5;
// Valid SubSeq program
public class StringRecursion {
    public static void main(String[] args) {
         String str = "abc";
         subsec("", str);
    }

    public static void subsec(String proc, String unproc) {
        if(unproc.isEmpty()) {
            System.out.println(proc);
            return;
        }

        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);

        subsec(proc+ch, unproc);
        subsec(proc, unproc);
    }
}
