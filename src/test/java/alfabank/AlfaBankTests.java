package alfabank;

import basetest.BaseTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class AlfaBankTests extends BaseTest {
    final String URL_ALFA_BANK = "https://alfabank.ru/";

    @Test
    void checkSizeDepozit() {
        open(URL_ALFA_BANK);

        $(byTitle("Вклады")).click();
        $(byTitle("Депозиты")).click();
        $(byText("Архивные депозиты")).click();

        $$((".product-cell__cell-back")).shouldHaveSize(3);
    }

    @Test
    public void openPageDepozitInsurance() {
        open(URL_ALFA_BANK);

        $(byTitle("Вклады")).click();

        $(byTitle("Страхование вкладов")).parent().lastChild().click();

        $("h1").shouldHave(text("Страхование вкладов"));
        $(".col-sm-8").shouldHave(text("АО «АЛЬФА-БАНК» является участником"));
    }
}
