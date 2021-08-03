package co.com.taller.gurubank.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target MESSAGE_ID = Target.the("Message id")
            .locatedBy("//td[contains(text(),'mngr344737')]");
    public static final Target SELECT_NEWCUSTOMER = Target.the("select new customer")
            .locatedBy("//a[contains(text(),'New Customer')]");
    public static final Target SELECT_NEWACCOUNT = Target.the("select new account")
            .locatedBy("//a[contains(text(),'New Account')]");

}
