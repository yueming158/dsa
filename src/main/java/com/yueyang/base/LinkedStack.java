package com.yueyang.base;

/**
 * @author pengyueyang
 * @create 2019/7/1 11:48
 */
public class LinkedStack<T> {

    private Node<T> stack;

    private int count;


    public LinkedStack() {
        this.count = 0;
    }

    public boolean push(T data) {
        Node<T> node = new Node<T>(data);
        if (stack == null) {
            stack = node;
        } else {
            node.setNextNode(stack);
            stack = node;
        }
        return true;
    }

    public T pop() {
        if (stack == null) {
            return null;
        }
        T value = stack.getData();
        stack = stack.getNextNode();
        return value;
    }
}
