package com.data.structures.examples.Algorithms.DynamicProgramming;

import com.data.structures.examples.Algorithms.DynamicProgramming.SubArray.PalindromeSubString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

@SpringBootTest
public class PalindromeSubStringTest {
    @Autowired
    PalindromeSubString palindromeSubString;

    @Test
    public void testExample1() {
        String input = "aab";
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("a", "a", "b"),
                Arrays.asList("aa", "b")
        );

        System.out.println(palindromeSubString.partition(input));
        assertTrue(equalUnorderedLists(palindromeSubString.partition(input), expected));
    }

    @Test
    public void testSingleCharacter() {
        String input = "a";
        List<List<String>> expected = List.of(
                List.of("a")
        );
        assertTrue(equalUnorderedLists(palindromeSubString.partition(input), expected));
    }

    @Test
    public void testTwoDifferentCharacters() {
        String input = "ab";
        List<List<String>> expected = List.of(
                List.of("a", "b")
        );
        assertTrue(equalUnorderedLists(palindromeSubString.partition(input), expected));
    }

    @Test
    public void testFullPalindrome() {
        String input = "aba";
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("a", "b", "a"),
                Arrays.asList("aba")
        );
        assertTrue(equalUnorderedLists(palindromeSubString.partition(input), expected));
    }

    @Test
    public void testAllSameCharacters() {
        String input = "aaa";
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("a", "a", "a"),
                Arrays.asList("a", "aa"),
                Arrays.asList("aa", "a"),
                Arrays.asList("aaa")
        );
        assertTrue(equalUnorderedLists(palindromeSubString.partition(input), expected));
    }

    @Test
    public void testLongerPalindrome() {
        String input = "racecar";
        List<List<String>> result = palindromeSubString.partition(input);
        assertTrue(result.stream().anyMatch(p -> p.size() == 1 && p.get(0).equals("racecar")));
    }

    @Test
    public void testMaxLengthInput() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) sb.append('a');
        String input = sb.toString();
        List<List<String>> result = palindromeSubString.partition(input);
        assertTrue(result.size() > 0); // should produce valid outputs
    }

    // Helper to compare unordered lists of lists
    private boolean equalUnorderedLists(List<List<String>> a, List<List<String>> b) {
        Set<List<String>> setA = new HashSet<>();
        for (List<String> list : a) setA.add(new ArrayList<>(list));
        Set<List<String>> setB = new HashSet<>();
        for (List<String> list : b) setB.add(new ArrayList<>(list));
        return setA.equals(setB);
    }
}
