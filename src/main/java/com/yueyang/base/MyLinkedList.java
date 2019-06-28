package com.yueyang.base;

/**
 * @author pengyueyang
 * @create 2019/6/28 9:07 单向链表
 */
public class MyLinkedList<T> {

    private int size = 0;
    private Node<T> headNode;
    private Node<T> tailNode;

    public MyLinkedList() {
    }

    public void add(T data) {
        Node<T> node = new Node<T>(data);
        if (headNode == null) {
            tailNode = headNode = node;
        } else {
            tailNode.setNextNode(node);
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

    public T getElement(int index) {
        checkIndex(index);
        Node<T> node = headNode;
        for (int i = 0; i < index; i++) {
            node = node.getNextNode();
        }
        return node.getData();
    }

    public T del(int index) {
        checkIndex(index);
        Node<T> node = headNode;
        Node<T> tmpNode = node;
        if (index == 0) {
            headNode = headNode.getNextNode();
        } else{
            for (int i = 0; i < index; i++) {
                if (i == index - 1) {
                    tmpNode = node.getNextNode();
                    node.setNextNode(node.getNextNode().getNextNode());
                } else {
                    node = node.getNextNode();
                }
            }
        }
        size--;
        return tmpNode.getData();
    }

    public void insert(int index, T data) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node<T> node = new Node<T>(data);
        Node<T> p = headNode;
        if (index == 0) {
            node.setNextNode(p);
            headNode = node;
        } else {
            for (int i = 0; i < index - 1; i++) {
                p = p.getNextNode();
            }
            node.setNextNode(p.getNextNode());
            p.setNextNode(node);
        }
        size++;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int indexOf(T data) {
        if (size == 0) {
            return -1;
        }
        if (size == 1) {
            return headNode.getData().equals(data) ? 0 : -1;
        }
        Node<T> node = headNode;
        for (int i = 0; i < size; i++) {
            if (node.getData().equals(data)) {
                return i;
            }
            node = node.getNextNode();
        }
        return -1;
    }
}


