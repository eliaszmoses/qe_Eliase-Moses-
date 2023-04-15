package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.HomePage;
import starter.helper.stepdefinitions.ProductDetailPage;
import starter.pages.HomePage;
import starter.pages.ProductDetailPage;

public class ProductSelectionSteps {

    @Steps
    HomePage homePage;

    @Steps
    ProductDetailPage productDetailPage;

    @Given("the user is on Sepulsa website")
    public void givenTheUserIsOnSepulsaWebsite() {
        homePage.open();
    }

    @When("the user selects a {string}")
    public void whenTheUserSelectsAProduct(String product) {
        homePage.selectProduct(product);
    }

    @Then("the user should see the product detail page")
    public void thenTheUserShouldSeeTheProductDetailPage() {
        productDetailPage.verifyPageLoaded();
    }

    @When("the user searches for a {string} that does not exist")
    public void whenTheUserSearchesForNonexistentProduct(String product) {
        homePage.searchForProduct(product);
    }

    @Then("the user should see an error message")
    public void thenTheUserShouldSeeAnErrorMessage() {
        homePage.verifySearchErrorDisplayed();
    }

    @When("the user selects a <product>")
    public void theUserSelectsAProduct() {
    }
}

