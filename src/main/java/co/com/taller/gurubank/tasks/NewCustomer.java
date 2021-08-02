package co.com.taller.gurubank.tasks;

import co.com.taller.gurubank.interactions.Wait;
import co.com.taller.gurubank.userinterfaces.HomePage;
import co.com.taller.gurubank.userinterfaces.NewCustomerPage;
import co.com.taller.gurubank.util.Const;
import io.vavr.collection.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class NewCustomer implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.SELECT_NEWCUSTOMER),
                Enter.theValue(Const.customer_name).into(NewCustomerPage.CUSTOMER_NAME),
                Click.on(NewCustomerPage.CUSTOMER_GENDER),
                Enter.theValue("12").into(NewCustomerPage.CUSTOMER_BIRTH),
                Enter.theValue("04").into(NewCustomerPage.CUSTOMER_BIRTH),
                Enter.theValue("2020").into(NewCustomerPage.CUSTOMER_BIRTH),
                Click.on(NewCustomerPage.CUSTOMER_BIRTH),
                Enter.theValue(Const.customer_address).into(NewCustomerPage.CUSTOMER_ADDRESS),
                Enter.theValue(Const.customer_city).into(NewCustomerPage.CUSTOMER_CITY),
                Enter.theValue(Const.customer_state).into(NewCustomerPage.CUSTOMER_STATE),
                Enter.theValue(Const.customer_pin).into(NewCustomerPage.CUSTOMER_PIN),
                Wait.theSeconds(4),
                Enter.theValue(Const.customer_mobilenumber).into(NewCustomerPage.CUSTOMER_NUMBER),
                Enter.theValue(Const.customer_email).into(NewCustomerPage.CUSTOMER_EMAIL),
                Enter.theValue(Const.customer_password).into(NewCustomerPage.CUSTOMER_PASSWORD),
                Wait.theSeconds(4),
                Click.on(NewCustomerPage.SUBMIT_BUTTON),
                Wait.theSeconds(4)
        );
    }
    public static NewCustomer newCustomer(){
        return new NewCustomer();
    }
}
