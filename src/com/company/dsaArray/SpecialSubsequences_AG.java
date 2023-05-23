package com.company.dsaArray;

public class SpecialSubsequences_AG {

    public int solve(String A){

        int n = A.length();
        int count=0;
        int ans=0;

        for(int i=n-1; i>=0; i--){
            if (A.charAt(i) == 'G') {
                count+=1;
            }
            if(A.charAt(i)=='A'){
                ans+=count;
            }
        }

        return ans;
    }
}
