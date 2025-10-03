package Lesson10;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Block extends UiTest {

    private final Page Page = new Page();

    @Test
    void shouldDisplayCorrectBlockTitle() {
        assertEquals("Онлайн пополнение без комиссии", Page.getBlockTitle());
    }
}