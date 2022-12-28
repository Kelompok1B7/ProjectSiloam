package com.juaracoding.ta.ProjectSiloam.step_definitions;

import com.juaracoding.ta.ProjectSiloam.pages.LoginSalesPage;
import com.juaracoding.ta.ProjectSiloam.step_definitions.Hooks;
import com.juaracoding.ta.ProjectSiloam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestLoginSales {
	
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginSalesPage loginPage = new LoginSalesPage();

   public TestLoginSales() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    //Test Case 1	
    @Given("Berada Di Halaman Login Sales")
    public void Isi_username() {
    	driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"User masuk Web login Siloam");
    }
    @When("Isi username")
    public void isi_username() {
    	 loginPage.usernameA("D6200927");
         extentTest.log(LogStatus.PASS, "Isi username benar");
    }
    @When("Isi password")
    public void isi_password() {
    	 loginPage.passwordA("D6200927");
         extentTest.log(LogStatus.PASS, "Isi password benar");
    }
    @When("Klik button login")
    public void klik_button_login() {
    	loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "Klik button login");
    }
    @Then("Masuk Ke Halaman Home Sales")
    public void masuk_ke_halaman_Home_Admin() {
    	Assert.assertEquals(loginPage.getTxtDashbaord(),"Home");
    	extentTest.log(LogStatus.PASS, "Masuk Ke Halaman Home Sales");
    	driver.close();
    }
}

