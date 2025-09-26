package Lesson7;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addSubtractMultiplyDivide() {
        assertEquals(8, Calculator.add(5, 3));
        assertEquals(2, Calculator.subtract(5, 3));
        assertEquals(15, Calculator.multiply(5, 3));
        assertEquals(2.5, Calculator.divide(5, 2), 1e-9);
    }

    @Test
    void divideByZeroThrows() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0));
    }
}