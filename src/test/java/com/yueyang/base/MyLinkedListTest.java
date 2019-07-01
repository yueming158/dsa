package com.yueyang.base;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author pengyueyang
 * @create 2019/6/28 9:22
 */
public class MyLinkedListTest {

    @Test
    public void testAdd() {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        Assert.assertEquals(linkedList.size(), 2);
        Node<String> node = linkedList.getHeadNode();
        do {
            System.out.println(node.getData());
            node = node.getNextNode();
        } while (node != null);
    }

    @Test
    public void testGetElement() {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        Assert.assertEquals(linkedList.getElement(3), "d");
    }

    @Test
    public void testDel() {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("a");
        Assert.assertEquals("a", linkedList.del(0));
    }

    @Test
    public void testInsert() {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.insert(0,"c");
        linkedList.insert(3,"d");
        Node<String> node = linkedList.getHeadNode();
        do {
            System.out.println(node.getData());
            node = node.getNextNode();
        } while (node != null);
    }

    @Test
    public void testIndexOf() {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        Assert.assertEquals(3,linkedList.indexOf("d"));
    }

    @Test
    public void testReserve() {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        linkedList.reserve();
        Node<String> node = linkedList.getHeadNode();
        do {
            System.out.println(node.getData());
            node = node.getNextNode();
        } while (node != null);
    }

}
