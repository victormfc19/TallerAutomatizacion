package co.com.taller.gurubank.tasks;

import co.com.taller.gurubank.userinterfaces.LoginPage;
import co.com.taller.gurubank.util.Const;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(Const.username).into(LoginPage.USERID_FIELD),
                Enter.theValue(Const.password).into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

    public static Login inThePage(){
        return new Login();
    }
}
