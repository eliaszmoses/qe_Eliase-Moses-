package starter.helper.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsepulsa {
    @Given("User is on Sepulsa homepage")
    public void userIsOnSepulsaHomepage() {
        System.out.println("User is on Sepulsa homepage");
    }

    @When("User clicks on Login button")
    public void userClicksOnLoginButton() {
        System.out.println("User clicks on Login button");
    }

    @And("User enters valid email and password")
    public void userEntersValidEmailAndPassword() {
        System.out.println("User enters valid email and password");
    }

    @Then("User should be redirected to Sepulsa dashboard")
    public void userShouldBeRedirectedToSepulsaDashboard() {
        System.out.println("User should be redirected to Sepulsa dashboard");
    }

    @And("User enters invalid email and password")
    public void userEntersInvalidEmailAndPassword() {
        System.out.println("User enters invalid email and password");
    }

    @Then("User should see an error message {string}")
    public void userShouldSeeAnErrorMessage(String arg0) {
        System.out.println("User should see an error message " + arg0);
    }
}
