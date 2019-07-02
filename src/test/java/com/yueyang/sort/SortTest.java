package com.yueyang.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author pengyueyang
 * @create 2019/7/2 14:19
 */
public class SortTest {

    @Test
    public void testBubbleSort() {
        int[] array = {4, 5, 6, 3, 2, 1};
        int[] sortArray = {1, 2, 3, 4, 5, 6};
        Sort.bubbleSort(array);
        for (int i = 0; i < sortArray.length; i++) {
            Assert.assertEquals(array[i] == sortArray[i], true);
        }
    }

    @Test
    public void testInsertSort() {
        int[] array = {4, 5, 6, 3, 2, 1};
        int[] sortArray = {1, 2, 3, 4, 5, 6};
        Sort.insertSort(array);
        for (int i = 0; i < sortArray.length; i++) {
            Assert.assertEquals(array[i] == sortArray[i], true);
        }
    }

    @Test
    public void testSelectSort() {
        int[] array = {4, 5, 6, 3, 2, 1};
        int[] sortArray = {1, 2, 3, 4, 5, 6};
        Sort.selectSort(array);
        for (int i = 0; i < sortArray.length; i++) {
            Assert.assertEquals(array[i] == sortArray[i], true);
        }
    }
}
