package com.bitrix.stepdefinitions;

import com.bitrix.pages.AccountSummaryPage;
import com.bitrix.pages.LoginPage;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountSummaryStepDefs {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

    }

    @When("the user clicks on Saving link on the Account Summary page")
    public void the_user_clicks_on_Saving_link_on_the_Account_Summary_page() {
       new AccountSummaryPage().select_online_banking();
       new AccountSummaryPage().select_account_summary();
        new AccountSummaryPage().click_saving_link();

    }
    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
    new AccountSummaryPage().accActUrlCheck();

    }
    @And("Account drop down should have Savings selected")
    public void account_drop_down_should_have_Savings_selected() {

        new AccountSummaryPage().accDropdownCheck();
    }



    @When("the user clicks on  Brokeage link on the Account Summary Page")
    public void the_user_clicks_on_Brokeage_link_on_the_Account_Summary_Page() {
    new AccountSummaryPage().select_online_banking();
    new AccountSummaryPage().select_account_summary();
    new AccountSummaryPage().select_BrokerageBtn();
    }


    @Then("Account drop down should have Brokeage selected")
    public void account_drop_down_should_have_Brokeage_selected() {
        new AccountSummaryPage().BrokerAgeDropdown();
    }




    @When("the user clicks on Checking link on the Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
        new AccountSummaryPage().select_online_banking();
        new AccountSummaryPage().select_account_summary();
        new AccountSummaryPage().select_CheckingkLink();
    }


    @Then("Account drop down should have Checking selected")
    public void account_drop_down_should_have_Checking_selected() {
    new AccountSummaryPage().selesctedCheckingDropdown();
    }



    @When("the user clicks on Credit card link on the Account Summary Page")
    public void the_user_clicks_on_Credit_card_link_on_the_Account_Summary_Page() {

        new AccountSummaryPage().select_online_banking();
        new AccountSummaryPage().select_account_summary();
        new AccountSummaryPage().select_CreditCardLink();
    }

    @Then("Account drop down should have Credit Card selected")
    public void account_drop_down_should_have_Credit_Card_selected() {
    new AccountSummaryPage().CheckCreditCardDropDown();
    }





    @When("the user clicks on Loan link on the Account Summary Page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_Page() {
        new AccountSummaryPage().select_online_banking();
        new AccountSummaryPage().select_account_summary();
        new AccountSummaryPage().select_LoanBtn();
    }


    @Then("Account drop down should have Loan selected")
    public void account_drop_down_should_have_Loan_selected() {
      new AccountSummaryPage().checkLoanDropdown();
    }


}
