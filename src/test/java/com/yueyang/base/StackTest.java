package com.yueyang.base;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author pengyueyang
 * @create 2019/7/1 11:44
 */
public class StackTest {

    @Test
    public void testArrayStack() {
        int size = 10;
        ArrayStack stack = new ArrayStack(size);
        for (int i = 0; i < size; i++) {
            stack.push(i + "");
        }

        for (int i = 0; i < size; i++) {
            Assert.assertEquals(size - i - 1 + "", stack.pop());
        }
    }

    @Test
    public void testLinkedStack() {
        int size = 10;
        LinkedStack<String> stack = new LinkedStack();
        for (int i = 0; i < size; i++) {
            stack.push(i + "");
        }

        for (int i = 0; i < size; i++) {
            Assert.assertEquals(size - i - 1 + "", stack.pop());
        }
    }

}
