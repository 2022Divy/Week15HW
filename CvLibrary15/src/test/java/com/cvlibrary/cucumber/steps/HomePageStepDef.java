package com.cvlibrary.cucumber.steps;

import com.cvlibrary.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDef {
    @When("^I enterJobTitle \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobTitle) {
     new HomePage().enterJobTitle("Tester");
    }

    @And("^I enterLocation \"([^\"]*)\"$")
    public void iEnterLocation(String location){
        new HomePage().enterLocation("Harrow");

    }

    @And("^I selectDistance \"([^\"]*)\"$")
    public void iSelectDistance(String distance){
        new HomePage().selectDistance("5 miles");
    }

    @And("^I clickOnMoreSearchOptionLink$")
    public void iClickOnMoreSearchOptionLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^I enterMinSalary \"([^\"]*)\"$")
    public void iEnterMinSalary(String minSalary)  {
       // new HomePage().enterMinSalary("30000");
        new HomePage().enterMinSalary(minSalary);

    }

    @And("^I enterMaxSalary \"([^\"]*)\"$")
    public void iEnterMaxSalary(String maxSalary)  {
        new HomePage().enterMaxSalary("500000");
    }

    @And("^I selectSalaryType \"([^\"]*)\"$")
    public void iSelectSalaryType(String Type)  {
        new HomePage().selectSalaryType("Per annum");

    }

    @And("^I selectJobType \"([^\"]*)\"$")
    public void iSelectJobType(String jobType)  {
        new HomePage().selectJobType("Permanent");
    }

    @Then("^I clickOnFindJobsButton$")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Given("^User is on Homepage\\.$")
    public void userIsOnHomepage() {
    }
}
