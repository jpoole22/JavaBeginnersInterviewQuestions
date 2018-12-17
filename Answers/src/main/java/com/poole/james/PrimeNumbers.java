package com.poole.james;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrimeNumbers {

    public static Set<Integer> findPrimeNumbers(int numberOfPrimeToReturn) {

        if (numberOfPrimeToReturn < 1) {
            throw new IllegalArgumentException("Must be greater than zero");
        }

        Set<Integer> primeNumbers = new TreeSet<Integer>();

        for (int i = 1; true; i++) {
            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                primeNumbers.add(i);
            }
            if (primeNumbers.size() == numberOfPrimeToReturn) {
                break;
            }
        }

        return primeNumbers;
    }
}
