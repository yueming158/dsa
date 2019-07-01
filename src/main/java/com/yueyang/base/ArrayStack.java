package com.yueyang.base;

/**
 * @author pengyueyang
 * @create 2019/7/1 11:38
 */
public class ArrayStack {

    private String[] items;
    private int count;
    private int size;


    public ArrayStack(int size) {
        if (size <= 0 ) {
            throw new IllegalArgumentException();
        }
        this.count = 0;
        this.size = size;
        this.items = new String[size];
    }

    public boolean push(String value) {
        if (count >= size) {
            return false;
        }
        items[count++] = value;
        return true;
    }

    public String pop() {
       if (count <= 0) {
           return null;
       }
       return items[--count];
    }
}
