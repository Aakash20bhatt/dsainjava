package com.company.dsaArray;


import java.util.ArrayList;
import java.util.Scanner;

public class mergeintervals {

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval){

        ArrayList<Interval> ans = new ArrayList<>();
        int size = intervals.size();

        for(int i=0; i<size; i++){  
            Interval currentInterval = intervals.get(i);

            if(currentInterval.end< newInterval.start){
                ans.add(currentInterval);
            }else if(newInterval.end>currentInterval.start){
                ans.add(newInterval);
                for(int j=i; j<size; j++){
                    ans.add(intervals.get(j));
                }
                return ans;
            }else{
                newInterval.start = Math.min(currentInterval.start, newInterval.start);
                newInterval.end = Math.max(currentInterval.end,newInterval.end);
            }
        }
        return ans;

    }
}
