package pastebin;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasteBinTests {
    @Test()

    void pasteTextToForm() {
        Configuration.holdBrowserOpen = true;
        open("https://pastebin.com/");
        $(byId("postform-text")).setValue("Hello from QAGURU");
       //не работает, скрыт список
        $(byId("postform-expiration")).selectOption("10 Minutes");
        $(byXpath("//button[text()='Create New Paste']")).click();

        //title не срабатывает?
     //   $("title").shouldHave(exactText("Hello from QAGURU"));

        //   $(byXpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/ol/li/div")).shouldHave(exactText("Hello from QAGURU"));
    }
}