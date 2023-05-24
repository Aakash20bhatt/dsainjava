package com.company.dsaArray;

// Given an array of integers A of size N that is a permutation of [0, 1, 2, ..., (N-1)].

// It is allowed to swap any two elements (not necessarily consecutive).

// Find the minimum number of swaps required to sort the array in ascending order.

public class minimumSwaps2 {

    public int solve(int[] A){
        int ans = 0;
        for(int i=0; i<A.length; i++){
            while(A[i]!=i){
                int target_val = A[i];
                int temp = A[i];
                A[i] = A[target_val];
                A[target_val] = temp;
                ans++;
            }
        }
        return ans;
    }
}
