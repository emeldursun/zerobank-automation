package com.bitrix.stepdefinitions;

import com.bitrix.pages.AccountActivityPage;
import com.bitrix.pages.FindTransactionsPage;
import com.bitrix.pages.LoginPage;
import com.bitrix.pages.OnlineBankingPage;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FindTransactionsStepDefs {
    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

        new OnlineBankingPage().SelectOnlineBankPage();
        new  OnlineBankingPage().SelectCheckinAccActPage();
        new AccountActivityPage().selectFindTransLink();
    }
    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String date1, String date2) {
        new FindTransactionsPage().DateFromTo(date1, date2);

    }
    @When("clicks search")
    public void clicks_search() {
        new FindTransactionsPage().selectFindBtn();

    }
    @Then("result table should only show transactions dates between {string} to {string}")
    public void result_table_should_only_show_transactions_dates_between_to(String string, String string2) {
new FindTransactionsPage().found_dates();
    }
    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {


    }
    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String string) {


    }


}
