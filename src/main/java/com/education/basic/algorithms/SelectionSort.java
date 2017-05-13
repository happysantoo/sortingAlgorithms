package com.education.basic.algorithms;

/**
 * Created by santhoshkuppusamy on 5/13/17.
 */

/*
select the current item , iterate through the items to the right till the end of the array.
select  the minimum value , if minimum value is less than the current item swap it.
 */


public class SelectionSort implements Sort {

    @Override
    public int[] sort(int[] list) {
        if (list !=null){

            for (int i=0;i<list.length;i++){
                int minValue=list[i];
                int minIndex=i;
                for (int j=i;j<list.length;j++){
                    if (list[j]<minValue){
                        minValue=list[j];
                        minIndex=j;
                    }
                }

                if (minValue<list[i]) {
                    swapElements(list, i, minIndex);
                }
            }
        }
        return list;
    }
}
