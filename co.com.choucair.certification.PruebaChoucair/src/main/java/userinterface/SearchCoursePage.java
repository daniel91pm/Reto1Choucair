package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target IMAGEN_CERTIFICACIONES = Target.the("Image that represents Choucair Courses")
            .located(By.id("certificaciones"));
    public static final Target TEXTO_CURSO = Target.the("Identify Text course ")
            .located(By.xpath("//*[@id='coursesearchbox']"));
    public static final Target NOMBRE_CURSO_BUSQUEDA = Target.the("Extract name course")
            .located(By.xpath("//h4/a[contains(text(), 'cnica - Analista Bancolombia')]"));
    public static final Target BOTON_IR = Target.the("button to start the search")
            .located(By.xpath("//*[@id='coursesearch']/fieldset/button"));
    public static final Target SELECCION_CURSO = Target.the("Select the course")
            .located(By.xpath("//h4/a[contains(text(),'cnica - Analista Bancolombia')]"));
}