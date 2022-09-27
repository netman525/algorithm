/*
 * Ant Group
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package io.algorithm.linklist;

/**
 * leetcode 237
 *
 * 和leetcode 203题目不一样是没有给出删除元素
 *
 *
 * @author maoling
 * @version RemoveNode.java, v 0.1 2022年09月27日 20:12 maoling
 */
public class RemoveNode {

    public static void main(String[] args) {
        Node node01 = new Node(1);
        Node node02 = new Node(2);
        Node node03 = new Node(3);
        Node node04 = new Node(4);
        node01.next = node02;
        node02.next = node03;
        node03.next = node04;

        removeNode(node02);
        while (node01 != null) {
            System.out.println(node01.val);
            node01 = node01.next;
        }
    }

    /**
     *
     *
     * @param node
     */
    public static void removeNode(Node node) {
        if (node != null && node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}