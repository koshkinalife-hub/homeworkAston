package Lesson10;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
public class Page {
    //Заголовок
    private final SelenideElement blockTitle = $("section.payment h2");

    // Вкладка услуги связи
    private final SelenideElement phoneConnection = $("#connection-phone");
    private final SelenideElement sumConnection = $("#connection-sum");
    private final SelenideElement emailConnection = $("#connection-email");
    private final SelenideElement submitConnection = $("#pay-connection button[type='submit']");

    // Ошибки
    private final SelenideElement phoneError = phoneConnection.parent().$("p");
    private final SelenideElement sumError = sumConnection.parent().$("p");
    private final SelenideElement emailError = emailConnection.parent().$("p");

    //Вкладка домашний интернет
    private final SelenideElement phoneInternet = $("#internet-phone");
    private final SelenideElement sumInternet = $("#internet-sum");
    private final SelenideElement emailInternet = $("#internet-email");

    //Вкладка рассрочка
    private final SelenideElement phoneInstalment = $("#instalment-phone");
    private final SelenideElement sumInstalment = $("#instalment-sum");
    private final SelenideElement emailInstalment = $("#instalment-email");

    // Вкладка задолженность
    private final SelenideElement phoneArrears = $("#arrears-phone");
    private final SelenideElement sumArrears = $("#arrears-sum");
    private final SelenideElement emailArrears = $("#arrears-email");

    // Метод
    public String getBlockTitle() {
        return blockTitle.getText().replace("\n", " ");
    }

    // Плейсхолдеры для услуг связи
    public String getPhonePlaceholder() { return phoneConnection.getAttribute("placeholder"); }
    public String getSumPlaceholder() { return sumConnection.getAttribute("placeholder"); }
    public String getEmailPlaceholder() { return emailConnection.getAttribute("placeholder"); }

    // Плейсхолдеры для других вкладок
    public String getInternetPhonePlaceholder() { return phoneInternet.getAttribute("placeholder"); }
    public String getInternetSumPlaceholder() { return sumInternet.getAttribute("placeholder"); }
    public String getInternetEmailPlaceholder() { return emailInternet.getAttribute("placeholder"); }

    public String getInstalmentPhonePlaceholder() { return phoneInstalment.getAttribute("placeholder"); }
    public String getInstalmentSumPlaceholder() { return sumInstalment.getAttribute("placeholder"); }
    public String getInstalmentEmailPlaceholder() { return emailInstalment.getAttribute("placeholder"); }

    public String getArrearsPhonePlaceholder() { return phoneArrears.getAttribute("placeholder"); }
    public String getArrearsSumPlaceholder() { return sumArrears.getAttribute("placeholder"); }
    public String getArrearsEmailPlaceholder() { return emailArrears.getAttribute("placeholder"); }

    // Заполнение формы Услуги связи
    public void fillConnectionForm(String phone, String sum, String email) {
        phoneConnection.setValue(phone);
        sumConnection.setValue(sum);
        emailConnection.setValue(email);
    }

    public void submitConnectionForm() {
        submitConnection.click();
    }

    // Ошибки
    public SelenideElement getPhoneError() { return phoneError; }
    public SelenideElement getSumError() { return sumError; }
    public SelenideElement getEmailError() { return emailError; }
}