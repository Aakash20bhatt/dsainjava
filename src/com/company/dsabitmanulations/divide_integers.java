package com.company.dsabitmanulations;

// Problem Description
// Divide two integers without using multiplication, division and mod operator.

// Return the floor of the result of the division.

// Also, consider if there can be overflow cases i.e output is greater than INT_MAX, return INT_MAX.

// NOTE: INT_MAX = 2^31 - 1

public class divide_integers {

    public int solve(int A, int B){
        long n = A;
        long m = B;

        int sign = 1;

        if((n<0 && m>=0) || (m<0 && n>=0)){
            sign=-1;
        }

        n = Math.abs(n);
        m = Math.abs(m);

        long t = 0;
        long q = 0;

        for(int i=31; i>=0; i--){
            if(t+(m<<i)<=n){
                t+=m<<i;
                q|=(long)1<<i;
            }
        }

        if(sign<0){
            q=-q;
        }

        if(q>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else{
            return (int)q;
        }
    }
}
