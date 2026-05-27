package com.data.structures.examples.Practice.Arrays.Hashing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GroupAnagramsLCTest {

    @Autowired
    GroupAnagramsLC groupAnagramsLC;

    @Test
    public void testGroupAnagramCase1() {
        List<List<String>> result =
                groupAnagramsLC.groupAnagrams(
                        new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

        System.out.println(result);

        // Expected output
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("bat"),
                Arrays.asList("nat", "tan"),
                Arrays.asList("ate", "eat", "tea")
        );

        // Sort inner lists
        result.forEach(Collections::sort);
        expected.forEach(Collections::sort);

        // Sort outer list based on first element
        result.sort(Comparator.comparing(a -> a.get(0)));
        expected.sort(Comparator.comparing(a -> a.get(0)));

        assertEquals(expected, result);
    }
}
