package com.poole.james;

public class ReverseString {

    public static String reverseWithStringBuilder(String stringToBeReversed) {
        if (stringToBeReversed != null) {
            return new StringBuilder(stringToBeReversed).reverse().toString();
        }
        return null;
    }

    public static String reverseWithStringBuilderManually(String stringToBeReversed) {

        if (stringToBeReversed != null) {
            StringBuilder stringBuilder = new StringBuilder(stringToBeReversed.length());

            for (int i = stringToBeReversed.length() - 1; i >= 0; i--) {
                stringBuilder.append(stringToBeReversed.charAt(i));
            }

            return stringBuilder.toString();
        }
        return null;
    }

    public static String reverseWithArrays(String stringToBeReversed) {

        if (stringToBeReversed != null) {
            char[] placeHolder = new char[stringToBeReversed.length()];

            for (int i = stringToBeReversed.length() - 1, j = 0; i >= 0; i--, j++) {
                placeHolder[j] = stringToBeReversed.charAt(i);
            }

            return new String(placeHolder);
        }
        return null;
    }

    public static String reverseWithRecursion(String stringToBeReversed) {

        if ((stringToBeReversed == null) || (stringToBeReversed.length() <= 1)) {
            return stringToBeReversed;
        }

        return reverseWithRecursion(stringToBeReversed.substring(1)) + stringToBeReversed.charAt(0);
    }

    public static String reverseWithSingleArray(String stringToBeReversed) {
        if (stringToBeReversed != null) {
            char[] toBeReversed = stringToBeReversed.toCharArray();

            int start = 0;
            int end = toBeReversed.length - 1;

            while (end > start) {
                char temp = toBeReversed[start];
                toBeReversed[start] = toBeReversed[end];
                toBeReversed[end] = temp;
                start++;
                end--;
            }
            return new String(toBeReversed);
        }
        return null;
    }
}
