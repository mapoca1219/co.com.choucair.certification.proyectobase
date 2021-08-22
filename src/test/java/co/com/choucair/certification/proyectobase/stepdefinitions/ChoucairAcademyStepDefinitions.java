package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.molde.AcademyChoucaiData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brando wants to learn automation at the academy Choucair$")
    public void thanBrandoWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucaiData> academyChoucaiData) throws Exception {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (Login.onThePage(academyChoucaiData.get(0).getStrUser(), academyChoucaiData.get(0).getStrPassword())));
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucaiData> academyChoucaiData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucaiData.get(0).getStrCourse()));
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(List<AcademyChoucaiData> academyChoucaiData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucaiData.get(0).getStrCourse())));
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

}
