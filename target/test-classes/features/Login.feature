Feature: Login

  Scenario: User Go To FAQ Page
    Given User already login page
    When User go to customer service page
    And User click on FAQ menu
    Then User success redirect to FAQ menu