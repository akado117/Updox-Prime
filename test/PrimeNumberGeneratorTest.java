package com.updox;

/**
 * Created by akaid01 on 5/21/17.
 */
public class PrimeNumberGeneratorTest {
    private PrimeNumberGenerator pNG;


    @Before
    void setUp () {

    }

    @Test
    public void generateReturnsArrayOfPrimes(){
        List<Integer> expected = [7901, 7907, 7919];

        assertArrayEquals(expected, pNG.generate(7900,7920));
    }

    @Test
    public void generateReturnsArrayOfPrimesWithBackwardsRange(){
        List<Integer> expected = [7901, 7907, 7919];

        assertArrayEquals(expected, pNG.generate(7920,7900));
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
    public void setHighLowSetsHighAndLowValuesCorrect(){
        pNG.setHighLow(20, 14);

        assertEquals(14, pNG.getLowVal)
        assertEquals(20, pNG.getHighVal)
    }

    @Test
    public void setHighLowSetsHighAndLowValuesCorrect(){
        pNG.setHighLow(1337, 123202);

        assertEquals(1337, pNG.getLowVal)
        assertEquals(123202, pNG.getHighVal)
    }
}
