Feature	login to Health App

  Scenario	Verify that user can login with registered login credentials
    Given 	i am on home page of health app
    Then    i will be navigated to home page
    When    i click on login button in home page
    Then    i will be navigated to login page
    When	i enter email as "newtestuser01@test.com"
    And 	i enter password as "Newtest@01"
    And 	i will click on login button
    Then	I should be login successfully into the health app
    And 	I should see a message Login Successful



  Scenario	Verify that user cannot login with invalid email id
    Given 	i am on home page of health app
    Then    i will be navigated to home page
    When	i click on login button in home page
    Then 	i will be navigated to login page
    When 	i enter email as "newtestuser01@test.com"
    And 	i enter password as "Newtest@01"
    And 	i click on login button
    Then	I shouldn't  login into the health app
    And 	I should see a message Invalid Email ID



  Scenario	Verify that user cannot login with invalid Password
    Given 	i am on home page of health app
    Then    i will be navigated to home page
    When 	i click on login button in home page
    Then 	i be navigated to login page
    When 	i enter email as "newtestuser01@test.com"
    And 	i enter password as "Newuser@01"
    And 	i click on login button
    Then	I shouldn't  login into the health app
    And 	I should see a message Invalid Password



  Scenario	Verify that user cannot login with out appropriate cases in password.
    Given 	i am on home page of health app
    Then    i will be navigated to home page
    When	i click on login button in home page
    Then 	i will be navigated to login page
    When	i enter email as "newtestuser01@test.com"
    And 	i enter password as "newtest@01"
    And 	i click on login button
    Then	I shouldn't  login into the health app
    And 	I should see a message Invalid Password


  Scenario	Verify that user can recover password by using Forgot Password option in login page
    Given 	i am on home page of health app
    Then    i will be navigated to home page
    When	i click on login button in home page
    Then 	i will be navigated to login page
    When	i enter email as "testuserhealth01@gmail.com"
    And 	i click on Forgot password hyperlink
    Then 	i will be directed to Password Recover Page
    When	I enter email as newtestuser01@test.com
    Then	I should get an password recovery link to my registered email id
    When	I will click on link in received email
    Then 	I be navigated to recovery page to change my password
    When	i enter new password
    And 	i click on Confirm
    Then	i should see a message Password Changed Successfully