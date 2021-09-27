@QVision
Feature: QVision

  @creacionYValidacionUsuario
  Scenario Outline: User creation
    Given We enter the page utest
    And We select the button JoinToday
    When we verify that we are on the personal information page
   And Register the data of the personal information page 
   |<FirstName>|<LastName>|
    When we verify that we are on the Location  page 
    And Register the data of the Location page
    |<City>|
    When we verify that we are on the devices  page
    And Register the data of the devices page
    When we verify that we are on the Password page
    And Register the data of the Password page
    When I verify that it is on the home page

Examples:
|FirstName	|LastName				|City	|
|Andres			|Perez					|Bogot	|