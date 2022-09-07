/*
 * Ant Group
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package io.algorithm.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author maoling
 * @version RerverseString.java, v 0.1 2022年09月07日 19:25 maoling
 */
public class ReverseString {

    static List<Integer> list = new ArrayList<>();

    public static void recursion(Node head) {
        if (head == null) {
            return;
        }
        recursion(head.next);
        list.add(head.val);
    }

    /**
     * @param node
     * @return
     */
    public static List<Integer> reverse(Node node) {
        Stack<Integer> stack = new Stack<>();
        while (node != null) {
            stack.add(node.val);
            node = node.next;
        }
        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

    public static void main(String[] args) {
        Node node01 = new Node(1);
        Node node02 = new Node(2);
        Node node03 = new Node(3);
        node01.next = node02;
        node02.next = node03;
        System.out.println(node01);

        List<Integer> reverse = reverse(node01);
        System.out.println(reverse);


        recursion(node01);
        System.out.println(list);



    }

    static class Node {

        private int  val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}