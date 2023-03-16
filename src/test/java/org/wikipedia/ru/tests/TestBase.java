package org.wikipedia.ru.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.wikipedia.ru.drivers.BrowserstackDriver;
import org.wikipedia.ru.drivers.MobileDriver;
import org.wikipedia.ru.helpers.Attach;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static org.wikipedia.ru.helpers.Attach.getSessionId;

public class TestBase {
    public static String deviceHost = System.getProperty("deviceHost", "mobile");
    @BeforeAll
    static void beforeAll() {

        switch (deviceHost) {
            case "browserstack":
                Configuration.browser = BrowserstackDriver.class.getName();
                break;
            case "mobile":
                Configuration.browser = MobileDriver.class.getName();
                break;
            default: throw new RuntimeException("deviceHost " + deviceHost + " не поддерживается");
        }
        Configuration.timeout = 15000;
        Configuration.pageLoadTimeout = 15000;
        Configuration.browserSize = null;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    public void tearDown() {
        String sessionId = getSessionId();
        Attach.pageSource();
        closeWebDriver();

        if (deviceHost.equals("browserstack")) {
            Attach.video(sessionId);
        }
    }
}
