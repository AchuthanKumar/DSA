package com.data.structures.examples.DataStructures.Heaps;

import java.util.Arrays;

public class MaxHeap {
    public int[] heapVal;
    public int size;
    public int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        size = 0;
        heapVal = new int[capacity];
    }

    public int getParent(int i) {
        if (i <= 0 || i >= size)
            return -1;

        return (i - 1) / 2;
    }

    public int getLeftChild(int i) {
        int left = 2 * i + 1;

        if (left >= size)
            return -1;

        return left;
    }

    public int getRightChild(int i) {
        int right = 2 * i + 2;

        if (right >= size)
            return -1;

        return right;
    }

    public boolean hasLeftChild(int i) {
        return getLeftChild(i) != -1;
    }

    public boolean hasRightChild(int i) {
        return getRightChild(i) != -1;
    }

    public int getMax() {
        if (size == 0)
            throw new IllegalStateException("Heap is empty");

        return heapVal[0];
    }

    public void percolateDown(int i) {
        int max = i;
        int left = getLeftChild(i);
        int right = getRightChild(i);

        if (hasLeftChild(i) && heapVal[left] > heapVal[max])
            max = left;
        if (hasRightChild(i) && heapVal[right] > heapVal[max])
            max = right;

        if (max != i) {
            int temp = heapVal[max];
            heapVal[max] = heapVal[i];
            heapVal[i] = temp;

            percolateDown(max);
        }
    }

    public void percolateUp(int i) {
        int parentIndex = getParent(i);

        while (i > 0 && heapVal[i] > heapVal[parentIndex]) {
            int temp = heapVal[parentIndex];
            heapVal[parentIndex] = heapVal[i];
            heapVal[i] = temp;

            i = parentIndex;
            parentIndex = getParent(i);
        }
    }

    public void insert(int val) {
        if (size == capacity)
            throw new IllegalStateException("Heap is full");

        heapVal[size++] = val;

        percolateUp(size - 1);
    }

    public int deleteMax() {
        if (size == 0)
            throw new IllegalStateException("Heap is empty");

        int data2Delete = heapVal[0];
        heapVal[0] = heapVal[size - 1];
        size--;

        percolateDown(0);

        return data2Delete;
    }

    public int delete(int val) {
        if (size == 0)
            throw new IllegalStateException("Heap is empty");

        int valPos = -1;

        for (int i = 0; i < size; i++) {
            if (heapVal[i] == val) {
                valPos = i;
                break;
            }
        }

        if (valPos == -1)
            throw new IllegalStateException("Value not found in the Heap");

        int data2Del = heapVal[valPos];
        heapVal[valPos] = heapVal[size - 1];
        size--;

        percolateDown(valPos);
        return data2Del;
    }

    public void destroyHeap() {
        heapVal = null;
        size = 0;
        capacity = 0;
    }

    public void buildHeap(int[] heapArray, int len) {
        if (len > capacity)
            throw new IllegalStateException("Array length exceeded heap capacity");

        for (int i = 0; i < len; i++)
            heapVal[i] = heapArray[i];

        size = len;

        for (int i = (size - 1) / 2; i >= 0; i--)
            percolateDown(i);
    }

    public String showMaxHeap() {
        StringBuilder output = new StringBuilder();

        Arrays.stream(heapVal).forEach(value -> {
            output.append(value).append(" ");
        });

        return output.toString();
    }
}
