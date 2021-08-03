Feature: As a user of Guru page
  I want to log into the page
  to create a customer, create an account and delete and verify that it has been deleted



  Background:
    Given User log into Guru Page

    Scenario: Create customer
      When user creates a customer
      Then user verifies the messsage it has been create correctly

    Scenario: Create an account
      When user creates an account
      Then user verifies the message the account has been create correctly

    Scenario: Delete the account and verify it is deleted

