package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelStepDefinitions {

    HomePage homePage;
    LoginPage loginPage;
    ExcelUtils excelUtils;
    List<Map<String,String>> excelData;

    @Given("kullanici {string} bilgileri ile giris yapar")
    public void kullanici_bilgileri_ile_giris_yapar(String string) throws IOException {
        String path="C:\\Users\\pc\\IdeaProjects\\batch103Cucumber\\src\\test\\resources\\testdata\\mysmoketestdata.xlsx";
        String sayfa = "customer_info";
        excelUtils = new ExcelUtils(path,sayfa);
        excelData = excelUtils.getDataList();
        System.out.println("excelData = " + excelData);
        for (Map<String,String> data : excelData) {
            Driver.getDriver().get(ConfigReader.getProperty("app_url"));
            homePage = new HomePage();
            loginPage = new LoginPage();
            homePage.firstLogin.click();
            ReusableMethods.waitFor(1);
            loginPage.email.sendKeys(data.get("username"));
            loginPage.password.sendKeys(data.get("password"));
            loginPage.login.click();
            ReusableMethods.waitFor(1);
            Assert.assertTrue(homePage.userID.isDisplayed());
            ReusableMethods.getScreenshot("Login_Goruntusu");
            ReusableMethods.waitFor(1);
            homePage.userID.click();
            ReusableMethods.waitFor(1);
            homePage.logOut.click();
            homePage.OK.click();
            ReusableMethods.waitFor(1);

        }
        Driver.closeDriver();

    }


}
