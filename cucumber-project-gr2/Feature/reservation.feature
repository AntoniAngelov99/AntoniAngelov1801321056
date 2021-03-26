
Feature: Резервация

  @tag1
  Scenario: Reservation with valid information
    Given Opens reservation window
    When Enter first name "Petar"
    And Enter last name "Angelov"
    And Enters seat number "3"
    And Clicks on button Reserve
    Then Gets message "OK"
    
      Scenario: Reservation with unvalid information
    Given Opens reservation window
    When Enter first name "Ivan"
    And Enter last name "Georgiev"
    And Enters seat number "5"
    And Clicks on button Reserve
    Then Gets message "Reservation unsuccessfull"
    
    Scenario: Reservation with an unexisting seat 
    Given Opens reservation window
    When Enter first name "Ivana "
    And Enter last name "Petrova"
    And Enters seat number "101"
    And Clicks on button Reserve
    Then Gets message "Please choose seat number between 1 and 100!"
    
        Scenario: Reservation with a taken seat 
    Given Opens reservation window
    When Enter first name "Angelina "
    And Enter last name "Dobreva"
    And Enters seat number "10"
    And Clicks on button Reserve
    Then Gets message "This seat is taken.Please choose another!"
    
      Scenario: Reservation with a missing last name 
    Given Opens reservation window
    When Enter first name "Angelina "
    And Enters seat number "30"
    And Clicks on button Reserve
    Then Gets message "Please enter your last name"
    
    