package com.bitrix.pages;

import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineBankingPage {
    public OnlineBankingPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath="//strong[normalize-space()='Online Banking']")
    WebElement onlineBankigBtn;

    @FindBy(xpath = "//span[@id='account_activity_link']")
    WebElement checkinAccAtvPage;

    public void SelectOnlineBankPage(){
        onlineBankigBtn.click();
    }

public void SelectCheckinAccActPage(){
        checkinAccAtvPage.click();
}

}

