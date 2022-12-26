Feature: salesforce login
Scenario Outline: homepage login

Given Intialize the web driver
When user navaigates to "https://login.salesforce.com/?locale=in"
And user enter <username> and <password> and clicks on login button
Then user should be able to login sucessfully

Examples:
|username||password|
|test12||abcd|
|test123||abcd12|