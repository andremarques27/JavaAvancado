package JUnit;

import org.junit.Assert;
import org.junit.Test;

public class UtilitarioStringTest {

    @Test
    public void testeEmpty() {
        boolean b;

        b = UtilitarioString.isEmpty("abc");
        Assert.assertFalse(b);

        b = UtilitarioString.isEmpty(null);
        Assert.assertTrue(b);

        b = UtilitarioString.isEmpty("");
        Assert.assertTrue(b);
    }

    @Test
    public void testReversao() {

        String r = UtilitarioString.reversao("fghi");
        Assert.assertEquals("ihgf", r);

        r = UtilitarioString.reversao(null);
        Assert.assertNull(r);
    }
}
