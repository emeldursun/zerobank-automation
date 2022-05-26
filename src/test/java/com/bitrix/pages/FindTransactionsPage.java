package com.bitrix.pages;

import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FindTransactionsPage {
    public FindTransactionsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

@FindBy(xpath="//input[@id='aa_fromDate']")
    WebElement fromDate;

    @FindBy(xpath="//input[@id='aa_toDate']")
    WebElement toDate;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement findBtn;

    @FindBy(xpath="//div[@id='filtered_transactions_for_account']//tbody//tr/td[1]")
    List<WebElement> filtered_dates;

    public void DateFromTo(String date1,String date2){
        BrowserUtils.waitFor(2);
        fromDate.sendKeys(date1);
        toDate.sendKeys(date2);
    }
    public void selectFindBtn(){
        findBtn.click();

    }
    public void found_dates(){
        System.out.println(BrowserUtils.getElementsText(filtered_dates));
        String a= BrowserUtils.getElementsText(filtered_dates).get(0);
        String b= BrowserUtils.getElementsText(filtered_dates).get(1);
        String c= BrowserUtils.getElementsText(filtered_dates).get(2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


}

