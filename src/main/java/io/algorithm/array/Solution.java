/*
 * Ant Group
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package io.algorithm.array;

/**
 *
 * #leetcode 495
 * 提莫攻击
 *
 * https://leetcode.cn/problems/teemo-attacking/solution/ti-mo-gong-ji-by-leetcode-solution-6p4k/
 *
 * @author maoling
 * @version Solution.java, v 0.1 2022年08月25日 20:04 maoling
 */
public class Solution {

    /**
     * @param timeSeries
     * @param duration
     * @return
     */
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            //
            if (timeSeries[i + 1] <= timeSeries[i] + duration) {
                total = timeSeries[i + 1] - timeSeries[i];
            } else {
                total += duration;
            }
            // 最后一次攻击
            total += duration;
        }
        return total;
    }

    /**
     *
     * @param timeSeries
     * @param duration
     * @return
     */
    public static int findPoisonedDuration2(int[] timeSeries, int duration) {
        int total = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            total += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
        }
        // 最后一次攻击
        total += duration;
        return total;
    }

    public static void main(String[] args) {
        int[] timeSeries = {1, 2};
        int duration = 2;
        System.out.println(findPoisonedDuration(timeSeries, duration));
    }
}