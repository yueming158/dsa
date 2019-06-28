package com.yueyang.base;

import org.junit.Test;

/**
 * @author pengyueyang
 * @create 2019/6/28 11:26
 */
public class LRUCacheTest {

    @Test
    public void testAdd() {
        LRUCache<String> cache = new LRUCache<>(3);
        cache.add("a");
        cache.add("b");
        cache.add("c");
        cache.add("a");
        cache.add("d");
        Node<String> node = cache.getList().getHeadNode();
        do {
            System.out.println(node.getData());
            node = node.getNextNode();
        } while (node != null);

    }
}
