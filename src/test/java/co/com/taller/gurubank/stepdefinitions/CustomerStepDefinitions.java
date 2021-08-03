package co.com.taller.gurubank.stepdefinitions;

import co.com.taller.gurubank.questions.Registered;
import co.com.taller.gurubank.questions.ValidateMessage;
import co.com.taller.gurubank.tasks.Create;
import co.com.taller.gurubank.tasks.Login;
import co.com.taller.gurubank.tasks.NewCustomer;
import co.com.taller.gurubank.userinterfaces.CustomerRegisteredPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;


import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CustomerStepDefinitions {

    private String customer_id;

    @Managed(driver = "chrome")
    WebDriver hisdriver;

    @Before
    public void setThestage() {
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
        theActorInTheSpotlight().should(seeThat(Registered.successfully(), Matchers.is(true)));
        customer_id = Text.of(CustomerRegisteredPage.CUSTOMER_ID).viewedBy(theActorInTheSpotlight()).asString();
        System.out.println("El customer_id es: " + customer_id);
    }


    @When("^user creates an account$")
    public void userCreatesAnAccount() {

    }

    @Then("^user verifies the message the account has been create correctly$")
    public void userVerifiesTheMesssageTheAccountHasBeenCreateCorrectly() {
        System.out.println("El customer id en el segundo escenario es:  " + customer_id);
        theActorInTheSpotlight().attemptsTo(
                Create.anAccount("990009990")
        );
    }

}