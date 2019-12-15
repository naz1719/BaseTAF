package com.project.inftrastructure.middlewares.ui.controls.elements.impl;

import com.project.inftrastructure.execution.logger.templates.MessageTemplatesUI;
import com.project.inftrastructure.middlewares.ui.controls.base.WebControl;
import com.project.inftrastructure.middlewares.ui.controls.elements.Button;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonControl extends WebControl implements Button {
    public ButtonControl(WebElement webElement, String name, String page) {
        super(webElement, name, page);
    }

    @Override
    public void clickJS(WebDriver driver) {
        String message = String.format(MessageTemplatesUI.CLICK_ON, name, page);
        LOG.info(message);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", getWrappedElement());
    }
}
