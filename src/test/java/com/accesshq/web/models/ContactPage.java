package com.accesshq.web.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {

    private final WebDriver driver;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getEmailErrorText() {
        return "test";
        //WebElement driver.findElements(By.id("email"));
    }

    public void clickSubmit() {
        driver.findElement(By.cssSelector("[ariel=submit]")).click();
    }

    public String getTelephoneErrorText() {
        //WebElement driver.findElements(By.id("telephone"));
        return "Test";
    }
}
