package com.data.structures.examples.DataStructures.SinglyLinkedLists;


public class SinglyLinkedList {
    private SLLNode head;

    public void insertAtBeginning(int data) {
        SLLNode newNode = new SLLNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtBeginning(SLLNode newNode) {
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        SLLNode newNode = new SLLNode(data);
        if (head == null) {
            head = newNode;
        } else {
            SLLNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insertAtEnd(SLLNode newNode) {
        if (head == null) {
            head = newNode;
        } else {
            SLLNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insertAtPosition(int data, int position) {
        if (position == 0) {
            insertAtBeginning(data);
        }

        SLLNode newNode = new SLLNode(data);
        SLLNode temp = head;
        for (int i = 0; i < position - 1; i++) {
            if (temp.next == null) {
                throw new IndexOutOfBoundsException("Provided index out of bounds");
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtBeginning() {
        if (head == null) {
            throw new NullPointerException("Empty List");
        }
        head = head.next;
    }

    public void deleteAtEnd() {
        if (head == null) {
            throw new NullPointerException("Empty List");
        }

        if (head.next == null) {
            deleteAtBeginning();
        }

        SLLNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            throw new NullPointerException("Empty List");
        }

        if (position == 0) {
            deleteAtBeginning();
        }

        SLLNode temp = head;
        for (int i = 0; i < position - 1; i++) {
            if (temp.next == null) {
                throw new IndexOutOfBoundsException("Provided index out of bounds");
            }
            temp = temp.next;
        }

        if (temp.next == null) {
            throw new IndexOutOfBoundsException("Provided index out of bounds");
        }

        temp.next = temp.next.next;
    }

    public void display() {
        if (head == null) {
            throw new NullPointerException("Empty List");
        }

        SLLNode temp = head;
        while (temp != null) {
            System.out.println(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public String displayLinkedList() {
        if (head == null) {
            return "Empty List";
        }

        StringBuilder output = new StringBuilder();
        SLLNode temp = head;
        while (temp != null) {
            output.append(temp.value + " -> ");
            temp = temp.next;
        }
        output.append("null");

        return output.toString();
    }
}
