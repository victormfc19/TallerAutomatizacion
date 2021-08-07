package co.com.taller.gurubank.stepdefinitions;

import co.com.taller.gurubank.questions.AccountAlert;
import co.com.taller.gurubank.questions.AccountGenerated;
import co.com.taller.gurubank.questions.Registered;
import co.com.taller.gurubank.questions.ValidateMessage;
import co.com.taller.gurubank.tasks.Create;
import co.com.taller.gurubank.tasks.Delete;
import co.com.taller.gurubank.tasks.Login;
import co.com.taller.gurubank.tasks.NewCustomer;
import co.com.taller.gurubank.util.Driver;
import co.com.taller.gurubank.util.OperacionArchivo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static co.com.taller.gurubank.userinterfaces.AccountCreatedPage.ACCOUNT_ID;
import static co.com.taller.gurubank.userinterfaces.CustomerRegisteredPage.CUSTOMER_ID;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CustomerStepDefinitions {


    private String customer_id;
    private String account_id;
    private String account_number;

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
        theActorInTheSpotlight().should(
                seeThat(Registered.successfully(), Matchers.is(true))
        );
        customer_id = Text.of(CUSTOMER_ID).viewedBy(theActorInTheSpotlight()).asString();
        System.out.println("El customer_id es: " + customer_id);
        OperacionArchivo.crearArchivo(customer_id);
    }


    @When("^user creates an account$")
    public void userCreatesAnAccount() {
        customer_id = OperacionArchivo.leerArchivo();
        theActorInTheSpotlight().attemptsTo(
                Create.anAccount(customer_id)
        );
    }

    @Then("^user verifies the message the account has been create correctly$")
    public void userVerifiesTheMesssageTheAccountHasBeenCreateCorrectly() {
        theActorInTheSpotlight().should(
                seeThat(AccountGenerated.succesfully(), Matchers.is(true))
        );
        account_id = Text.of(ACCOUNT_ID).viewedBy(theActorInTheSpotlight()).asString();
        System.out.println("El account_id es: " + customer_id);
        OperacionArchivo.crearArchivo(account_id);
    }

    @When("^user select delete account$")
    public void userSelectDeleteAccount() {
        //account_number = OperacionArchivo.leerArchivo();
        account_number = "95705";
        theActorInTheSpotlight().attemptsTo(
                Delete.anAccount(account_number)
        );
    }

    @Then("^user verifies the message the account has been deleted successfully$")
    public void userVerifiesTheMessageTheAccountHasBeenDeletedSuccessfully() {
        theActorInTheSpotlight().should(
                seeThat(AccountAlert.Deleted(), Matchers.is("Account Deleted Sucessfully"))
        );
    }


}