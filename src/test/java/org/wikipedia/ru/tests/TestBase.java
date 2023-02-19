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
    public static String deviceHost = System.getProperty("deviceHost");
    @BeforeAll
    static void beforeAll() {
        if (deviceHost == null) {
            deviceHost = "mobile";
        }

        switch (deviceHost) {
            case "browserstack":
                Configuration.browser = BrowserstackDriver.class.getName();
                break;
            case "mobile":
                Configuration.browser = MobileDriver.class.getName();
                break;
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
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        closeWebDriver();
        switch (deviceHost) {
            case "browserstack":
                Attach.video(sessionId);
                break;
        }
    }
}
