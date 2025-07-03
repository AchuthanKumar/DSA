package com.data.structures.examples.Algorithms.Graphs;

import com.data.structures.examples.Algorithms.Graphs.MST.ReconstructItinerary;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@SpringBootTest
public class ReconstructItineraryTest {
    @Autowired
    ReconstructItinerary reconstructItinerary;

    @Test
    public void testReconstructItinerary() {
        List<List<String>> input = new ArrayList<>();
        input.add(Arrays.asList("MUC", "LHR"));
        input.add(Arrays.asList("JFK", "MUC"));
        input.add(Arrays.asList("SFO", "SJC"));
        input.add(Arrays.asList("LHR", "SFO"));
        assertArrayEquals(new String[]{"JFK", "MUC", "LHR", "SFO", "SJC"}, reconstructItinerary.findItinerary(input).toArray());
    }

    @Test
    public void testItinerary_MultipleOptions() {
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(Arrays.asList("JFK", "SFO"));
        tickets.add(Arrays.asList("JFK", "ATL"));
        tickets.add(Arrays.asList("SFO", "ATL"));
        tickets.add(Arrays.asList("ATL", "JFK"));
        tickets.add(Arrays.asList("ATL", "SFO"));

        List<String> expected = Arrays.asList("JFK", "ATL", "JFK", "SFO", "ATL", "SFO");
        List<String> actual = reconstructItinerary.findItinerary(tickets);

        assertEquals(expected, actual);
    }
}
