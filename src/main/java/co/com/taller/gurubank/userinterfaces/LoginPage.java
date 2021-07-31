package co.com.taller.gurubank.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target USERID_FIELD = Target.the("User id field")
            .located(By.name("uid"));

    public static final Target PASSWORD_FIELD = Target.the("Password field")
            .located(By.name("password"));

    public static final Target LOGIN_BUTTON = Target.the("Login button")
            .located(By.name("btnLogin"));
}
