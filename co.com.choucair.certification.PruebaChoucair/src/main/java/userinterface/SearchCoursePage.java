package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import javax.swing.text.TabableView;

public class SearchCoursePage extends PageObject {
    public static final Target IMAGEN_UNIVERSIDAD = Target.the("Image that represents Choucair Courses")
            .located(By.id("universidad"));
    public static final Target TEXTO_CURSO = Target.the("Identify Text course ")
            .located(By.id("Curso"));
}
