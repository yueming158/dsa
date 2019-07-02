package com.yueyang.base;

/**
 * @author pengyueyang
 * @create 2019/7/2 8:22 循环队列
 */
public class CircleQueue<T> {

    private Object[] items;

    private int size;

    private int head;
    private int tail;

    public CircleQueue(int size) {
        this.size = size;
        items = new Object[size];
        head = tail = 0;
    }

    public Boolean enqueue(T data) {
        if (isFull()) {
            return false;
        }
        items[tail] = data;
        tail = (tail + 1) % size;
        return true;
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T data = (T) items[head];
        head = (head + 1) % size;
        return data;
    }

    public Boolean isFull() {
        return (tail + 1) % size == head;
    }

    public Boolean isEmpty() {
        return head == tail;
    }
}
