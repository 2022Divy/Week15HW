Feature: Register Feature
  As a User want to check register functionality

  @smoke
  Scenario: User should register successfully with valid credentials
    Given User is on Home page.
    When I clickOnRegisterLink
    And I enterfname "Divy"
    And I enterlname "Patel"
    And I enteradd "56"
    And I entercity "London"
    And I enterstate"UK"
    And I enterzip "HA3 5QY"
    And I enterpnumber "0778677889"
    And I enterssn "SX6688788G"
    And I enteruname "Vidhip"
    And I enterpass "vidhi1234"
    And I entercpass "vidhi1234"
    Then clickOnElement(regbutton)
