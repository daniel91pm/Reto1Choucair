package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import userinterface.ChoucairLoginPage;
import java.util.concurrent.TimeUnit;


public class Login implements Task {
    private ChoucairLoginPage choucairLoginPage;

    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(ChoucairLoginPage.LOGIN_BUTTON, WebElementStateMatchers.isVisible()),
                Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue("1037616175").into(ChoucairLoginPage.USER_FIELD),
                Enter.theValue("Choucair2021*").into(ChoucairLoginPage.PASSWORD_FIELD),
                Click.on(ChoucairLoginPage.SIGNIN_BUTTON)
        );
    }
}
