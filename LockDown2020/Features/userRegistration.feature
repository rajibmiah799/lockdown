@userRegistration
Feature: user registration
Scenario Outline: add a new valid user
Given I am on user registration homepage
When I click on user register link
And I enter "<first name>", "<last name>", "<phone>","<email>", "<user name>","<password>","<confarm password>"
And I click on submit buttom
Then I find registration successfull page
Examples:
|first name | last name| phone      | email          | user name   | password | confirm password |
| md        | miah      |3473348096 |bd1991@yahoo.com| md rajib    |Ra4789    | Ra4789|
#| mdr       | hossain   |3473348095 |bd199@yahoo.com | md hossain  | Hasf788  | Hasf788|