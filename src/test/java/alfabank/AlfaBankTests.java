package alfabank;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlfaBankTests {
    @Test
    void checkSizeDepozit() {
        Configuration.holdBrowserOpen = true;
        open("https://alfabank.ru/");
        $(byText("Вклады")).click();
        $(byText("Депозиты")).click();
        $$(".product-cell__cell-back").filter(visible).shouldHaveSize(2);

    }
}
