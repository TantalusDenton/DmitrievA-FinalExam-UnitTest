import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SreingCalculatorTest {

    private StringCalculator sc;

    @BeforeEach
    public void setUp() {
        sc = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        StringCalculator = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        StringCalculator.add("-1,5")     -> exception
        assertThrows(StringCalculator.detectCapitalUse());

    }

    @Test
    public void detectCapitalUseTest1() {
        //Numbers bigger than 1000 should be ignored.
        StringCalculator.add("1,1000")   -> 1

    }

}
