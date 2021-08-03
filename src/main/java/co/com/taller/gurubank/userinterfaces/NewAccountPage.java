package co.com.taller.gurubank.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NewAccountPage {
    public static final Target INPUT_CUSTOMER_ID = Target.the("Input of customer id")
            .located(By.name("cusid"));

    public static final Target SELECT_ACCOUNT_TYPE = Target.the("Select account type")
            .located(By.name("selaccount"));

    public static final Target INPUT_INITIAL_DEPOSIT = Target.the("Select account type")
            .located(By.name("inideposit"));

    public static final Target SUBMIT_BUTTON = Target.the("Submit button")
            .located(By.name("button2"));

}
