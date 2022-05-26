package com.bitrix.pages;

import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.Driver;
import io.cucumber.java.cs.A;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummaryPage{

    public AccountSummaryPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath ="//div[contains(strong, 'Online Banking')]")
    WebElement onlineBankingBtn;

    @FindBy(id="account_summary_link")
    WebElement accSummaryBtn;

    @FindBy(xpath = "(//tr/td/a)[1]")
    WebElement savingBtn;

    @FindBy(xpath = "//div/select/option[1]")
    WebElement dropDownBtn;

    @FindBy(xpath = "//a[contains(text(),'Brokerage')]")
    WebElement brokerageBtn;

    @FindBy(xpath = "//option[contains(text(),'Brokerage')]")
    WebElement brokeragedropdown;

    @FindBy(xpath = "//a[contains(text(),'Checking')]")
    WebElement ChekingLink;

    @FindBy(xpath = "//option[contains(text(),'Checking')]")
    WebElement CheckingDropdown;

    @FindBy(xpath = "//a[contains(text(),'Credit Card')]")
    WebElement CreditCardLink;

    @FindBy(xpath = "//option[contains(text(),'Credit Card')]")
    WebElement CreditCardDropDown;

    @FindBy(xpath = "//a[contains(text(),'Loan')]")
    WebElement loanBtn;

    @FindBy(xpath = "//option[contains(text(),'Loan')]")
    WebElement loanDropDown;

public void select_online_banking(){
    onlineBankingBtn.click();
    BrowserUtils.waitFor(5);
}
public void select_account_summary(){
    accSummaryBtn.click();
    BrowserUtils.waitFor(5);
}
    public void click_saving_link(){
        savingBtn.click();
    }

    public void accActUrlCheck(){

       String actualUrl =  Driver.get().getCurrentUrl();
       Assert.assertTrue(actualUrl.contains("account-activity"));

    }

    public void accDropdownCheck(){
        System.out.println("accdropdown assertion");
        Assert.assertTrue(dropDownBtn.isSelected());

    }
public void select_BrokerageBtn(){
    System.out.println("borkeragebtn method");
        new Actions(Driver.get()).moveToElement(brokerageBtn).click().build().perform();
}
public void BrokerAgeDropdown(){
    System.out.println("brokeragedropdown assertion");
        Assert.assertTrue(brokeragedropdown.isSelected());

}
public void select_CheckingkLink(){
    ChekingLink.click();

}

public void selesctedCheckingDropdown(){
    System.out.println("CheckingDropdown assertion");
    Assert.assertTrue(CheckingDropdown.isSelected());
}
public void select_CreditCardLink(){
    CreditCardLink.click();

}
public void CheckCreditCardDropDown(){
    System.out.println("Credit card drop down assertion");
    Assert.assertTrue(CreditCardDropDown.isSelected());
}
public void select_LoanBtn(){
    loanBtn.click();
}

public void checkLoanDropdown(){
    System.out.println("loan dropdown assertion");
    Assert.assertTrue(loanDropDown.isSelected());
}

}




