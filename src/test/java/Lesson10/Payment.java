package Lesson10;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.codeborne.selenide.Condition.visible;

public class Payment extends UiTest {

    private final Page Page = new Page();

    // + тесты

    @Test
    void shouldShowCorrectPlaceholdersForConnectionForm() {
        assertEquals("Номер телефона", Page.getPhonePlaceholder());
        assertEquals("Сумма", Page.getSumPlaceholder());
        assertEquals("E-mail для отправки чека", Page.getEmailPlaceholder());
    }

    @Test
    void shouldShowCorrectPlaceholdersForInternetForm() {
        assertEquals("Номер абонента", Page.getInternetPhonePlaceholder());
        assertEquals("Сумма", Page.getInternetSumPlaceholder());
        assertEquals("E-mail для отправки чека", Page.getInternetEmailPlaceholder());
    }

    @Test
    void shouldShowCorrectPlaceholdersForInstalmentForm() {
        assertEquals("Номер договора", Page.getInstalmentPhonePlaceholder());
        assertEquals("Сумма", Page.getInstalmentSumPlaceholder());
        assertEquals("E-mail для отправки чека", Page.getInstalmentEmailPlaceholder());
    }

    @Test
    void shouldShowCorrectPlaceholdersForArrearsForm() {
        assertEquals("Номер договора", Page.getArrearsPhonePlaceholder());
        assertEquals("Сумма", Page.getArrearsSumPlaceholder());
        assertEquals("E-mail для отправки чека", Page.getArrearsEmailPlaceholder());
    }

    @Test
    void shouldFillAndSubmitConnectionForm() {
        Page.fillConnectionForm("297777777", "10", "test@test.com");
        Page.submitConnectionForm();
    }

    // -тесты
    @Test
    void shouldShowErrorIfPhoneEmpty() {
        Page.fillConnectionForm("", "10", "test@test.com");
        Page.submitConnectionForm();
        Page.getPhoneError().shouldBe(visible);
    }

    @Test
    void shouldShowErrorIfSumEmpty() {
        Page.fillConnectionForm("297777777", "", "test@test.com");
        Page.submitConnectionForm();
        Page.getSumError().shouldBe(visible);
    }

    @Test
    void shouldShowErrorIfEmailInvalid() {
        Page.fillConnectionForm("297777777", "10", "invalid-email");
        Page.submitConnectionForm();
        Page.getEmailError().shouldBe(visible);
    }
}