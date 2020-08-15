package pastebin;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.commands.PressEnter;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PasteBinTests {
    
    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
    }
    
    @Test()
    void pasteTextToForm() {
        open("https://pastebin.com/");
        
        $("#postform-text").setValue("Hello from QAGURU");
        executeJavaScript("$('#postform-expiration').attr('style','display: block;')");
        $("#postform-expiration").selectOption("10 Minutes");
        $(byText("Create New Paste")).click();
          
        String titleText = title();
        assertEquals(titleText, "Hello from QAGURU" + " - Pastebin.com");
    }
}
