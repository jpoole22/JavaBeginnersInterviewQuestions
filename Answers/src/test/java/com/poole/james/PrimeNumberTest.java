package com.poole.james;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeNumberTest {

    Set<Integer> prime;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void retreivePrimeNumbersCorrect() {
        prime = PrimeNumbers.findPrimeNumbers(50);
        assertTrue(prime.contains(11));
        assertTrue(prime.contains(47));
    }

    @Test
    public void retreivePrimeNumbersIncorrect() {
        prime = PrimeNumbers.findPrimeNumbers(50);
        assertFalse(prime.contains(1));
        assertFalse(prime.contains(50));
    }

    @Test
    public void retreivePrimeNumbersException() {
        expectedException.expect(IllegalArgumentException.class);
        prime = PrimeNumbers.findPrimeNumbers(-1);
    }
}
