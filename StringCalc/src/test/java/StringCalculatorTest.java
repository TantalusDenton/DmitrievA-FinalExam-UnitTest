import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    private StringCalculator sc;

    @BeforeEach
    public void setUp() {
        sc = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        sc = null;
    }

    @Test
    public void detectNegativeNumber() {
        StringCalculator.add("-1,5");
        assertThrows(RuntimeException.class, () ->{});

    }

    @Test
    public void detectGreaterThan1000() {
        //Numbers bigger than 1000 should be ignored.
        assertEquals(StringCalculator.add("1,1000"),1);
    }

}
