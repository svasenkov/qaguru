package pastebin;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PasteBinTests {
    @Test()

    void openPagePasteBin() {
        Configuration.holdBrowserOpen = true;
        open("https://pastebin.com/");
        $(byId("postform-text")).setValue("Hello from QAGURU");

    }
}