package co.com.taller.gurubank.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccountCreatedPage {
    public static final Target MESSAGE_ACCOUNT_SUCCESFULLY = Target.the("Message of account created")
            .locatedBy("//table[@id='account']//p");

    public static final Target ACCOUNT_ID = Target.the("Customer id")
            .locatedBy("(//table[@id='account']//td)[5]");


}
