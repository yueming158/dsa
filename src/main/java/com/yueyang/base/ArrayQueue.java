package com.yueyang.base;

/**
 * @author pengyueyang
 * @create 2019/7/1 17:44 数组队列
 */
public class ArrayQueue<E> {

    private Object[] items;

    private int size;

    private int head;
    private int tail;

    public ArrayQueue(int capacity) {
        items = new Object[capacity];
        size = capacity;
        head = tail = 0;
    }

    public boolean enqueue(E item) {
        if (tail == size) {
            if (head == 0) {
                return false;
            }
            for (int i = 0; i < tail - head; i++) {
                items[i] = items[head + i];
            }
            tail -= head;
            head = 0;
        }
        items[tail++] = item;
        return true;
    }

    public E dequeue() {
        if (head == tail) {
            return null;
        }
        return (E) items[head++];
    }


}
