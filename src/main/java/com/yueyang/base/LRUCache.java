package com.yueyang.base;

/**
 * @author pengyueyang
 * @create 2019/6/28 10:53
 */
public class LRUCache<T> {

    private int size;

    private MyLinkedList<T> list;

    public LRUCache(int size) {
        if (size <  0) {
            throw new IllegalArgumentException();
        }
        this.size = size;
        this.list = new MyLinkedList<T>();
    }

    public void add(T data) {
        int index = list.indexOf(data);
        if (index != -1) {
            list.del(index);
            list.insert(0,data);
        } else {
            if (list.size() >= size) {
                list.del(list.size()-1);
            }
            list.insert(0,data);
        }
    }

    public MyLinkedList<T> getList() {
        return list;
    }
}
