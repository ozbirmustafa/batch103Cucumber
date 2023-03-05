package stepdefinitions;

import io.cucumber.java.en.Then;
import utilities.ReusableMethods;

import java.io.IOException;

public class CommonStepDefinitions {

    @Then("ekran goruntusu al")
    public void ekran_goruntusu_al() throws IOException {
        ReusableMethods.getScreenshot("screen_shot");
    }

}
