package org.example.stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.drivers.DriverManager;
import org.example.pageObject.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(DriverManager.getDriver());

    @Given("User already login page")
    public void userAlreadyLoginPage() {
       loginPage.verifyLoginPage();
    }

    @When("User go to customer service page")
    public void userGoToCustomerServicePage() {
        loginPage.clickSahabatAlfamartBtn();
        loginPage.verifyCsPage();
    }

    @And("User click on FAQ menu")
    public void userClickOnFAQMenu() {
        loginPage.clickFaqMenuBtn();
    }

    @Then("User success redirect to FAQ menu")
    public void userSuccessRedirectToFAQMenu() {
        loginPage.verifyFaqPage();
    }
}
