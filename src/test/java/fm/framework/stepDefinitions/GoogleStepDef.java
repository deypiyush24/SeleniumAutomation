package fm.framework.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GoogleStepDef {
    @Given("{string} is researching things on the internet")
    public void sergeyIsResearchingThingsOnTheInternet(String  nameOfThePerson) {
        System.out.printf("Hello : %s", nameOfThePerson).println();
    }

    @When("he looks up {string}")
    public void heLooksUp(String nameOfThePerson) {
        System.out.printf("Hello : %s", nameOfThePerson).println();
    }

    @Then("he should see information about {string}")
    public void heShouldSeeInformationAbout(String nameOfThePerson) {

    }

    @Then("he should see data about {string}")
    public void heShouldSeeDataAbout(String nameOfThePerson) {
        System.out.printf("Hello : %s", nameOfThePerson).println();
    }
}
