/*
 * Ant Group
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package io.algorithm.arrays;

/**
 * @author maoling
 * @version FindNumberIn2DArray.java, v 0.1 2022年09月05日 19:05 maoling
 */
public class FindNumberIn2DArray {

    /**
     * 从一个已经排序第二维数据中找出存在严肃
     * @param arrays
     * @param target
     * @return
     */
    public static boolean findNumberIn2DArray(int[][] arrays, int target) {
        //第i行
        int i = arrays.length - 1;
        //第j列
        int j = 0;
        while (i >= 0 && j < arrays[0].length) {
            if (target > arrays[i][j]) {
                i--;
            } else if (arrays[i][j] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}