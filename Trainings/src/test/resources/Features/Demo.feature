@EntireFeature
Feature: Verifying the cucumber functionalities

@SingleUser
Scenario: For explaining cucumber I am going with login functionality
    Given the browser and url
    When we enter the username and password
    And click on Login button
    Then Login should be successful

@MultiUser
Scenario Outline: Verifying the login functionality with multiple users
    Given the browser and url
    When we enter the "<username>" and "<password>"
    And click on Login button
    Then Login should be successful
Examples:
    | username | password |
    | admin    | manager  |
    | trainee  | trainee  |

    @DataTable
Scenario: Verifying the login functionality with multiple users
    Given the browser and url
    When we enter the username and password and click on login button
        | admin | manager1 |
    Then Login should not be successful

@MouseAndKeyboard
Scenario: Verify mouse and keyboard actions
    Given the browser and url
    When we click on TAB Button
    When we wait for 10s
#    When we perform Right click on specific element
#    When we perform mouse and keyboard actions using robot
    When we scroll down the page till end of the browser

@JavaScriptAlertConfirmationPopup
Scenario: For explaining cucumber I am going with login functionality
    Given the browser and url
    When we enter the username and password
    And click on Login button
    Then Login should be successful
    And Accept Java Script confirmation popup

@fileupload
Scenario: working with upload popup
    Given the browser and url
    When we click on browse button and upload file




