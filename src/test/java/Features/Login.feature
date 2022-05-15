Feature	login to Health App

  Scenario : 	Verify that user can login with registered login credentials
    Given 	i am on home page of health app
    Then    i will be navigated to home page
    When    i click on login button in home page
    Then    i will be navigated to login page
    When	i enter email as "usertest01@test.com"
    And 	i enter password as "Testuser@01"
    And 	i click on login button
    Then	I should be login successfully into the health app



