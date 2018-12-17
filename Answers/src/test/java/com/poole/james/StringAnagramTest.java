package com.poole.james;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringAnagramTest {

    StringAnagram stringAnagram = new StringAnagram();

    @Test
    public void anagramBySort() {
        assertTrue(stringAnagram.isAnagramBySort("Mother In Law", "Hitler Woman"));
        assertTrue(stringAnagram.isAnagramBySort("keEp", "peeK"));
        assertTrue(stringAnagram.isAnagramBySort("SiLeNt CAT", "LisTen AcT"));
        assertTrue(stringAnagram.isAnagramBySort("Debit Card", "Bad Credit"));
        assertTrue(stringAnagram.isAnagramBySort("School MASTER", "The ClassROOM"));
        assertTrue(stringAnagram.isAnagramBySort("DORMITORY", "Dirty Room"));
        assertTrue(stringAnagram.isAnagramBySort("ASTRONOMERS", "NO MORE STARS"));
        assertTrue(stringAnagram.isAnagramBySort("", ""));

        assertFalse(stringAnagram.isAnagramBySort("Boo", "This is not an anagram"));
    }

    @Test
    public void anagramByArray() {
        assertTrue(stringAnagram.isAnagramByArray("Mother In Law", "Hitler Woman"));
        assertTrue(stringAnagram.isAnagramByArray("keEp", "peeK"));
        assertTrue(stringAnagram.isAnagramByArray("SiLeNt CAT", "LisTen AcT"));
        assertTrue(stringAnagram.isAnagramByArray("Debit Card", "Bad Credit"));
        assertTrue(stringAnagram.isAnagramByArray("School MASTER", "The ClassROOM"));
        assertTrue(stringAnagram.isAnagramByArray("DORMITORY", "Dirty Room"));
        assertTrue(stringAnagram.isAnagramByArray("ASTRONOMERS", "NO MORE STARS"));
        assertTrue(stringAnagram.isAnagramByArray("", ""));

        assertFalse(stringAnagram.isAnagramByArray("Boo", "This is not an anagram"));
    }

    @Test
    public void anagramByStringBuilder() {
        assertTrue(stringAnagram.isAnagramByStringBuilder("Mother In Law", "Hitler Woman"));
        assertTrue(stringAnagram.isAnagramByStringBuilder("keEp", "peeK"));
        assertTrue(stringAnagram.isAnagramByStringBuilder("SiLeNt CAT", "LisTen AcT"));
        assertTrue(stringAnagram.isAnagramByStringBuilder("Debit Card", "Bad Credit"));
        assertTrue(stringAnagram.isAnagramByStringBuilder("School MASTER", "The ClassROOM"));
        assertTrue(stringAnagram.isAnagramByStringBuilder("DORMITORY", "Dirty Room"));
        assertTrue(stringAnagram.isAnagramByStringBuilder("ASTRONOMERS", "NO MORE STARS"));
        assertTrue(stringAnagram.isAnagramByStringBuilder("", ""));

        assertFalse(stringAnagram.isAnagramByStringBuilder("Boo", "This is not an anagram"));
    }

    @Test
    public void anagramByMap() {
        assertTrue(stringAnagram.isAnagramByMap("Mother In Law", "Hitler Woman"));
        assertTrue(stringAnagram.isAnagramByMap("keEp", "peeK"));
        assertTrue(stringAnagram.isAnagramByMap("SiLeNt CAT", "LisTen AcT"));
        assertTrue(stringAnagram.isAnagramByMap("Debit Card", "Bad Credit"));
        assertTrue(stringAnagram.isAnagramByMap("School MASTER", "The ClassROOM"));
        assertTrue(stringAnagram.isAnagramByMap("DORMITORY", "Dirty Room"));
        assertTrue(stringAnagram.isAnagramByMap("ASTRONOMERS", "NO MORE STARS"));
        assertTrue(stringAnagram.isAnagramByMap("", ""));

        assertFalse(stringAnagram.isAnagramByMap("Boo", "This is not an anagram"));
    }
}
