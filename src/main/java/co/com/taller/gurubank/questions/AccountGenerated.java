package co.com.taller.gurubank.questions;

import co.com.taller.gurubank.userinterfaces.AccountCreatedPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class AccountGenerated implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(AccountCreatedPage.MESSAGE_ACCOUNT_SUCCESFULLY).viewedBy(actor).asBoolean();
    }

    public static AccountGenerated succesfully(){
        return new AccountGenerated();
    }
}
