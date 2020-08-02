Feature: Changing name and verification of it

  Scenario: Login with valid user name and password
    Given Navigate to web page
    Then Click on sign in menu
    Then Enter email address
    And Enter Password
    Then Click on sign in button

  Scenario: Change the name
    When Click on the My personal information
    Then  Change the first name as "Mehmet"
    And   Enter the currentPassword
    And   Enter the new password
    And   Enter the Confirmation
    Then Click on the save button
    Then Verify the name on the top right is updated as your first name

  Scenario: Change first name back
    Given Click on Back To Account button
    When Click on the My personal information
    Then  Change the first name as "Fatih"
    And   Enter the currentPassword
    And   Enter the new password
    And   Enter the Confirmation
    Then Click on the save button
    Then Verify the name on the top right is updated as your first name