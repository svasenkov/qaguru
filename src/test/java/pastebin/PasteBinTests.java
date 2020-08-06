package pastebin;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.commands.PressEnter;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasteBinTests {
    @Test()
    void pasteTextToForm() {
        Configuration.holdBrowserOpen = true;
        open("https://pastebin.com/");
        $(byId("postform-text")).setValue("Hello from QAGURU");
        executeJavaScript("$('#postform-expiration').attr('style','display: block;')");
        $("#postform-expiration").selectOption("10 Minutes");
        $(byXpath("//button[text()='Create New Paste']")).click();
        sleep(2000);
        assertEquals(title(), "Hello from QAGURU" + " - Pastebin.com");


    }
}