package co.com.taller.gurubank.stepdefinitions;

import co.com.taller.gurubank.questions.ValidateMessage;
import co.com.taller.gurubank.tasks.Login;
import co.com.taller.gurubank.tasks.NewCustomer;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;


import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CustomerStepDefinitions {
    @Managed(driver = "chrome")
    WebDriver hisdriver;
    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
    }

    @Given("^User log into Guru Page$")
    public void userLogIntoGuruPage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("http://demo.guru99.com/V4/index.php"));
        theActorInTheSpotlight().attemptsTo(Login.inThePage());
        theActorInTheSpotlight().should(seeThat(ValidateMessage.withID(), Matchers.is("Manger Id : mngr344737")));

    }

    @When("^user creates a customer$")
    public void userCreatesACustomer() {
        theActorInTheSpotlight().attemptsTo(NewCustomer.newCustomer());
    }

    @Then("^user verifies the messsage it has been create correctly$")
    public void userVerifiesTheMesssageItHasBeenCreateCorrectly() {

    }


}
