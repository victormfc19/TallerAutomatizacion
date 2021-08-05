package co.com.taller.gurubank.questions;

import co.com.taller.gurubank.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class AccountAlert implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(Wait.theSeconds(3));
        return BrowseTheWeb.as(actor).getDriver().switchTo().alert().getText();
    }

    public static AccountAlert Deleted(){
        return new AccountAlert();
    }
}
