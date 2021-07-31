package co.com.taller.gurubank.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target MESSAGE_ID = Target.the("Message id")
            .locatedBy("//td[contains(text(),'mngr344737')]");
}
