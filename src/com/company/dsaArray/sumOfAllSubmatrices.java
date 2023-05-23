package com.company.dsaArray;

import java.util.Scanner;

public class sumOfAllSubmatrices {

    public static int solve(int[][] A){

        int sum = 0;
        int n = A.length;
        int m = A[0].length;

        for(int i=0; i<n; i++){
            int mul=1;
            for(int j=0; j<m; j++){
                mul = (i+1)*(j+1) *(m-j)*(n-i);
                sum+=A[i][j]*mul;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] A = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                A[i][j] = sc.nextInt();
            }
        }

        int sum = solve(A);
        System.out.println(sum);
    }
}
