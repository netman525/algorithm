/*
 * Ant Group
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package io.algorithm.string;

/**
 * 回文字符串判断
 *
 * @author maoling
 * @version PalindromicString.java, v 0.1 2022年09月01日 20:39 maoling
 */
public class PalindromicString {

    /**
     * 判断回文字符串
     *
     * @param s
     * @return
     */
    public static boolean isPalindromic(String s) {
        if (s.length() == 0) {
            return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while (head < tail) {
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if (!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "a b,B a";
        System.out.println(isPalindromic(a));
    }
}