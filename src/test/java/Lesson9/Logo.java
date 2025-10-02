package Lesson9;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$$;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Logo extends UiTest {

    @Test
    void shouldHavePaymentSystemLogos() {
        $$(".pay__form img").forEach(logo -> assertTrue(logo.isDisplayed()));
    }
}