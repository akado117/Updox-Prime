package updox;
import java.util.List;

/**
 * Created by akaid01 on 5/21/17.
 */
public interface PrimeNumberGenerator {
    List<Integer> generate (int startingValue, int endingValue );

    void setHighLow (int val1, int val2);

    boolean isPrime (int value);

    boolean isWorthBuildingPrimeArry (int lowValue, int highValue);

    boolean[] buildPrimeArr(int highValue);

    int getHighVal ();
    int getLowVal ();

}
