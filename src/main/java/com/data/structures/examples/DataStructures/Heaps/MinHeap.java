package com.data.structures.examples.DataStructures.Heaps;

public class MinHeap {
    public int[] heapVal;
    public int capacity;
    public int size;

    public MinHeap(int capacity) {
        heapVal = new int[capacity];
        this.capacity = capacity;
        size = 0;
    }

    public int getParent(int i) {
        if (i <= 0 || i >= size)
            return -1;

        return (i - 1) / 2;
    }

    public int getLeftChild(int i) {
        int left = (2 * i) + 1;

        if (left >= size)
            return -1;

        return left;
    }

    public int getRightChild(int i) {
        int right = (2 * i) + 2;

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

    public int getMin() {
        if (size == 0)
            throw new IllegalStateException("Heap is empty");

        return heapVal[0];
    }

    public void percolateDown(int i) {
        int min = i, left = getLeftChild(i), right = getRightChild(i);

        if (hasLeftChild(i) && heapVal[left] < heapVal[min])
            min = left;

        if (hasRightChild(i) && heapVal[right] < heapVal[min])
            min = right;

        if (min != i) {
            int temp = heapVal[min];
            heapVal[min] = heapVal[i];
            heapVal[i] = temp;

            percolateDown(min);
        }
    }

    public void percolateUp(int i) {
        int parentIndex = getParent(i);
        while (i > 0 && heapVal[i] < heapVal[parentIndex]) {
            int temp = heapVal[parentIndex];
            heapVal[parentIndex] = heapVal[i];
            heapVal[i] = temp;

            i = parentIndex;
            parentIndex = getParent(i);
        }
    }

    public void insert(int value) {
        if (size == capacity)
            throw new IllegalStateException("Heap is full");

        heapVal[size] = value;
        size++;
        percolateUp(size - 1);
    }

    public int deleteMin() {
        if (size == 0)
            throw new IllegalStateException("Heap is empty");

        int data = heapVal[0];
        heapVal[0] = heapVal[size - 1];
        size--;

        percolateDown(0);
        return data;
    }

    public int delete(int val) {
        if (size == 0)
            throw new IllegalStateException("Heap is empty");

        int pos2del = -1;

        for (int i = 0; i < size; i++) {
            if (heapVal[i] == val)
                pos2del = i;
        }

        if (pos2del == -1)
            throw new IllegalStateException("Value to delete is not found in the heap");

        int data = heapVal[pos2del];
        heapVal[pos2del] = heapVal[size - 1];
        size--;
        percolateDown(pos2del);

        return data;
    }

    public void destroyHeap() {
        heapVal = null;
        size = 0;
        capacity = 0;
    }


    public void buildHeap(int[] vals, int len) {
        if (len > capacity)
            throw new IllegalStateException("Size exceeds the heap capacity");

        for (int i = 0; i < len; i++)
            heapVal[i] = vals[i];

        size = len;

        for (int i = (size - 1) / 2; i >= 0; i--)
            percolateDown(i);

    }

    public String showMinHeap() {
        StringBuilder output = new StringBuilder();
        for (int val : heapVal)
            output.append(val + " ");

        return output.toString();
    }
}
