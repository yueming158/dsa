package com.yueyang.base;

/**
 * @author pengyueyang
 * @create 2019/6/28 9:10
 * 链表节点
 */
public class Node<T> {

    private T data;
    private Node<T> nextNode;
    private Node<T> preNode;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node(T data) {
        this.data = data;
    }

    public Node() {
    }

    public Node(T data, Node<T> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public Node<T> getPreNode() {
        return preNode;
    }

    public void setPreNode(Node<T> preNode) {
        this.preNode = preNode;
    }

    public Node(T data, Node<T> nextNode, Node<T> preNode) {
        this.data = data;
        this.nextNode = nextNode;
        this.preNode = preNode;
    }
}
