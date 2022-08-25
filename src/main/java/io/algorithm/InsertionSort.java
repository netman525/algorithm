/*
 * Ant Group
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package io.algorithm;

import java.util.Arrays;

/**
 * 经典排序
 *
 * @author maoling
 * @version InsertionSort.java, v 0.1 2022年06月23日 7:23 下午 maoling
 */
public class InsertionSort {

    /**
     * 插入排序核心方法
     * 核心方法讲解 https://www.runoob.com/w3cnote/insertion-sort.html
     *
     * @param sorts
     */
    public static void insertion(int[] sorts) {
        int length = sorts.length;
        // 从第1个数开始
        for (int i = 1; i < length; i++) {
            int value = sorts[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (sorts[j] > value) {
                    sorts[j + 1] = sorts[j];
                } else {
                    break;
                }
            }
            // 把一直比的那个数放到这里
            sorts[j + 1] = value;
        }
    }

    /**
     *
     * 从小到打排序
     * 冒泡排序
     * https://blog.csdn.net/qq_26545305/article/details/87988991
     *
     * @param a
     */
    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] sorts = new int[] {4, 2, 1, 9, 7, 23};
        insertion(sorts);
        System.out.println("insertion: " + Arrays.toString(sorts));

        int[] bubble = new int[] {4, 2, 1, 9, 6, 40, 7, 23};
        bubbleSort(bubble);
        System.out.println("bubble: " + Arrays.toString(bubble));
    }
}