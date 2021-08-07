package co.com.taller.gurubank.tasks;

import static co.com.taller.gurubank.userinterfaces.HomePage.*;

import static co.com.taller.gurubank.userinterfaces.NewAccountPage.*;

import co.com.taller.gurubank.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Create implements Task {
    private final String customer_id;
    public Create(String customer_id) {
        this.customer_id = customer_id;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Wait.theSeconds(2),
                Click.on(SELECT_NEWACCOUNT),
                Enter.theValue(customer_id).into(INPUT_CUSTOMER_ID),
                Enter.theValue("53210").into(INPUT_INITIAL_DEPOSIT),
                Click.on(SUBMIT_BUTTON)
        );
    }

    public static Create anAccount(String customer_id){
        return new Create(customer_id);
    }
}
