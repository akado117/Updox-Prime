package updox;

import com.updox.PrimeNumberGenerator;

import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by akaid01 on 5/21/17.
 */
public class PNGImplementation implements PrimeNumberGenerator {
    private boolean[] primeTestArray;
    private int highVal;
    private int lowVal;


    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        return null;
    }

    @Override
    public boolean isPrime(int value) {
        if (value%2==0) return false;

        for(int i=3;i*i<=value;i+=2) {
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
