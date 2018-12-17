package com.poole.james;

import org.junit.Assert;
import org.junit.Test;

public class ReverseNumbersTest {

    ReverseNumbers reverseNumbers = new ReverseNumbers();

    @Test
    public void reverseNumbersWithStringBuilder() {
        Assert.assertEquals(987654321, reverseNumbers.reverseNumbersWithStringBuilder(123456789));
        Assert.assertEquals(1087564, reverseNumbers.reverseNumbersWithStringBuilder(4657801));
        Assert.assertEquals(1087564, reverseNumbers.reverseNumbersWithStringBuilder(465780100));
    }

    @Test
    public void reverseNumbers() {
        Assert.assertEquals(987654321, reverseNumbers.reverseNumbers(123456789));
        Assert.assertEquals(1087564, reverseNumbers.reverseNumbers(4657801));
        Assert.assertEquals(1087564, reverseNumbers.reverseNumbers(465780100));
    }
}
