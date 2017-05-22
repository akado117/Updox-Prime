package com.updox;

import java.util.List;

/**
 * Created by akaid01 on 5/21/17.
 */
public class PNGImplementation implements PrimeNumberGenerator {
    private List<Integer> primeTestArray;
    private int highVal;
    private int lowVal;





    public int getHighVal() {
        return highVal;
    }

    @Override
    public void setHighVal(int highVal) {
        this.highVal = highVal;
    }

    public int getLowVal() {
        return lowVal;
    }

    @Override
    public void setLowVal(int lowVal) {
        this.lowVal = lowVal;
    }

}
