Feature: HomePage Feature
  As a user want to check homepage functionality.

  @smoke
  Scenario: User should find job search successfully.
    Given User is on Homepage.
    When I enterJobTitle "Tester"
    And I enterLocation "Harrow"
    And I selectDistance "5 miles"
    And I clickOnMoreSearchOptionLink
    And I enterMinSalary "30000"
    And I enterMaxSalary "500000"
    And I selectSalaryType "Per annum"
    And I selectJobType "Permanent"
    Then I clickOnFindJobsButton