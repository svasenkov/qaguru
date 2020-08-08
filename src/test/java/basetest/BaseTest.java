package basetest;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    @BeforeEach
    public void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.fastSetValue = true;
        Configuration.startMaximized = true;
        Configuration.timeout = 6000;
    }
}
