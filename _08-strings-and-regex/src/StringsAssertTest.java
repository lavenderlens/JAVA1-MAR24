import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsAssertTest {
    //ensure assertions are enabled for file
    @Test
    public void twoPoolStringsAreEqual(){
        var s1 = "Hello";
        var s2 = "Hello";
        assertEquals(s1,s2);
    }
}
