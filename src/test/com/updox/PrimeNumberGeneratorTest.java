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
    private PNGImplementation pNG;

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
        assertFalse(pNG.isPrime(-1));
    }

    @Test
    public void isWorthBuildingPrimeArryReturnsTrueEvenIfParamsBackwards(){
        //if range is less than num calls by calling individual isPrime then arr should be built
        assertTrue(pNG.isWorthBuildingPrimeArry(2,100));
        assertTrue(pNG.isWorthBuildingPrimeArry(100,2));
    }

    @Test
    public void isWorthBuildingPrimeArryReturnsFalseEvenIfParamsBackwards(){
        //if range is less than num calls by calling individual isPrime then arr should be built
        assertFalse(pNG.isWorthBuildingPrimeArry(100,101));
        assertFalse(pNG.isWorthBuildingPrimeArry(101,100));
    }

    @Test
    public void buildPrimeArrReturnsBoolArrOfPrimeOrNot(){
        boolean[] example = new boolean[19];
        int[] primes = {2,3,5,7,11,13,17};

        for(int i =0; i < primes.length; i++){
            example[primes[i]] = true;
        }

        assertArrayEquals(example, pNG.buildPrimeArr(18));

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