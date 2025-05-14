package com.data.structures.examples.DataStructures.DoublyLinkedLists;

public class DLLNode {
    int value;
    DLLNode next;
    DLLNode prev;

    public DLLNode(int value) {
        this.value = value;
        next = null;
        prev = null;
    }

    public DLLNode(int value, DLLNode next, DLLNode prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
