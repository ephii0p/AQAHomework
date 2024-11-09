import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;


public class FactorialTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, Factorial.factorial(5)); // 5! = 120
        assertEquals(720, Factorial.factorial(6)); // 6! = 720
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.factorial(-1);
        });
        assertEquals("Negative numbers are not allowed.", exception.getMessage());
    }
}