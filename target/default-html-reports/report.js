$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/FindTransactions.feature");
formatter.feature({
  "name": "Find Transactions in Account Activity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search date range",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user accesses the Find Transactions tab",
  "keyword": "Given "
});
formatter.match({
  "location": "com.bitrix.stepdefinitions.FindTransactionsStepDefs.the_user_accesses_the_Find_Transactions_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters date range from \"2012-09-01\" to \"2012-09-06\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.bitrix.stepdefinitions.FindTransactionsStepDefs.the_user_enters_date_range_from_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks search",
  "keyword": "And "
});
formatter.match({
  "location": "com.bitrix.stepdefinitions.FindTransactionsStepDefs.clicks_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "result table should only show transactions dates between \"2012-09-01\" to \"2012-09-06\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.stepdefinitions.FindTransactionsStepDefs.result_table_should_only_show_transactions_dates_between_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0\r\n\tat java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)\r\n\tat java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)\r\n\tat java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)\r\n\tat java.base/java.util.Objects.checkIndex(Objects.java:373)\r\n\tat java.base/java.util.ArrayList.get(ArrayList.java:425)\r\n\tat com.bitrix.pages.FindTransactionsPage.found_dates(FindTransactionsPage.java:40)\r\n\tat com.bitrix.stepdefinitions.FindTransactionsStepDefs.result_table_should_only_show_transactions_dates_between_to(FindTransactionsStepDefs.java:41)\r\n\tat ✽.result table should only show transactions dates between \"2012-09-01\" to \"2012-09-06\"(file:///C:/Users/Armagan/IdeaProjects/zerobank-automation/src/test/resources/features/FindTransactions.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the results should be sorted by most recent date",
  "keyword": "And "
});
formatter.match({
  "location": "com.bitrix.stepdefinitions.FindTransactionsStepDefs.the_results_should_be_sorted_by_most_recent_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user enters date range from \"2012-09-02\" to \"2012-09-06\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.bitrix.stepdefinitions.FindTransactionsStepDefs.the_user_enters_date_range_from_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicks search",
  "keyword": "And "
});
formatter.match({
  "location": "com.bitrix.stepdefinitions.FindTransactionsStepDefs.clicks_search()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "result table should only show transactions dates between \"2012-09-02\" to \"2012-09-06\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bitrix.stepdefinitions.FindTransactionsStepDefs.result_table_should_only_show_transactions_dates_between_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the results table should only not contain transactions dated \"2012-09-01\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.bitrix.stepdefinitions.FindTransactionsStepDefs.the_results_table_should_only_not_contain_transactions_dated(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
});