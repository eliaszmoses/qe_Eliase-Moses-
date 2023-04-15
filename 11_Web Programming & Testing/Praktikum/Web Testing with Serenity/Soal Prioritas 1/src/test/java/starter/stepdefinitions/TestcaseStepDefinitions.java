package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestcaseStepDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Given("User is on the sauce demo login page")
    public void userIsOnTheSauceDemoLoginPage() {
        loginSteps.openLoginPage();
    }

    @When("User enters valid username and password")
    public void userEntersValidUsernameAndPassword() {
        loginSteps.enterValidUsernameAndPassword();
    }

    @When("User enters incorrect username and valid password")
    public void userEntersIncorrectUsernameAndValidPassword() {
        loginSteps.enterIncorrectUsernameAndValidPassword();
    }

    @When("User enters valid username and incorrect password")
    public void userEntersIncorrectPassword() {
        loginSteps.enterIncorrectPassword();
    }
    @And("User press login button")
    public void userPressLoginButton() {
        loginSteps.clickLoginButton();
        }

    @Then("User is on the home page")
    public void userIsOnTheHomePage() {
        loginSteps.verifyHomePage();
        }

    @Then("User should see an error message\"")
    public void userShouldSeeAnErrorMessage() {
        loginSteps.verifyErrorMessage();
    }
}


