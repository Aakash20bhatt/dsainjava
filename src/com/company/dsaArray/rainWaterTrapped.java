package com.company.dsaArray;
import java.util.Scanner;

public class rainWaterTrapped {

    public static int trap(int[] A){
        int[] pre = new int[A.length];
        int[] suf = new int[A.length];

        int max1= A[0];
        int max2 = A[A.length-1];
        suf[A.length-1] = A[A.length-1];
        int ans = 0;
        for(int i=0; i<A.length; i++){
            if(max1<A[i]){
                max1=A[i];
            }
            pre[i]=max1;
        }
        for(int i=A.length-1; i>=0; i--){
            if(max2<A[i]){
                max2=A[i];
            }
            suf[i] = max2;
        }
        for(int i=1; i<A.length-1; i++){
            int sup = Math.min(pre[i-1],suf[i+1]);
            int water = A[i]-sup;
            if(water>0){
               ans+=water;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of the Array: ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int ans = trap(arr);

        System.out.println(ans);

    }
}
