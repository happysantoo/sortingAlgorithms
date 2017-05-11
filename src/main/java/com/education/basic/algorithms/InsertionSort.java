package com.education.basic.algorithms;

/**
 * Created by santhoshkuppusamy on 5/10/17.
 */
public class InsertionSort {

    /*
      Idea is traverse the elements in the array, for every element make sure all the elements left of the key are smaller than it.
      if not , swap them with key. Repeat the step till the last element in the traversal.

      Time complexity : O(n^2)
     */


    public int[] sort(int[] list){
        if (list!=null) {
            int key;
            for (int i = 0; i <= list.length - 1; i++) {
                key = list[i];
                for (int j = 0; j <= i - 1; j++) {
                    if (key < list[j]) {
                        swapElements(list, i, j);
                    }
                }
            }
        }
        return list;
    }


    private void swapElements(int[] list , int sourcePosition,int destinationPosition){
        int temp = list[destinationPosition];
        list[destinationPosition] = list[sourcePosition];
        list[sourcePosition] = temp;
    }

    public void printArray(int[] list){
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+",");
        }
    }

    public static void main(String[] args){
        InsertionSort sorter = new InsertionSort();
        int[] sortedArray = (sorter.sort(new int[]{6,5,4,3,2,1}));
        sorter.printArray(sortedArray);
    }
}
