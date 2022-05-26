@navigate
Feature: Navigating to specific accounts in Accounts Activity


  Scenario: Saving account redirect
    Given the user is logged in
    When the user clicks on Saving link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have Savings selected

    Scenario: Brokeage account redirect
      Given the user is logged in
      When the user clicks on  Brokeage link on the Account Summary Page
      Then the Account Activity page should be displayed
      And Account drop down should have Brokeage selected


      Scenario: Checking account redirect
        Given the user is logged in
        When  the user clicks on Checking link on the Account Summary page
        Then  the Account Activity page should be displayed
        And   Account drop down should have Checking selected

        Scenario: Credit Card account redirect
          Given the user is logged in
          When  the user clicks on Credit card link on the Account Summary Page
          Then  the Account Activity page should be displayed
          And   Account drop down should have Credit Card selected

          Scenario: Loan account redirect
            Given the user is logged in
            When  the user clicks on Loan link on the Account Summary Page
            Then  the Account Activity page should be displayed
            And   Account drop down should have Loan selected

