package com.company.dsaArray;


import java.util.Scanner;

public class FirstMissingInteger {

    public static int firstMissingPositive(int[] ar){

        int n = ar.length;
        for(int i=0; i<n; i++){
            if(ar[ar[i]-1]!=ar[i]-1){
                int temp = ar[ar[i]-1];
                ar[ar[i]-1] = ar[i];
                ar[i] = temp;
                i--;
            }
        }

        int res = ar.length;

        for(int i=0; i<ar.length; i++){
            if(ar[i]!=i+1) return i+1;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];

        for(int i=0; i<n; i++){
            ar[i] = sc.nextInt();
        }

        int ans = firstMissingPositive(ar);
        System.out.println(ans);

    }
}
