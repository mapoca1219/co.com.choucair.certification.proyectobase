package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("selecciona la universidad choucair")
            .located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPTU_COURSE = Target.the("selecciona la universidad choucair")
            .located(By.id("cuorsesearchbox"));
    public static final Target BUTTON_GO = Target.the("selecciona la universidad choucair")
            .located(By.id("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("selecciona la universidad choucair")
            .located(By.xpath("//h4[contains(text(), 'Recursos Automatizacion Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//h1[contains(text(),'Recursos Automatizacion Bancolombia')]"));
}