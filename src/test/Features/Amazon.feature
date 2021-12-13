Feature: Login to Amazon
  Scenario: User login to amazon
    Given user is on amazon login page
    When user enter username as "email_id" and password as "password"
    And user clicks on login button