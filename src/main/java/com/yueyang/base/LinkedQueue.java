package com.yueyang.base;

/**
 * @author pengyueyang
 * @create 2019/7/2 8:05
 * 链表队列
 */
public class LinkedQueue<T> {

    private Node<T> head;

    private Node<T> tail;

    public LinkedQueue() {
    }

    public boolean enqueue(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            tail = head = node;
        } else {
            tail.setNextNode(node);
            tail = node;
        }
        return true;
    }

    public T dequeue() {
        if (head == null) {
            return null;
        }
        T data = head.getData();
        Node<T> node = head.getNextNode();
        head = null;
        if (node == null) {
            head = tail = null;
        } else {
            head = node;
        }
        return data;
    }
}
