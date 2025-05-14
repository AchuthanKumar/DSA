package com.data.structures.examples.DataStructures.SinglyLinkedLists;

public class SLLNode {
    public int value;
    public SLLNode next;

    public SLLNode(int value) {
        this.value = value;
    }

    public SLLNode(int value, SLLNode next) {
        this.value = value;
        this.next = next;
    }
}
