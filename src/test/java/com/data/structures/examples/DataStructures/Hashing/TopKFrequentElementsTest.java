package com.data.structures.examples.DataStructures.Hashing;

import com.data.structures.examples.DataStructures.Arrays.Hashing.TopKFrequentElements;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TopKFrequentElementsTest {
    @Autowired
    private TopKFrequentElements topKFrequentElements;

    @Test
    public void testTopKFrequentElements() {
        System.out.println(Arrays.toString(topKFrequentElements.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
        assertEquals(Arrays.toString(new int[]{1, 2}), Arrays.toString(topKFrequentElements.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }

    @Test
    public void testTopKFrequentElements1() {
        System.out.println(Arrays.toString(topKFrequentElements.topKFrequent(new int[]{1}, 1)));
        assertEquals(Arrays.toString(new int[]{1}), Arrays.toString(topKFrequentElements.topKFrequent(new int[]{1}, 1)));
    }
}
