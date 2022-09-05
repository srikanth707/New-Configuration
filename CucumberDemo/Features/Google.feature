@Google
Feature: Test Google Application Functionality

@Google @Smoke @Sanity @Modular
Scenario Outline: Test Google Home Page functionality
   Given The user has opened "Chrome" browser
   When User enters "https://www.google.co.in" application
   Then User asserts that the page title is "Google"
   
   
   Examples:
   |application|
   |https://www.google.co.in|