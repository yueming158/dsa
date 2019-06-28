package com.yueyang.base;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author pengyueyang
 * @create 2019/6/28 17:26
 */
public class DuLinkedListTest {

    @Test
    public void testAdd() {
        DuLinkedList<String> list = new DuLinkedList<>();
        list.add("a");
        list.add("b");
        Node<String> node = list.getHeadNode();
        do {
            System.out.println(node.getData());
            node = node.getNextNode();
        } while (node != null);

        node = list.getTailNode();
        do {
            System.out.println(node.getData());
            node = node.getPreNode();
        } while (node != null);
    }

    @Test
    public void testDel() {
        DuLinkedList<String> list = new DuLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.del(3);
        Assert.assertEquals(list.size(),3);
        Node<String> node = list.getHeadNode();
        do {
            System.out.println(node.getData());
            node = node.getNextNode();
        } while (node != null);

        node = list.getTailNode();
        do {
            System.out.println(node.getData());
            node = node.getPreNode();
        } while (node != null);
    }


    @Test
    public void testInsert() {
        DuLinkedList<String> list = new DuLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.insert(2,"d");
        Assert.assertEquals(list.size(),4);
        Node<String> node = list.getHeadNode();
        do {
            System.out.println(node.getData());
            node = node.getNextNode();
        } while (node != null);

        node = list.getTailNode();
        do {
            System.out.println(node.getData());
            node = node.getPreNode();
        } while (node != null);
    }
}
