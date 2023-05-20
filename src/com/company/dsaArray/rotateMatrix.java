package com.company.dsaArray;

import java.util.Scanner;

public class rotateMatrix {

    public static void rotate2DMatrix(int[][] A){
        int col = A[0].length;
        int row = A.length;

        for(int i=0; i<row; i++){
            for(int j=i+1; j<col; j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col/2; j++){
                int temp = A[i][j];
                A[i][j] = A[i][col-1-j];
                A[i][col-1-j] = temp;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Row");
        int row = sc.nextInt();
        System.out.println("Enter Length of Column");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        rotate2DMatrix(arr);

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
