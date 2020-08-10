package alfabank;

import basetest.BaseTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class AlfaBankTests extends BaseTest {
    final String urlAlfaBank = "https://alfabank.ru/";

    @Test
    void checkSizeDepozit() {
        open(urlAlfaBank);

        $(byTitle("Вклады")).click();
        $(byTitle("Депозиты")).click();
        $(byText("Архивные депозиты")).click();

        $$((".product-cell__cell-back")).shouldHaveSize(3);
    }

    @Test
    public void openPageDepozitInsurance() {
        open(urlAlfaBank);

        $(byTitle("Вклады")).click();
        $(".selected").sibling(4).click();

        //ниже не работает почему то, буду разбираться.
      //  $(byTitle("Страхование вкладов")).parent().parent().sibling(4).click();

       $("h1").shouldHave(text("Страхование вкладов"));
       $(".col-sm-8").shouldHave(text("АО «АЛЬФА-БАНК» является участником"));
    }
}
