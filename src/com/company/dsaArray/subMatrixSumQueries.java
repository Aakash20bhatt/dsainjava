package com.company.dsaArray;


// Given a matrix and queries, b,c(top,left) , d,e(bottom,right)

import java.util.Arrays;

public class subMatrixSumQueries {

    public static int[] solve(int[][] arr, int[] b, int[] c, int[] d, int[] e){

        int[] ans = new int[b.length];
        long[][] psa = getPrefixSum(arr);
        long mod = 1000000007;

        for(int i=0; i<b.length; i++){

            int x1 = b[i]-1;
            int y1 = c[i]-1;
            int x2 = d[i]-1;
            int y2 = e[i]-1;

            long sum = psa[x2][y2];
            if(x1>0){
                sum-=psa[x1-1][y2];
            }
            if(y1>0){
                sum-=psa[x2][y1-1];
            }

            if(x1>0 && y1>0){
                sum+=psa[x1-1][y1-1];
            }

            if(sum%mod<0){
                sum=(sum%mod+mod)%mod;
                ans[i] = (int)sum;
            }else{
                ans[i]= (int)(sum%mod);
            }
        }

        return ans;
    }

    public static long[][] getPrefixSum(int[][] arr){

        long[][] sum = new long[arr.length][arr[0].length];
        sum[0][0]=arr[0][0];
        for(int i=1; i<arr.length; i++){
            sum[i][0] = arr[i][0]+sum[i-1][0];
        }

        for(int i=1; i<arr[0].length; i++){
            sum[0][i] = arr[0][i]+sum[0][i-1];
        }

        for(int i=1 ; i<arr.length; i++){
            for(int j=1; j<arr[0].length; j++){
                sum[i][j]=sum[i-1][j]+sum[i][j-1]+arr[i][j]-sum[i-1][j-1];
            }
        }

        return sum;

    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[] b = {1,2};
        int[] c = {1,2};
        int[] d = {2,3};
        int[] e = {2,3};

        int[] ans = solve(arr,b,c,d,e);


        System.out.println(Arrays.toString(ans));


    }
}
