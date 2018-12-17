package com.poole.james;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringAnagram {

    public boolean isAnagramBySort(String first, String second) {

        first = first.replaceAll("\\s", "").toLowerCase();
        second = second.replaceAll("\\s", "").toLowerCase();

        if (!isEqualLengths(first, second)) {
            return false;
        }

        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }

    public boolean isAnagramByArray(String first, String second) {

        first = first.replaceAll("\\s", "").toLowerCase();
        second = second.replaceAll("\\s", "").toLowerCase();

        if (!isEqualLengths(first, second)) {
            return false;
        }

        char[] firstArray = first.toCharArray();

        for (char currentChar : firstArray) {
            // Could use String.indexOf() here rather than another for loop.
            // Something like: second.indexOf(currentChar) != -1
            for (int i = 0; i < second.length(); i++) {
                if (second.charAt(i) == currentChar) {
                    second = second.substring(0, i) + second.substring(i + 1);
                    break;
                }
            }
        }

        if (second.length() > 0) {
            return false;
        }
        return true;
    }

    public boolean isAnagramByStringBuilder(String first, String second) {

        first = first.replaceAll("\\s", "").toLowerCase();
        StringBuilder builder = new StringBuilder(second.replaceAll("\\s", "").toLowerCase());

        if (!isEqualLengths(first, builder.toString())) {
            return false;
        }

        char[] firstArray = first.toCharArray();

        for (char currentChar : firstArray) {
            for (int i = 0; i < builder.length(); i++) {
                if (builder.charAt(i) == currentChar) {
                    builder.deleteCharAt(i);
                    break;
                }
            }
        }

        if (builder.length() > 0) {
            return false;
        }
        return true;
    }

    public boolean isAnagramByMap(String first, String second) {

        first = first.replaceAll("\\s", "").toLowerCase();
        second = second.replaceAll("\\s", "").toLowerCase();

        if (!isEqualLengths(first, second)) {
            return false;
        }

        Map<Character, Integer> characterCount = new HashMap<>();

        for (int i = 0; i < first.length(); i++) {
            if (characterCount.get(first.charAt(i)) == null) {
                characterCount.put(first.charAt(i), 1);
            } else {
                int currentCount = characterCount.get(first.charAt(i));
                characterCount.put(first.charAt(i), ++currentCount);
            }

            if (characterCount.get(second.charAt(i)) == null) {
                characterCount.put(second.charAt(i), -1);
            } else {
                int currentCount = characterCount.get(second.charAt(i));
                characterCount.put(second.charAt(i), --currentCount);
            }
        }

        int total = 0;

        for (int letterCount : characterCount.values()) {
            total += letterCount;
        }

        if (total != 0) {
            return false;
        }

        return true;
    }

    private boolean isEqualLengths(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        return true;
    }
}
