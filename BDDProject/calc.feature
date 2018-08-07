
Feature: Calculator
  As a user i want to use calculator for addition of two numbers

  @tag1
  Scenario Outline: Addition of two numbers
    Given I have a calculator
    When I add <a> and <b>
    Then the result should be <a+b>
 

    Examples: 
      | a  | b | a+b |
      | 2  | 5 | 7 |
      | 4  | 7 | 11|
      | 5  | 5 | 10 |
      | 10 | 5 | 15 |
