
Feature: Login
 
  @sanity
  Scenario: Success Login
  
  Given Enter "suba" and "asdf1234"
  When Click on Login button
  Then Home page is displayed
  
 @sanity @smoke
 Scenario: Failure Login
 
  Given Enter "suba"
  When Click on Login button
  Then Home page is not displayed
 