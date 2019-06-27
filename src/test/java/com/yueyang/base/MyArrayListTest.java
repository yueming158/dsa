package com.yueyang.base;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

/**
 * @author by pengyy on 2019/6/22.
 */
public class MyArrayListTest {

    @Test
    public void testNewMyArrayList() {
        MyArrayList<Integer> list = new MyArrayList<>();
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testAdd() {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        Assert.assertEquals(100, list.size());
    }


    @Test
    public void testRemove() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.remove(0);
        Assert.assertEquals(0, list.size());
    }


    @Test
    public void testIterator() {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        Iterator<Integer> iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            iterator.next();
            i++;
        }
        Assert.assertEquals(100,i);
    }

}
