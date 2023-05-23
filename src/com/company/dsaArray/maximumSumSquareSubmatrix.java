package com.company.dsaArray;


// Given a 2D integer matrix A of size N x N, find a B x B submatrix where B<= N and B>= 1, such that the sum of all
// the elements in the submatrix is maximum.

import java.util.Scanner;

public class maximumSumSquareSubmatrix {
    public int solve(int[][] A, int B){
        int i,j,m=A.length,n=A[0].length;
        for(i=1; i<m; i++){
            for(j=0; j<n; j++){
                A[i][j]+=A[i-1][j];
            }
        }
        for(j=1; j<n; j++){
            for(i=0; i<m; i++){
                A[i][j]+=A[i][j-1];
            }
        }
        int maxSum = findMaxSum(A,m-1,n-1,B);
        for(i=m-1; i-B+1>=0; i--){
            for(j=n-1; j-B+1>=0; j--){
                int sumOfMatrix = findMaxSum(A,i,j,B);
                maxSum = Math.max(sumOfMatrix,maxSum);
            }
        }
        return maxSum;
    }

    public int findMaxSum(int[][] A, int i, int j, int B){
        int res = A[i][j];
        if(j-B>=0){
            res-=A[i][j-B];
        }
        if(i-B>=0){
            res-=A[i-B][j];
        }
        if(i-B>=0 && j-B>=0){
            res+=A[i-B][j-B];
        }
        return res;
    }

    public void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        System.out.println("Enter number of columns");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int b = sc.nextInt();
        int ans = solve(arr,b);
        System.out.println(ans);
    }

}
