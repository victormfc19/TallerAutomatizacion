package co.com.taller.gurubank.questions;

import co.com.taller.gurubank.userinterfaces.CustomerRegisteredPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class Registered implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(CustomerRegisteredPage.MESSAGE_CUSTOMER_SUCCESFULLY).viewedBy(actor).asBoolean();
    }

    public static Registered successfully(){
        return new Registered();
    }
}
