package com.yueyang.base;

/**
 * @author pengyueyang
 * @create 2019/6/28 17:17 双向链表
 */
public class DuLinkedList<T> {

    private int size = 0;
    private Node<T> headNode;
    private Node<T> tailNode;


    public void add(T data) {
        Node<T> node = new Node<T>(data);
        if (headNode == null) {
            tailNode = headNode = node;
        } else {
            tailNode.setNextNode(node);
            node.setPreNode(tailNode);
            tailNode = node;
        }
        size++;
    }

    public Node<T> getHeadNode() {
        return headNode;
    }

    public Node<T> getTailNode() {
        return tailNode;
    }

    public int size() {
        return size;
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
        Node<T> node;
        if (index == 0) {
            node = headNode;
            headNode = headNode.getNextNode();
        } else if (index == size - 1) {
            node = tailNode;
            tailNode.getPreNode().setNextNode(null);
            tailNode = tailNode.getPreNode();
        } else {
            node = headNode;
            for (int i = 0; i < index; i++) {
                node = node.getNextNode();
            }
            node.getPreNode().setNextNode(node.getNextNode());
            node.getNextNode().setPreNode(node.getPreNode());
        }
        size--;
        return node.getData();
    }

    public void insert(int index, T data) {
        checkIndex(index);
        Node<T> node = new Node<T>(data);
        Node<T> p = headNode;
        if (index == 0) {
            node.setNextNode(headNode);
            headNode.setPreNode(node);
            headNode = node;
        } else if (index == size - 1) {
            node.setPreNode(tailNode.getPreNode());
            tailNode.getPreNode().setNextNode(node);
            node.setNextNode(tailNode);
            tailNode.setPreNode(node);
        } else {
            for (int i = 0; i < index; i++) {
                p = p.getNextNode();
            }
            node.setPreNode(p.getPreNode());
            p.getPreNode().setNextNode(node);
            node.setNextNode(p);
            p.setPreNode(node);
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
        Node<T> node = tailNode;
        for (int i = 0; i < size; i++) {
            if (node.getData().equals(data)) {
                return i;
            }
            node = node.getPreNode();
        }
        return -1;
    }
}
