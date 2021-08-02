package co.com.taller.gurubank.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NewCustomerPage {

    public static final Target CUSTOMER_NAME = Target.the("Customer name field")
            .located(By.name("name"));
    public static final Target CUSTOMER_GENDER = Target.the("Customer gender field")
            .located(By.name("rad1"));
    public static final Target CUSTOMER_BIRTH = Target.the("Customer birth field")
            .located(By.name("dob"));
    public static final Target CUSTOMER_ADDRESS = Target.the("Customer address field")
            .located(By.name("addr"));
    public static final Target CUSTOMER_CITY = Target.the("Customer city field")
            .located(By.name("city"));
    public static final Target CUSTOMER_STATE = Target.the("Customer state field")
            .located(By.name("state"));
    public static final Target CUSTOMER_PIN = Target.the("Customer pin field")
            .located(By.name("pinno"));
    public static final Target CUSTOMER_NUMBER = Target.the("Customer mobile number field")
            .located(By.name("telephoneno"));
    public static final Target CUSTOMER_EMAIL = Target.the("Customer email field")
            .located(By.name("emailid"));
    public static final Target CUSTOMER_PASSWORD = Target.the("Customer password field")
            .located(By.name("password"));
    public static final Target SUBMIT_BUTTON = Target.the("Submit button")
            .locatedBy("//input[@type='submit']");





}
