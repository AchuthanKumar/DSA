package com.data.structures.examples.DataStructures.DoublyLinkedLists;

public class DoublyLinkedList {
    private DLLNode head;

    public void insertAtBeginning(int data) {
        DLLNode newNode = new DLLNode(data);
        if (head != null) {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        DLLNode newNode = new DLLNode(data);
        if (head == null) {
            head = newNode;
        } else {
            DLLNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void insertAtPosition(int position, int data) {
        if (position < 0) {
            throw new IndexOutOfBoundsException("Position is less than zero");
        }

        if (position == 0) {
            insertAtBeginning(data);
            return;
        }

        DLLNode newNode = new DLLNode(data);
        DLLNode current = head;

        for (int i = 0; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Position is out of bounds");
        }

        newNode.next = current.next;
        newNode.prev = current;

        current.next = newNode;
//        if (current.next != null)
        current.next.prev = newNode;
    }

    public void deleteAtBeginning() {
        if (head == null) {
            throw new NullPointerException("List is empty");
        }

        head = head.next;
    }

    public void deleteAtEnd() {
        if (head == null) {
            throw new NullPointerException("List is empty");
        }

        if (head.next == null) {
            deleteAtBeginning();
        }

        DLLNode current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            throw new NullPointerException("List is empty");
        }

        if (position == 0) {
            deleteAtBeginning();
        }

        DLLNode current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Position is out of bounds");
            }
            current = current.next;
        }
        DLLNode nodeToDelete = current.next;
        current.next = nodeToDelete.next;
        nodeToDelete.next.prev = current;
    }

    public String displayLinkedList() {
        if (head == null) {
            return "List is empty";
        }

        StringBuilder output = new StringBuilder();
        DLLNode current = head;
        while (current != null) {
            output.append(current.value + " -> ");
            current = current.next;
        }
        output.append("NULL");

        return output.toString();
    }
}
