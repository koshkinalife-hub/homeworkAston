package Lesson9;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Form extends UiTest {

    @Test
    void shouldSubmitFormWithValidData() {
        $("#pay").selectOption("Услуги связи");
        $("#connection-phone").setValue("297777777");
        $("#connection-sum").setValue("10");
        $("form#pay-connection button[type='submit']").click();

        assertTrue(WebDriverRunner.url().contains("pay"));
    }

    @Test
    void shouldNotSubmitWithEmptyPhone() {
        $("#pay").selectOption("Услуги связи");
        $("#connection-phone").setValue("");
        $("#connection-sum").setValue("10");
        $("form#pay-connection button[type='submit']").click();

        assertTrue($("#connection-phone").parent().getText().contains("Номер телефона"));
    }

    @Test
    void shouldNotSubmitWithInvalidSum() {
        $("#pay").selectOption("Услуги связи");
        $("#connection-phone").setValue("297777777");
        $("#connection-sum").setValue("-5");
        $("form#pay-connection button[type='submit']").click();

        assertTrue($("#connection-sum").parent().getText().contains("Сумма"));
    }
}