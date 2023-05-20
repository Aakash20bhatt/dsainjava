package com.company.dsaArray;

import java.util.Scanner;

public class maxSumContiguousSubarray {

    public static int maxSubArray(int[] A){

        int sum = 0;
        int max_Sum = Integer.MIN_VALUE;

        for(int i=0; i<A.length; i++){

            sum+=A[i];

            if(sum>max_Sum){
                max_Sum = sum;
            }

            if(sum<0){
                sum=0;
            }
        }

        return max_Sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of the Array: ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int ans = maxSubArray(arr);

        System.out.println(ans);
    }
}
