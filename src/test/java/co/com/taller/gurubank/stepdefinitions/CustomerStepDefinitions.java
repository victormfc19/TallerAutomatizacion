package co.com.taller.gurubank.stepdefinitions;

import co.com.taller.gurubank.questions.ValidateMessage;
import co.com.taller.gurubank.tasks.Login;
import co.com.taller.gurubank.util.driver.Driver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;


import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CustomerStepDefinitions {

    private String customerID;

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
        theActorCalled("user");
    }

    @Given("^User log into Guru Page$")
    public void userLogIntoGuruPage() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(Driver.getDriver().openUrl("http://demo.guru99.com/V4/index.php")));
        theActorInTheSpotlight().attemptsTo(Login.inThePage());
        theActorInTheSpotlight().should(seeThat(ValidateMessage.withID(), Matchers.is("Manger Id : mngr344737")));
    }

    @When("^user creates a customer$")
    public void userCreatesACustomer() {

    }

    @Then("^user verifies the messsage it has been create correctly$")
    public void userVerifiesTheMesssageItHasBeenCreateCorrectly() {

    }

}
