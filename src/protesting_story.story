Scenario: check the main page
Given Open the Protesting page
When I open the url */*
Then the page *main* is opened

Scenario: check the contact us page
Given I am on the *main* page
When I click the link *contact us* on the footer
Then *Facebook* image link present

Scenario: check the Facebook page
Given I am on the *contact us* page
When I click the *Facebook* link
Then the page *Facebook* page is opened

Scenario: check the anti-hack page
Given I am on the **main** page
When I open URL */admin*
Then the *anti hack* page is opened

Scenario: check the error page
Given I am on the ***main*** page
When I open url */blahblah*
Then the *error* page is opened
