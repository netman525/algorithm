/*
 * Ant Group
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package io.algorithm.linklist;

/**
 *
 * leetcode 203 移除链表元素
 *
 *
 * @author maoling
 * @version RemoveElements.java, v 0.1 2022年09月27日 19:49 maoling
 */
public class RemoveElements {

    public static Node removeElements(Node head,int val){
        if(head == null) return null;
        head.next = removeElements(head.next,val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        Node node01 = new Node(1);
        Node node02 = new Node(2);
        Node node03 = new Node(3);
        Node node04 = new Node(4);
        node01.next = node02;
        node02.next = node03;
        node03.next = node04;

        Node node = removeElements(node01, 2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
