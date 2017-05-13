package com.education.basic.algorithms;

import com.education.basic.algorithms.Sort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by santhoshkuppusamy on 5/13/17.
 */
public class BaseSortTests {
    
    protected Sort sorter;

    @Test
    public void testNullArray(){
        Assert.assertNull(sorter.sort(null));
    }

    @Test
    public void testEmptyArray(){
        Assert.assertArrayEquals(new int[]{},sorter.sort(new int[]{}));
    }

    @Test
    public void testSortedArray(){
        int[] sortedArray = new int[]{1,2,3,4,5};
        Assert.assertArrayEquals(sortedArray,sorter.sort(sortedArray));
    }

    @Test
    public void testSimpleArray(){
        int[] simpleArray = new int[]{11,2,13,24,5};
        Assert.assertArrayEquals(new int[]{2,5,11,13,24},sorter.sort(simpleArray));
    }

    @Test
    public void testReverseSortedArray(){
        int[] sortedArray = new int[]{5,4,3,2,1};
        Assert.assertArrayEquals(new int[]{1,2,3,4,5},sorter.sort(sortedArray));
    }
}

