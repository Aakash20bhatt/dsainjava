package com.company.dsaArray;

import java.util.Arrays;
import java.util.Scanner;

public class AddOneToNumber {
 
    public static int[] addOneToNum(int[] A){
        int count = 0 ;

        for(int i=0; i<A.length; i++){
            if(A[i]!=0){
                break;
            }
            count++;
        }
        if(count>0){
            int[] newArray = new int[A.length-count];
            int k = 0;
            for(int i=count ; i<A.length ; i++){
                newArray[k] = A[i];
                k++;
            }
            A = newArray;
        }

        int i=A.length-1;
        while(i>=0){
            if(A[i]<9){
                A[i]++;
                return A;
            }
            A[i]=0;
            i--;
        }

        int[] newArray = new int[A.length+1];
        newArray[0] = 1;
        return newArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        int[] ans = addOneToNum(A);

        System.out.println(Arrays.toString(ans));

    }
}
