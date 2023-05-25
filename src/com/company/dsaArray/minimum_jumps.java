package com.company.dsaArray;


//Given an array of non-negative integers A where each element represents your maximum jump length at that position.
//The initial position is the first index of the array, and the goal is to reach the last index of the array with the minimum number of jumps

//Input
//A = [1, 2, 3, 4, 5]
//Output
//3

public class minimum_jumps {
    public int minJumps(int[] A){
        int jump = 0;
        int cur_pos = 0;
        int max_pos = 0;

        for(int i=0; i<A.length; i++){
            if(i>max_pos){
                return -1;
            }

            if(cur_pos<i+A[i]){
                cur_pos = Math.max(cur_pos,i+A[i]);
            }

            if(max_pos>=A.length-1){
                return jump;
            }

            if(max_pos==i){
                jump++;
                max_pos=cur_pos;
            }
        }

        return jump;
    }
}
