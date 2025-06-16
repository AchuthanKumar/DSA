package com.data.structures.examples.DataStructures.Graphs;

import java.util.EmptyStackException;

public class MatrixGraph {
    private int numVertices;
    private int[][] adjMatrix;
    public boolean isUndirected;

    public MatrixGraph(int numVertices, boolean isUndirected) {
        adjMatrix = new int[numVertices][numVertices];
        this.numVertices = numVertices;
        this.isUndirected = isUndirected;
    }

    public void addEdge(int pos1, int pos2) {
        if (pos1 >= numVertices || pos2 >= numVertices) {
            throw new IndexOutOfBoundsException();
        }

        if (pos1 < 0 || pos2 < 0) {
            throw new EmptyStackException();
        }

        adjMatrix[pos1][pos2] = 1;
        if (isUndirected)
            adjMatrix[pos2][pos1] = 1;
    }

    public void removeEdge(int pos1, int pos2) {
        if (pos1 >= numVertices || pos2 >= numVertices) {
            throw new IndexOutOfBoundsException();
        }

        if (pos1 < 0 || pos2 < 0) {
            throw new EmptyStackException();
        }

        adjMatrix[pos1][pos2] = 0;
        if (isUndirected)
            adjMatrix[pos2][pos1] = 0;
    }

    public void printMatrix() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
