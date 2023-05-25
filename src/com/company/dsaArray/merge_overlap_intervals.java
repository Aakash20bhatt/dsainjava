package com.company.dsaArray;

// Given a collection of intervals, merge all overlapping intervals.
// Input :
//[1,3],[2,6],[8,10],[15,18]
// Output :

//[1,6],[8,10],[15,18]

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class merge_overlap_intervals {

    public ArrayList<Interval> merge(ArrayList<Interval> intervals){

        ArrayList<Interval> ans = new ArrayList<>();
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });

        int index = 0;

        for(int i=1; i<intervals.size(); i++){

            if(intervals.get(i).start<=intervals.get(index).end){
                intervals.get(index).end = Math.max(intervals.get(i).end, intervals.get(index).end);
            }else{
                index++;
                intervals.set(index, intervals.get(i));
            }
        }

        for(int i=0; i<=index; i++){
            ans.add(intervals.get(i));
        }

        return ans;
    }
}
