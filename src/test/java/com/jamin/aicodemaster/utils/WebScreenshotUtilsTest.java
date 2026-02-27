package com.jamin.aicodemaster.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebScreenshotUtilsTest {

    @Test
    void saveWebPageScreenshot() {
        String screenshotPath = WebScreenshotUtils.saveWebPageScreenshot("https://bangumi.tv");
        Assertions.assertNotNull(screenshotPath);
    }
}