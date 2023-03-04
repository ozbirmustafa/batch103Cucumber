package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;
import utilities.Driver;

public class DataTablesStepDefinitions {
    DataTablesPage dataTablesPage = new DataTablesPage();

    @Given("kullanici {string} gider")
    public void kullaniciGider(String string) {
        Driver.getDriver().get(string);
    }
    @When("kullanici new butonuna tiklar")
    public void kullanici_new_butonuna_tiklar() {
        Driver.waitAndClick(dataTablesPage.newButton,10);
    }
    @When("kullanici firstname {string} girer")
    public void kullaniciFirstnameGirer(String string) {
      //  dataTablesPage.firstName.sendKeys(string);
        Driver.waitAndSendText(dataTablesPage.firstName,string,5);
    }
    @When("kullanici lastname {string} girer")
    public void kullanici_lastname_girer(String string) {
        dataTablesPage.lastName.sendKeys(string);
    }
    @When("kullanici positions {string} girer")
    public void kullanici_positions_girer(String string) {
        dataTablesPage.position.sendKeys(string);
    }
    @When("kullanici office {string} girer")
    public void kullanici_office_girer(String string) {
        dataTablesPage.office.sendKeys(string);
    }
    @When("kullanici extension {string} girer")
    public void kullanici_extension_girer(String string) {
        dataTablesPage.extension.sendKeys(string);
    }
    @When("kullanici start_date {string} girer")
    public void kullanici_start_date_girer(String string) {
        dataTablesPage.startDate.sendKeys(string);
    }
    @When("kullanici salary {string} girer")
    public void kullanici_salary_girer(String string) {
        dataTablesPage.salary.sendKeys(string);
    }
    @When("kullanici create butonuna tiklar.")
    public void kullanici_create_butonuna_tiklar() {
        dataTablesPage.createButton.click();
    }
    @When("kullanici firstname ile {string} arar")
    public void kullanici_firstname_ile_arar(String string) {
        dataTablesPage.searchBox.sendKeys(string);
    }
    @Then("firstname {string} in olustugunu test et")
    public void firstname_in_olustugunu_test_et(String string) {
        Driver.wait(1);
        Assert.assertTrue(Driver.waitAndGetText(dataTablesPage.name,5).contains(string));
    }

}
