package co.com.taller.gurubank.tasks;

import co.com.taller.gurubank.interactions.Wait;
import co.com.taller.gurubank.util.Driver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

import static co.com.taller.gurubank.userinterfaces.HomePage.SELECT_DELETE_ACCOUNT;
import static co.com.taller.gurubank.userinterfaces.DeleteAccountPage.*;
import static co.com.taller.gurubank.userinterfaces.NewAccountPage.*;

public class Delete implements Task {
    private String account_number;

    public Delete(String account_number) {
        this.account_number = account_number;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.theSeconds(2),
                Click.on(SELECT_DELETE_ACCOUNT),
                Enter.theValue(account_number).into(INPUT_ACCOUNT_NUMBER),
                Click.on(SUBMIT_BUTTON_DELETE)
        );
        Alert alert = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
        alert.accept();
    }

    public static Delete anAccount(String account_number){
        return new Delete(account_number);
    }
}
