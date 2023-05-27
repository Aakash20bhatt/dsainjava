package com.company.dsaArray;

// Given an integer A, find and return the total number of digit 1 appearing in all non-negative integers less than or equal
// to A.

public class number_of_digit_one {
    public int solve(int A){
        int ans = 0;

        for(int i=1; i<=A; i*=10)
        {
            int divider = i*10;
            ans += (A/divider)*i + Math.min(Math.max(A%divider-i+1, 0),i);
        }
        return ans;
    }
}
