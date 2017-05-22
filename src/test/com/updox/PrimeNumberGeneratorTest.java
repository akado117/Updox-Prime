package com.updox;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import updox.PNGImplementation;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by akaid01 on 5/21/17.
 */
public class PrimeNumberGeneratorTest {
    private com.updox.PrimeNumberGenerator pNG;

    @Before
    public void setUp() throws Exception {
        pNG = new PNGImplementation();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void generateReturnsArrayOfPrimes(){
        List<Integer> expected = new ArrayList<Integer>(3);
        expected.set(0,7901);
        expected.set(0,7907);
        expected.set(0,7919);

        assertEquals(expected, pNG.generate(7900,7920));
    }

    @Test
    public void generateReturnsArrayOfPrimesWithBackwardsRange(){
        List<Integer> expected = new ArrayList<Integer>(3);
        expected.set(0,7901);
        expected.set(0,7907);
        expected.set(0,7919);

        assertEquals(expected, pNG.generate(7920,7900));
    }

    @Test
    public void isPrimeReturnsTrueForAPrimeNumber(){
        assertTrue(pNG.isPrime(7901));
        assertTrue(pNG.isPrime(2));
    }

    @Test
    public void isPrimeReturnsFalseForNonPrimeNumber(){
        assertFalse(pNG.isPrime(7900));
        assertFalse(pNG.isPrime(1));
    }

    @Test
    public void setHighLowSetsHighAndLowValuesCorrectly(){
        pNG.setHighLow(20, 14);

        assertEquals(14, pNG.getLowVal());
        assertEquals(20, pNG.getHighVal());
    }

    @Test
    public void setHighLowSetsHighAndLowValuesCorrectlyWithReverseOrder(){
        pNG.setHighLow(1337, 123202);

        assertEquals(1337, pNG.getLowVal());
        assertEquals(123202, pNG.getHighVal());
    }

}