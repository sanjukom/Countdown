Feature: Test countdown functionalities

  @Scenario1
  Scenario: Test countdown login with valid credentials
    Given User open countdown page in chrome browser
    When User login with valid credentials
    Then Start searching items from the shop list page
    And The relavent products should be displayed in the search results page
    And Adding the required number of each items into the trolly
    And Added items should be displayed in the trolly
    And User should view and save the items successfully
    And User should logout successfully
