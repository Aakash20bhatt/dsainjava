package com.company.dsaArray;

// Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the
// numbers less than or equal to B together.

public class minimumSwaps {

    public int solve(int[] A, int B){
        int count = 0;
        int ans = Integer.MAX_VALUE;

        for(int i=0; i<A.length; i++){
            if(A[i]<=B){
                count+=1;
            }
        }

        if(count<=1) return 0;
        else{
            int l=0;
            int r=0;
            int x=0;

            while(r<count){
                if(A[r]>B){
                    x++;
                }
                r++;
            }

            ans = x;

            while(r<A.length){
                if(A[r]>B){
                    x++;
                }
                if(A[l]>B){
                    x--;
                }

                r++;
                l++;

                ans=Math.min(x,ans);
            }

            return ans;
        }


    }
}
