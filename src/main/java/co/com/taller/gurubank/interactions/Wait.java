package co.com.taller.gurubank.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class Wait implements Interaction {

    private int value;

    public Wait(int value) {
        this.value = value;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(value * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Wait theSeconds(int value){
        return instrumented(Wait.class, value);
    }
}
