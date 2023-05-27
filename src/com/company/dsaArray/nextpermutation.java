package com.company.dsaArray;

// 1 5 8 4 7 6 5 3 1

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
