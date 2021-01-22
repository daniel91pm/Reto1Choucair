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
    private String strUser;
    private String strPassword;

    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }


    public static Login onThePage(String strUser, String strPassword) {

        return Tasks.instrumented(Login.class,strUser,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(ChoucairLoginPage.LOGIN_BUTTON, WebElementStateMatchers.isVisible()),
                Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue(strUser).into(ChoucairLoginPage.USER_FIELD),
                Enter.theValue(strPassword).into(ChoucairLoginPage.PASSWORD_FIELD),
                Click.on(ChoucairLoginPage.SIGNIN_BUTTON)
        );
    }
}

