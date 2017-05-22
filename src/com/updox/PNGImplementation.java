package updox;

import java.util.Arrays;
import java.util.List;

/**
 * Created by akaid01 on 5/21/17.
 */
public class PNGImplementation implements PrimeNumberGenerator {
    private boolean[] primeTestArray;
    private int highVal;
    private int lowVal;


    @Override //not sure about handling massive numbers beyond range of normal int in java 2147483647
    public List<Integer> generate(int startingValue, int endingValue) {
        return null;
    }

    @Override
    public boolean isWorthBuildingPrimeArry(int lowValue, int highValue) {
        int range;
        int highVal;
        if(lowValue < highValue){
            range = highValue - lowValue + 1;
            highVal = highValue;
        } else {
            range = lowValue - highValue + 1;
            highVal = lowValue;
        }

        double isPrimeOps =  Math.sqrt(highVal/2) * range;//not 100% accurate, but quick and dirty computationally

        return highVal+ 1 < isPrimeOps;

    }

    @Override
    public boolean[] buildPrimeArr(int highValue) {
        boolean[] primeArr = new boolean[highValue + 1];
        Arrays.fill(primeArr, true);

        primeArr[0]=primeArr[1]=false;       // we know 0 and 1 are not prime.
        for (int i=2;i<primeArr.length;i++) {

            if(primeArr[i]) {//if isn't multiple of anything before consider prime, but remove any multiples of it.
                for (int j=i;i*j<primeArr.length;j++) {
                    primeArr[i * j] = false;
                }
            }
        }
        return primeArr;
    }

    @Override
    public boolean isPrime(int value) {
        if (value < 2 || (value!=2 && value%2==0)) return false;//check if less than 2 or multiple of 2 but not 2

        for(int i=3;i*i<=value;i+=2) {//skips every other and starts at 3
            if(value%i==0)
                return false;
        }
        return true;
    }

    public void setHighLow(int val1, int val2) {
        if(val1 < val2){
            setLowVal(val1);
            setHighVal(val2);
        } else {
            setLowVal(val2);
            setHighVal(val1);
        }
    }

    @Override
    public int getHighVal() {
        return highVal;
    }

    private void setHighVal(int highVal) {
        this.highVal = highVal;
    }

    @Override
    public int getLowVal() {
        return lowVal;
    }

    private void setLowVal(int lowVal) {
        this.lowVal = lowVal;
    }

}
