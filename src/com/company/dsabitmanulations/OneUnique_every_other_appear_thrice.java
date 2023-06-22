package com.company.dsabitmanulations;

import java.util.Scanner;

//Given an array of integers, every element appears thrice except for one, which occurs once.
//
//Find that element that does not appear thrice.
//
//NOTE: Your algorithm should have a linear runtime complexity.
//
//Could you implement it without using extra memory?

public class OneUnique_every_other_appear_thrice {

    public static boolean checkBit(int a, int pos){
        if(((a>>pos)&1)==1){
            return true;
        }
        return false;
    }
    public static int solve(int[] A){

        int n = A.length;
        int ans = 0;

        for(int i=0; i<32; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(checkBit(A[j],i)){
                    count++;
                }
            }

            count = count%3;
            ans = ans+count*(1<<i);
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] A = new int[n];
        for(int i=0; i<n; i++){
            A[i]=sc.nextInt();
        }

        int ans = solve(A);

        System.out.println(ans);
    }
}
