import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(Factorial.factorial(0), 1);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(Factorial.factorial(5), 120); // 5! = 120
        assertEquals(Factorial.factorial(6), 720); // 6! = 720
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "Negative numbers are not allowed.")
    public void testFactorialOfNegativeNumber() {
        Factorial.factorial(-1);
    }
}