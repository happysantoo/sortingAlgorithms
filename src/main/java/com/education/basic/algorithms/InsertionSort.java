package com.education.basic.algorithms;

/**
 * Created by santhoshkuppusamy on 5/10/17.
 */
public class InsertionSort implements Sort {

    /*
      Idea is traverse the elements in the array, for every element make sure all the elements left of the key are smaller than it.
      if not , swap them with key. Repeat the step till the last element in the traversal.

      Worst case Time complexity : O(n^2)
      Average case : O(nk) where k is the number of moves required to make it sorted.
      Best case : O(n) where the array is already sorted.

     */


    public int[] sort(int[] list){
        if (list!=null) {
            int key;
            for (int i = 1; i < list.length ; i++) {
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



    public void printArray(int[] list){
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+",");
        }
    }


}
