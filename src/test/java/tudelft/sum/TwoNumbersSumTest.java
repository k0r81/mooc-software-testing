package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {

    @Test
    public void addTwoNumbers(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(5,5));
        ArrayList<Integer> second = new ArrayList<Integer>(Arrays.asList(1,5));
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(7,0));
        ArrayList<Integer> result = twoNumbersSum.addTwoNumbers(first, second);
        Assertions.assertEquals( expected, result );
    }
}
