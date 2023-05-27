package com.company.dsaArray;
//Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers for a given array A of size N.
//
//If such arrangement is not possible, it must be rearranged as the lowest possible order, i.e., sorted in ascending order.
//
//NOTE:
//
//The replacement must be in-place, do not allocate extra memory.
//DO NOT USE LIBRARY FUNCTION FOR NEXT PERMUTATION. Use of Library functions will disqualify your submission retroactively and will give you penalty points.

public class nextpermutation {

    public int[] solve(int[] A){
        int l=0, index=0;
        int n=A.length-1;
        int max_index=0;

        if(A.length<=1){
            return A;
        }

        // 1 5 8 4 7 6 5 3 1

        for(int i=1; i<A.length; i++){
            if(A[i]>A[i-1]) max_index=i; // 2;
        }

        if(max_index!=0){
            for(int i=max_index; i<A.length; i++){
                if(A[i]>A[max_index-1]){
                    index=i;
                }
            }

            swap(A,max_index-1, index);
            l=max_index;
        }

        while(l<=n){
            swap(A,l,n);
            l++;
            n--;
        }

        return A;
    }

    public void swap(int[] A, int max_index, int index){
        int temp = A[max_index];
        A[max_index] = A[index];
        A[index] = temp;
    }
}
