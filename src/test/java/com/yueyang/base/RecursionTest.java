package com.yueyang.base;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author pengyueyang
 * @create 2019/7/2 13:48
 */
public class RecursionTest {

    @Test
    public void testSteps() {
        Assert.assertEquals(3, Recursion.steps(3));
        Assert.assertEquals(5, Recursion.steps(4));
        int a = 1;
        int b = 2;
        int sum = 0;
        for (int i = 3; i <= 10; i++) {
            sum = a+b;
            a = b;
            b = sum;
        }
        Assert.assertEquals(sum,Recursion.steps(10));
    }


}
