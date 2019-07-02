package com.yueyang.sort;

/**
 * @author pengyueyang
 * @create 2019/7/2 14:06 常见排序算法 衡量标准：时间复杂度、内存消耗是否是原地排序、稳定性
 */
public class Sort {

    /**
     * 冒泡排序 核心相邻两个元素比较，每次循环确定一个元素       逆序度=满有序度（n(n-1)/2）-有序度
     */
    public static void bubbleSort(int[] array) {
        if (null == array || array.length <= 1) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    flag = true;
                }
                if (!flag) {
                    return;
                }
            }
        }
    }

    /**
     * 插入排序 插入排序比冒泡排序更受欢迎,因为其效率更高(移动操作比交换操作更省时间)
     */
    public static void insertSort(int[] array) {
        if (null == array || array.length <= 1) {
            return;
        }
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (array[j] > tmp) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = tmp;
        }
    }

    /**
     * 选择排序 时间复杂度最好最坏都是n²
     */
    public static void selectSort(int[] array) {
        if (null == array || array.length <= 1) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }

    }

    private static void swap(int array[], int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
