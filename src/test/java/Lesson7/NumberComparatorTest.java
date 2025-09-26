package Lesson7;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberComparatorTest {

    @Test
    void compareValues() {
        assertEquals(-1, NumberComparator.compare(2,3));
        assertEquals(0, NumberComparator.compare(3,3));
        assertEquals(1, NumberComparator.compare(5,3));
    }

    @Test
    void booleans() {
        assertTrue(NumberComparator.isGreater(5,3));
        assertFalse(NumberComparator.isGreater(2,3));
        assertTrue(NumberComparator.isEqual(7,7));
    }
}