package Lesson9;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.*;

public class BlockTest extends UiTest {

    @Test
    void shouldDisplayCorrectBlockTitle() {
        String title = $("h2").getText().replace("\n", " ");
        assertEquals("Онлайн пополнение без комиссии", title);
    }

    @Test
    void shouldFailIfWrongBlockTitle() {
        String title = $("h2").getText().replace("\n", " ");
        assertNotEquals("Пополнение онлайн", title);
    }
}
