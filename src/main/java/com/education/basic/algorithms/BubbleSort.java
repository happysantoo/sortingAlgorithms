package com.education.basic.algorithms;

/**
 * Created by santhoshkuppusamy on 5/13/17.
 */
public class BubbleSort implements Sort {

    /*
    direct opposite of insertion sort. here the bigger elements bubble towards the right of the list.
     */

    public int[] sort(int[] list){
        if (list!=null){
            for (int i=1;i<list.length;i++){
                for (int j=0;j<list.length-i;j++){
                    if (list[j]>list[j+1]){
                        swapElements(list,j,j+1);
                    }
                }
            }
        }
        return list;
    }

}
