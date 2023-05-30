package com.company.dsabitmanulations;

public class number_of_1bit {

    public int solve(int A) {
        int count = 0;
        for(int i=0; i<32; i++){
            if(((A>>i)&1)==1){
                count++;
            }
        }
        return count;
    }
}
