package com.company.dsabitmanulations;

public class addTwoBinary {
    public String solve(String A, String B){

        int carry = 0;
        String str = "";
        int maxl = Math.max(A.length(), B.length());

        for(int i=0; i<maxl; i++){
            int a = i<A.length()?A.charAt(A.length()-i-1)-'0':0;
            int b = i<B.length()?B.charAt(B.length()-i-1)-'0':0;

            int sum = a+b+carry;

            carry = sum/2;

            str = sum%2+str;

        }

        return carry==0?str:"1"+str;
    }
}
