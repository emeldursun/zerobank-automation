package com.bitrix.pages;

import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountActivityPage {
    public AccountActivityPage () {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Find Transactions']")
    WebElement FindTransLink;


     public void selectFindTransLink(){
         FindTransLink.click();

     }
}
