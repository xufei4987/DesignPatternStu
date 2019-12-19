package com.youxu;

public class Test {
    public static void main(String[] args) {
        String s1 = "12";
        String s2 = "34";
        String s3 = "1234";
        String s4 = s1 + s2;
        String s5 = (s1 + s2).intern();

        System.out.println(s3 == s4);

        System.out.println(s3 == s5);
    }
}
