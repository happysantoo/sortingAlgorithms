package com.education.basic.algorithms;

/**
 * Created by santhoshkuppusamy on 5/13/17.
 */
public interface Sort {

     int[] sort(int[] list);

    default void swapElements(int[] list , int sourcePosition,int destinationPosition){
        int temp = list[destinationPosition];
        list[destinationPosition] = list[sourcePosition];
        list[sourcePosition] = temp;
    }

}
