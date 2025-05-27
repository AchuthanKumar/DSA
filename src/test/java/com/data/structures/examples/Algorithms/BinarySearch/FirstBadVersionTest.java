package com.data.structures.examples.Algorithms.BinarySearch;

import com.data.structures.examples.Algorithms.BinarySearch.Advanced.FirstBadVersion;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FirstBadVersionTest {
    @Autowired
    FirstBadVersion firstBadVersion;

    @Test
    public void firstBadVersionTest() {
        firstBadVersion.setBadVersion(4);
        assertEquals(4, firstBadVersion.firstBadVersion(5));
    }

    @Test
    public void firstBadVersionTest1() {
        firstBadVersion.setBadVersion(1);
        assertEquals(1, firstBadVersion.firstBadVersion(1));
    }

    @Test
    public void firstBadVersionTest2() {
        firstBadVersion.setBadVersion(2);
        assertEquals(2, firstBadVersion.firstBadVersion(3));
    }
}
