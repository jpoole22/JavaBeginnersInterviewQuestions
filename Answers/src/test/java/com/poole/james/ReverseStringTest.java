package com.poole.james;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void reverseWithStringBuilder() {
        assertEquals("ABCDEF", ReverseString.reverseWithStringBuilder("FEDCBA"));
        assertEquals("", ReverseString.reverseWithStringBuilder(""));
        assertEquals(null, ReverseString.reverseWithStringBuilder(null));
    }

    @Test
    public void reverseWithStringBuilderManually() {
        assertEquals("ABCDEF", ReverseString.reverseWithStringBuilderManually("FEDCBA"));
        assertEquals("", ReverseString.reverseWithStringBuilderManually(""));
        assertEquals(null, ReverseString.reverseWithStringBuilderManually(null));
    }

    @Test
    public void reverseWithArrays() {
        assertEquals("ABCDEF", ReverseString.reverseWithArrays("FEDCBA"));
        assertEquals("", ReverseString.reverseWithArrays(""));
        assertEquals(null, ReverseString.reverseWithArrays(null));
    }

    @Test
    public void reverseWithRecursion() {
        assertEquals("ABCDEF", ReverseString.reverseWithRecursion("FEDCBA"));
        assertEquals("", ReverseString.reverseWithRecursion(""));
        assertEquals(null, ReverseString.reverseWithRecursion(null));
    }

    @Test
    public void reverseWithSingleArray() {
        assertEquals("ABCDE", ReverseString.reverseWithSingleArray("EDCBA"));
        assertEquals("ABCDEF", ReverseString.reverseWithSingleArray("FEDCBA"));
        assertEquals("", ReverseString.reverseWithSingleArray(""));
    }
}
