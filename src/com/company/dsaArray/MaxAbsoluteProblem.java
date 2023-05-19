package com.company.dsaArray;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MaxAbsoluteProblem {
    public static int maxArr(int[] A){
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i=0; i<A.length; i++){
            max1 = Math.max(max1, A[i]+i);
            min1 = Math.min(min1, A[i]+i);
            max2 = Math.max(max2, A[i]-i);
            min2 = Math.min(min2, A[i]-i);

        }

        return Math.max(max1-min1, max2-min2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int a = sc.nextInt();

        int[] arr = new int[a];

        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }

        int ans = maxArr(arr);

        System.out.println("Answer is : "+ ans);

    }
}
