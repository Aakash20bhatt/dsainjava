package com.company.dsabitmanulations;

// Interesting Array

// You have an array A with N elements. We have two types of operation available on this array :
// We can split an element B into two elements, C and D, such that B = C + D.
// We can merge two elements, P and Q, to one element, R, such that R = P ^ Q i.e., XOR of P and Q.
// You have to determine whether it is possible to convert array A to size 1, containing a single
// element equal to 0 after several splits and/or merge?

// Input  ==> Output
//A = [9, 17] ==> Yes

// Input  ==> Output
//A = [1] ==> No

public class interesting_array {

    public String solve(int[] A){
        int count = 0;

        for(int i=0; i<A.length; i++){
            if(A[i]%2==1) count++;
        }

        return count%2==0?"Yes":"No";
    }
}
