package com.yueyang.base;

/**
 * @author pengyueyang
 * @create 2019/7/2 13:45
 * 递归
 */
public class Recursion {


    public static int steps(int n) {
        if (n == 1) {
            return 1;
        }
        if (n==2) {
            return 2;
        }
        return steps(n-1)+steps(n-2);
    }
}
