package JUnit;

import org.junit.Assert;
import org.junit.Test;

public class UtilitarioArrayTest {

    @Test
    public void testeReversao(){

        Integer[] numbers = {1, 2, 3, 4, 5};
        UtilitarioArray.reversao(numbers);

        Integer[] expected = {5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, numbers);
    }

}
