package com.yueyang.base;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author pengyueyang
 * @create 2019/6/28 16:58
 */
public class MyCircleLinkedListTest {

    @Test
    public void testAdd() {
        MyCircleLinkedList<String> circleLinkedList = new MyCircleLinkedList<>();
        circleLinkedList.add("a");
        circleLinkedList.add("b");
        Assert.assertEquals(2, circleLinkedList.size());
        Node<String> node = circleLinkedList.getHeadNode();
        do {
            System.out.println(node.getData());
            node = node.getNextNode();
        } while (node != circleLinkedList.getHeadNode());
    }

    @Test
    public void testMerge() {
        MyCircleLinkedList<String> circleLinkedList = new MyCircleLinkedList<>();
        circleLinkedList.add("a");
        circleLinkedList.add("b");
        MyCircleLinkedList<String> other = new MyCircleLinkedList<>();
        other.add("c");
        other.add("d");
        circleLinkedList.merge(other);

        Assert.assertEquals(4, circleLinkedList.size());

        Node<String> node = circleLinkedList.getHeadNode();
        do {
            System.out.println(node.getData());
            node = node.getNextNode();
        } while (node != circleLinkedList.getHeadNode());
    }
}
