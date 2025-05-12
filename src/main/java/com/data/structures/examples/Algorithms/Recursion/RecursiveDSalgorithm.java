package com.data.structures.examples.Algorithms.Recursion;

import org.springframework.stereotype.Service;

@Service
public class RecursiveDSalgorithm {

    public void printSeriesInAsc(int n) {
        if (n > 0) {
            printSeriesInAsc(n - 1);
            System.out.println(n);
        }
    }

    public void printSeriesInDesc(int n) {
        if (n > 0) {
            System.out.println(n);
            printSeriesInDesc(n - 1);
        }
    }

    public int printSumOfSeries(int n) {
        if (n == 0) {
            return n;
        } else {
            return n + printSumOfSeries(n - 1);
        }
    }

    public boolean palindromeChecker(String inputWord) {
        if (inputWord.length() == 0 || inputWord.length() == 1) {
            return true;
        }

        if (inputWord.charAt(0) == inputWord.charAt(inputWord.length() - 1)) {
            return palindromeChecker(inputWord.substring(1, inputWord.length() - 1));
        }

        return false;
    }
}

