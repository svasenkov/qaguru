package alfabank;

import basetest.BaseTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AlfaBankTests extends BaseTest {
    final String urlAlfaBank="https://alfabank.ru/";
    @Test
    void checkSizeDepozit() {
        open(urlAlfaBank);
        $(byText("Вклады")).click();
        $(byText("Депозиты")).click();
        $$(".product-cell__cell-back").filter(visible).shouldHaveSize(2);
    }

    @Test
    public void openPageDepozitInsurance() {
        open(urlAlfaBank);
        $(byText("Вклады")).click();
        $(".selected").sibling(4).$("a").click();
        $("h1").shouldHave(text("Страхование вкладов"));
        $(".col-sm-8").parent().shouldHave(text("АО «АЛЬФА-БАНК» является участником"));
    }
}
