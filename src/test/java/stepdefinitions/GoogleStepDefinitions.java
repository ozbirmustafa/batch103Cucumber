package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinitions {
    GooglePage googlePage = new GooglePage();
    @Given("kullanici google a gider")
    public void kullanici_google_a_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));

    }
    @When("kullanici iphone için arama yapar")
    public void kullanici_iphone_için_arama_yapar() {
        googlePage.searchBox.sendKeys("iPhone" + Keys.ENTER);
    }
    @Then("sonuclarda iphone oldugunu dogrular")
    public void sonuclarda_iphone_oldugunu_dogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
    }
    @And("close the application")
    public void closeTheApplication() {
        Driver.closeDriver();
    }

    @When("kullanici tesla için arama yapar")
    public void kullaniciTeslaIçinAramaYapar() {
        googlePage.searchBox.sendKeys("tesla" + Keys.ENTER);
    }
    @Then("sonuclarda tesla oldugunu dogrular")
    public void sonuclardaTeslaOldugunuDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("tesla"));
    }

    @When("kullanici {string} için arama yapar")
    public void kullaniciIçinAramaYapar(String arg0) {
        googlePage.searchBox.sendKeys(arg0 + Keys.ENTER);
    }

    @Then("sonuclarda {string} oldugunu dogrular")
    public void sonuclardaOldugunuDogrular(String arg0) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arg0));
    }


}
