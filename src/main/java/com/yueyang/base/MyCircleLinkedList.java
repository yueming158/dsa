package com.yueyang.base;

/**
 * @author pengyueyang
 * @create 2019/6/28 16:50
 * 循环链表和单链表相似循环结束条件为p.next=tail
 */
public class MyCircleLinkedList<T> {

    private int size = 0;
    private Node<T> headNode;
    private Node<T> tailNode;

    public MyCircleLinkedList() {
    }

    public void add(T data) {
        Node<T> node = new Node<T>(data);
        if (headNode == null) {
            headNode = node;
            tailNode = node;
            tailNode.setNextNode(headNode);
        } else {
            tailNode.setNextNode(node);
            node.setNextNode(headNode);
            tailNode = node;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public Node<T> getHeadNode() {
        return headNode;
    }

    public Node<T> getTailNode() {
        return tailNode;
    }

    public void merge(MyCircleLinkedList otherList) {
        if (otherList.size() > 0 ) {
            tailNode.setNextNode(otherList.getHeadNode());
            otherList.getTailNode().setNextNode(headNode);
            size += otherList.size();
        }
    }


}
