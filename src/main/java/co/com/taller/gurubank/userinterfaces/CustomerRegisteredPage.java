package co.com.taller.gurubank.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CustomerRegisteredPage {
    public static final Target CUSTOMER_ID = Target.the("Customer id")
            .locatedBy("(//table[@id='customer']//td)[5]");
    public static final Target MESSAGE_CUSTOMER_SUCCESFULLY = Target.the("Customer id")
            .locatedBy("//table[@id='customer']//p");
}
