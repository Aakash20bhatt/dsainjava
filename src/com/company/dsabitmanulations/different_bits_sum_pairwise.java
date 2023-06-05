package com.company.dsabitmanulations;

public class different_bits_sum_pairwise {

    public int solve(int[] A){

        long total = 0;
        long mod = 1000000007;
        long n = A.length;

        for(int i=0; i<32; i++){
            long count=0;
            for(int j=0; j<A.length; j++){
                if((A[j]&(1<<i))>0){
                    count++;
                }
            }
            total += 2* count*(n-count);
            total %=mod;
        }

        return (int)total;
    }
}
