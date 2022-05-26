package com.bitrix.pages;

import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy (id="user_login")
    WebElement login;

    @FindBy (id="user_password")
    WebElement passworda;

    @FindBy (name="submit")
    WebElement signin;

    @FindBy (id="signin_button")
    WebElement signin_button;



    public void login(String username, String password) {
        BrowserUtils.waitFor(5);
        new Actions(Driver.get()).moveToElement(signin_button).click().build().perform();

        BrowserUtils.waitFor(5);
        login.sendKeys(username);
        passworda.sendKeys(password);
        signin.click();
        BrowserUtils.waitFor(2);
        Driver.get().navigate().back();
    }

}
