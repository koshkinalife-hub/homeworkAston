package Lesson9;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Link extends UiTest {

    @Test
    void shouldOpenMoreInfoLink() {
        $("a[href*='about-service']").click();
        switchTo().window(1);
        assertTrue(WebDriverRunner.url().contains("about-service"));
        closeWindow();
        switchTo().window(0);
    }
}