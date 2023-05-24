package com.company.dsaArray;

// Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated
// square matrix.

public class spiral_order {

    public int [][] generateMatrix(int A){

        int[][]  res = new int[A][A];

        int dir = 0;
        int i = 0;
        int j = 0;
        int k = 1;

        while(k<=A*A){
            res[i][j] = k;
            k+=1;
            if(dir==0){
                j+=1;
                if(j==A || res[i][j]!=0){
                    dir=1;
                    j-=1;
                    i+=1;
                }
            }else if(dir==1){
                i+=1;
                if(i==A || res[i][j]!=0){
                    dir=2;
                    i-=1;
                    j-=1;
                }
            }else if(dir==2){
                j-=1;
                if(j==-1 || res[i][j]!=0){
                    dir=3;
                    i-=1;
                    j+=1;
                }
            }else if(dir==3){
                i-=1;
                if(i==-1 || res[i][j]!=0){
                    dir=0;
                    i+=1;
                    j+=1;
                }
            }
        }

        return res;
    }
}
