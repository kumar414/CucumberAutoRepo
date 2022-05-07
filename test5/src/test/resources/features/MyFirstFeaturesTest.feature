Feature: Create account of FB
As a user you need to open face book home page and do the validations

Background: common login steps
Given User need to be on Facebook login page

@Smoke
Scenario Outline: Validate first name field
When User enters user "<FirstName>" first name
Then User checks user first name is present
Then close browser
Examples:
|FirstName|
|Test|
|Jack|
@Regression
Scenario: Validate create user multiple fields
When User enters user "Test" first name
And User enters user "qa" last name
Then User checks user last name is present
Then close browser