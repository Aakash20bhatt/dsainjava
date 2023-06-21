package com.company.dsabitmanulations;


import java.util.Arrays;
import java.util.Scanner;

//Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
//Find the two integers that appear only once.
//
//Note: Return the two numbers in ascending order.


public class twounique {
    public static int[] solve(int[] A){
        int[] ans = new int[2];
        int xor = 0;
        for(int i: A){
            xor = xor^i;
        }

        int rsb = xor & -xor;

        int set = 0;
        int unset = 0;

        for(int i:A){
            if((i&rsb)==0){
                unset = unset^i;
            }else{
                set = set^i;
            }
        }
        ans[0]=unset;
        ans[1]=set;

        Arrays.sort(ans);

        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int[] res = solve(arr);

        System.out.println(Arrays.toString(res));
    }
}
