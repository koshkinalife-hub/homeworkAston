package Lesson7;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorialOfZero() {
        assertEquals(1L, Factorial.factorial(0));
    }

    @Test
    void factorialOfFive() {
        assertEquals(120L, Factorial.factorial(5));
    }

    @Test
    void factorialNegativeThrows() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }
}