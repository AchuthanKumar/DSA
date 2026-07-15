package com.data.structures.examples.Practice.Graphs;

import org.springframework.stereotype.Service;

@Service
public class NumberOfProvincesLC {
    public int findCircleNum(int[][] isConnected) {
        int numOfProvinces = 0;
        boolean[] isVisited = new boolean[isConnected.length];

        for (int city = 0; city < isConnected.length; city++) {
            if (!isVisited[city]) {
                traverseNeighborCities(isConnected, isVisited, city);
                numOfProvinces++;
            }
        }

        return numOfProvinces;
    }

    private void traverseNeighborCities(int[][] isConnected, boolean[] isVisited, int city) {
        if (isVisited[city]) return;

        isVisited[city] = true;

        for (int neighbor = 0; neighbor < isConnected[city].length; neighbor++) {
            if (isConnected[city][neighbor] == 1) {
                traverseNeighborCities(isConnected, isVisited, neighbor);
            }
        }
    }

}
