package co.com.taller.gurubank.questions;

import co.com.taller.gurubank.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(HomePage.MESSAGE_ID).viewedBy(actor).asString();
    }

    public static ValidateMessage withID(){
        return new ValidateMessage();
    }
}
