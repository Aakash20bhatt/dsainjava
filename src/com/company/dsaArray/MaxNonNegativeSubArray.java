package com.company.dsaArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaxNonNegativeSubArray {

    public static ArrayList<Integer> maxSubArray(ArrayList<Integer> A){

        int n = A.size();
        long maxSum = 0;
        long newSum = 0;
        ArrayList<Integer> newArray = new ArrayList<>();
        ArrayList<Integer> maxArray = new ArrayList<>();

        for(int i=0; i<n; i++){

            if(A.get(i) >= 0){
                newSum+=A.get(i);
                newArray.add(A.get(i));
            }else{
                newSum = 0;
                newArray = new ArrayList<>();
            }

            if(maxSum<newSum || (maxSum==newSum && newArray.size() > maxArray.size())){
                maxSum=newSum;
                maxArray=newArray;
            }
        }
        return maxArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            arr.add(a);
        }

        ArrayList<Integer> ans = maxSubArray(arr);

        for(int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }
}
