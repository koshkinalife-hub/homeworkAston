package Lesson7;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaTest {

    @Test
    void area345() {
        assertEquals(6.0, TriangleArea.areaBySides(3,4,5), 1e-9);
    }

    @Test
    void invalidTriangleThrows() {
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.areaBySides(1,2,3)); // вырожденный
    }
}