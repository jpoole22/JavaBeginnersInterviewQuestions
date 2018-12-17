package com.poole.james;

public class ReverseNumbers {

    public int reverseNumbers(int numberToReverse) {

        int reverse = 0;
        int remainder = 0;

        do {
            remainder = numberToReverse % 10;
            reverse = reverse * 10 + remainder;
            numberToReverse = numberToReverse / 10;
        } while (numberToReverse > 0);

        return reverse;
    }

    public int reverseNumbersWithStringBuilder(int numberToReverse) {

        StringBuilder builder = new StringBuilder().append(numberToReverse);

        String result = builder.reverse().toString();

        return Integer.parseInt(result);
    }
}
