
Feature: Login
 
 
  Scenario Outline: Success Login
  
  Given Enter "<name>" and
  And Enter the "<password>" in the field
  When Click on Login button
  Then Home page is displayed
  
  Examples:
  |name |password|
  |Megna|abbbsd123|
  |Pravena|hhsf124|
  
  
 