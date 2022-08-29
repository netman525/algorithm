/*
 * Ant Group
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package io.algorithm.string;

/**
 * #leetcode 520
 *
 * 检测大写字母
 *
 * @see https://leetcode.cn/problems/detect-capital/solution/jian-ce-da-xie-zi-mu-by-leetcode-solutio-449z/
 *
 * @author maoling
 * @version Solution.java, v 0.1 2022年08月29日 18:57 maoling
 */
public class Solution {

    /**
     * @param word
     * @return
     */
    public static boolean detectCapitalUse(String word) {
        if (word.length() < 2) {
            return true;
        }
        // 处理 "AAAAAAA"
        if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
            for (int i = 2; i < word.length(); i++) {
                if (Character.isLowerCase(word.charAt(i))) {
                    return false;
                }
            }
            // 处理 "aaaaaa"
        } else {
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("Aaaaaaaa"));
    }
}