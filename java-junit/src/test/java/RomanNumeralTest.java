import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RomanNumeralTest {

    private int testValue;
    private String expectedValue;

    public RomanNumeralTest(int input, String expected) {
        testValue = input;
        expectedValue = expected;
    }

    @Test
    public void toRoman() {
        assertThat(RomanNumeral.toRoman(testValue), is(expectedValue));
    }

    @Parameters
    public static Collection arabicToRoman() {
        return Arrays.asList(new Object[][] {
                {1, "I"},
                {2, "II"},
                {5, "V"},
                {7, "VII"},
                {10, "X"}
        });
    }

}