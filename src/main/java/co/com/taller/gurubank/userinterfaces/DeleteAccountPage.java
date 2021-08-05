package co.com.taller.gurubank.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DeleteAccountPage {
    public static final Target INPUT_ACCOUNT_NUMBER = Target.the("Input of account number")
            .located(By.name("accountno"));

    public static final Target SUBMIT_BUTTON_DELETE = Target.the("Submit button delete")
            .located(By.name("AccSubmit"));
}
