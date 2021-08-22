package co.com.choucair.certification.proyectobase.rennuers;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/academyChourcair.feature",
        tags = "@stories",
        glue = "co.com.choucair.certificacion.academy.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags{

}
