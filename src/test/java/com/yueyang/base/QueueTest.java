package com.yueyang.base;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author pengyueyang
 * @create 2019/7/1 17:58 队列测试
 */
public class QueueTest {


    @Test
    public void testArrayQueue() {
        int size = 3;
        ArrayQueue<String> arrayQueue = new ArrayQueue<>(size);
        for (int i = 0; i < size; i++) {
            Assert.assertEquals(true, arrayQueue.enqueue("a" + i));
        }
        Assert.assertEquals(false, arrayQueue.enqueue("a"));
        for (int i = 0; i < size; i++) {
            Assert.assertEquals("a" + i, arrayQueue.dequeue());
        }
        Assert.assertEquals(true, arrayQueue.enqueue("a"));
        Assert.assertEquals("a", arrayQueue.dequeue());
        for (int i = 0; i < size; i++) {
            Assert.assertEquals(true, arrayQueue.enqueue("a" + i));
        }
    }


    @Test
    public void testLinkedQueue() {
        int size = 3;
        LinkedQueue<String> linkedQueue = new LinkedQueue<>();
        for (int i = 0; i < size; i++) {
            Assert.assertEquals(true, linkedQueue.enqueue("a" + i));
        }
        for (int i = 0; i < size; i++) {
            Assert.assertEquals("a" + i, linkedQueue.dequeue());
        }
    }

    @Test
    public void testCircleQueue() {
        int size = 3;
        CircleQueue<String> circleQueue = new CircleQueue<>(size);
        for (int i = 0; i < size - 1; i++) {
            Assert.assertEquals(true, circleQueue.enqueue("a" + i));
        }
        Assert.assertEquals(false, circleQueue.enqueue("a"));
        for (int i = 0; i < size - 1; i++) {
            Assert.assertEquals("a" + i, circleQueue.dequeue());
        }
        Assert.assertEquals(true, circleQueue.enqueue("a"));
        Assert.assertEquals("a", circleQueue.dequeue());
        for (int i = 0; i < size-1 ; i++) {
            Assert.assertEquals(true, circleQueue.enqueue("a" + i));
        }
    }
}
