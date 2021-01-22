package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Button to Login in the page")
            .located(By.xpath("//*[@id='nav-menu']/ul[2]/li/a"));

    public static final Target USER_FIELD = Target.the("Fill the user")
            .located(By.id("username"));

    public static final Target PASSWORD_FIELD =Target.the("Fill he password")
            .located(By.id("password"));

    public static final Target SIGNIN_BUTTON = Target.the("Sign In button")
            .located(By.xpath("//button[contains(text(),'Acceder')]"));
}
