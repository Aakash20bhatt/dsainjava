package com.company.dsabitmanulations;

// Given an array A. For every pair of indices i and j (i != j), find the maximum A[i] & A[j].
//Input 1:-
//A = [53, 39, 88]
//Output 1:-
//37
//Explanation 1:-
//53 & 39 = 37
//39 & 88 = 0
//53 & 88 = 16
//Maximum among all these pairs is 37

public class maximumAndPair {
    public boolean checkBit(int a, int pos){
        if(((a>>pos)&1)==1){
            return true;
        }
        return false;
    }

    public int solve(int[] A){
        int ans = 0;

        for(int i=31; i>=0; i--){
            int count = 0;
            for(int j=0; j<A.length; j++){
                if(checkBit(A[j],i)){
                    count++;
                }
            }

            if(count>=2){
                ans = ans | (1<<i);
                for(int j=0; j<A.length; j++){
                    if(!checkBit(A[j],i)){
                        A[j]=0;
                    }
                }
            }
        }

        return ans;
    }
}
