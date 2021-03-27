@FunctionalTest
Feature: OpenCart application testing

@SmokeTest @RegressionTest
Scenario: Login with correct username and password
Given This is a valid login test
@RegressionTest
Scenario: Login with incorrect username and password
Given This is an invalid login test
@SmokeTest
Scenario: Address Book
Given This is a address book test
@SmokeTest @RegressionTest
Scenario: Affiliate
Given This is a affiliate test
@RegressionTest @End2End
Scenario: Search
Given This is a search test
@SmokeTest @End2End
Scenario: Validate report
Given This is a validation for report test
@End2End
Scenario: logout
Given This is a logout test
