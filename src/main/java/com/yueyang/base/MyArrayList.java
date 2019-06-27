package com.yueyang.base;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/**
 * @author by pengyy on 2019/6/22.
 */
public class MyArrayList<E> implements Iterable<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private int size;

    private Object[] items;

    public MyArrayList() {
        doClear();
    }

    public void clear() {
        doClear();
    }

    private void doClear() {
        size = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyArrayListIterator();
    }

    private void ensureCapacity(int newCapacity) {
        if (newCapacity < size) {
            return;
        }
        Object[] old = items;
        items = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            items[i] = old[i];
        }
    }

    public E get(int index) {
        checkIndex(index);
        return (E) items[index];
    }

    public void add(E value) {
        add(size, value);
    }

    public void add(int index, E value) {
        if (items.length == size) {
            ensureCapacity(size << 2 + 1);
        }
        for (int i = size; i > index; i--) {
            items[i] = items[i - 1];
        }
        items[index] = value;
        size++;
    }

    public E set(int index, E value) {
        checkIndex(index);
        //15173847573 18688710486
        E old = (E) items[index];
        items[index] = value;
        return old;
    }

    public E remove(int index) {
        checkIndex(index);
        E old = (E) items[index];
        for (int i = index; i < size; i++) {
            items[i] = items[i + 1];
        }
        items[size - 1] = null;
        size--;
        return old;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void trimSize() {
        ensureCapacity(size);
    }

    private class MyArrayListIterator<E> implements Iterator<E> {

        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < size;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return (E)items[current++];
        }

        @Override
        public void remove() {
            MyArrayList.this.remove(--current);
        }


    }

}
