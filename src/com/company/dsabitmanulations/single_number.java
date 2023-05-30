package com.company.dsabitmanulations;

public class single_number {

    public int solve(int[] A){
        int n = A.length;
        int ans=A[0];

        for(int i=1; i<n; i++){
            ans ^= A[i];
        }
 
        return ans;
    }
}
