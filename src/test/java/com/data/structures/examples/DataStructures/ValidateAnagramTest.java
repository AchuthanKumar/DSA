package com.data.structures.examples.DataStructures;

import com.data.structures.examples.DataStructures.Arrays.Hashing.ValidateAnagram;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ValidateAnagramTest {

    @Autowired
    private ValidateAnagram validateAnagram;

    @Test
    public void validateAnagramSortAndCompare() {
        assertTrue(validateAnagram.isAnagramValidationBySortAndCompare("anagram","nagaram"));
    }

    @Test
    public void validateAnagramSortAndCompare1() {
        assertFalse(validateAnagram.isAnagramValidationBySortAndCompare("rat","car"));
    }

    @Test
    public void validateAnagramSortAndCompare2() {
        assertTrue(validateAnagram.isAnagramValidationBySortAndCompare("listen","silent"));
    }

    @Test
    public void validateAnagramSortAndCompare3() {
        assertTrue(validateAnagram.isAnagramValidationBySortAndCompare("",""));
    }

    @Test
    public void validateAnagramSortAndCompare4() {
        assertFalse(validateAnagram.isAnagramValidationBySortAndCompare("cat","cats"));
    }

    @Test
    public void validateAnagramSortAndCompare5() {
        assertFalse(validateAnagram.isAnagramValidationBySortAndCompare("Tea","Eat"));
    }

    @Test
    public void validateAnagramSortAndCompare6() {
        assertTrue(validateAnagram.isAnagramValidationBySortAndCompare("debit card","bad credit"));
    }

    @Test
    public void validateAnagramSortAndCompare7() {
        assertFalse(validateAnagram.isAnagramValidationBySortAndCompare("aa","bb"));
    }

    @Test
    public void validateAnagramFrequencyCount() {
        assertTrue(validateAnagram.isAnagramValidationByFrequencyCount("anagram","nagaram"));
    }

    @Test
    public void validateAnagramFrequencyCount1() {
        assertFalse(validateAnagram.isAnagramValidationByFrequencyCount("rat","car"));
    }

    @Test
    public void validateAnagramFrequencyCount2() {
        assertTrue(validateAnagram.isAnagramValidationByFrequencyCount("listen","silent"));
    }

    @Test
    public void validateAnagramFrequencyCount3() {
        assertTrue(validateAnagram.isAnagramValidationByFrequencyCount("",""));
    }

    @Test
    public void validateAnagramFrequencyCount4() {
        assertFalse(validateAnagram.isAnagramValidationByFrequencyCount("cat","cats"));
    }

    @Test
    public void validateAnagramFrequencyCount5() {
        assertFalse(validateAnagram.isAnagramValidationByFrequencyCount("Tea","Eat"));
    }

    @Test
    public void validateAnagramFrequencyCount6() {
        assertTrue(validateAnagram.isAnagramValidationByFrequencyCount("debit card","bad credit"));
    }

    @Test
    public void validateAnagramFrequencyCount7() {
        assertFalse(validateAnagram.isAnagramValidationByFrequencyCount("aa","bb"));
    }

    @Test
    public void validateAnagramCountArray() {
        assertTrue(validateAnagram.isAnagramValidationByCountArray("anagram","nagaram"));
    }

    @Test
    public void validateAnagramCountArray1() {
        assertFalse(validateAnagram.isAnagramValidationByCountArray("rat","car"));
    }

    @Test
    public void validateAnagramCountArray2() {
        assertTrue(validateAnagram.isAnagramValidationByCountArray("listen","silent"));
    }

    @Test
    public void validateAnagramCountArray3() {
        assertTrue(validateAnagram.isAnagramValidationByCountArray("",""));
    }

    @Test
    public void validateAnagramCountArray4() {
        assertFalse(validateAnagram.isAnagramValidationByCountArray("cat","cats"));
    }

    @Test
    public void validateAnagramCountArray5() {
        assertFalse(validateAnagram.isAnagramValidationByCountArray("Tea","Eat"));
    }

    @Test
    public void validateAnagramCountArray6() {
        assertTrue(validateAnagram.isAnagramValidationByCountArray("debit card","bad credit"));
    }

    @Test
    public void validateAnagramCountArray7() {
        assertFalse(validateAnagram.isAnagramValidationByCountArray("aa","bb"));
    }
}
