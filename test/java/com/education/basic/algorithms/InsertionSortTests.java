package com.education.basic.algorithms;

import com.education.basic.algorithms.InsertionSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by santhoshkuppusamy on 5/10/17.
 */
public class InsertionSortTests {

    @Test
    public void testNullArray(){
        Assert.assertNull(new InsertionSort().sort(null));
    }

    @Test
    public void testEmptyArray(){
        Assert.assertArrayEquals(new int[]{},new InsertionSort().sort(new int[]{}));
    }

    @Test
    public void testSortedArray(){
        int[] sortedArray = new int[]{1,2,3,4,5};
        Assert.assertArrayEquals(sortedArray,new InsertionSort().sort(sortedArray));
    }

    @Test
    public void testSimpleArray(){
        int[] simpleArray = new int[]{11,2,13,24,5};
        Assert.assertArrayEquals(new int[]{2,5,11,13,24},new InsertionSort().sort(simpleArray));
    }

    @Test
    public void testReverseSortedArray(){
        int[] sortedArray = new int[]{5,4,3,2,1};
        Assert.assertArrayEquals(new int[]{1,2,3,4,5},new InsertionSort().sort(sortedArray));
    }
}
