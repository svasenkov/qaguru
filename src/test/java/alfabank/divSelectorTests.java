package alfabank;

import basetest.BaseTest;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class divSelectorTests extends BaseTest {
    @Test
    public void checkDiv() {
        open("file:/home/evgeniy/IdeaProjects/qaguru/src/test/resources/divtest.html");
        $("div h1").shouldHave(text("Text1"));
        $("div").$("h1").shouldHave(text("Text1"));
        //не нашел разницы, может на сложном форматировании есть...
    }
}
