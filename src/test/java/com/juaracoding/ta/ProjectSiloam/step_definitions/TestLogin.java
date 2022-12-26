package com.juaracoding.ta.ProjectSiloam.step_definitions;

import com.juaracoding.ta.ProjectSiloam.pages.LoginPage;
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

public class TestLogin {
	
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage = new LoginPage();

   public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    //Test Case 1	
   @Given("Berada Di Halaman Login Admin")
    public void Isi_username() {
    	driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"User masuk Web login Siloam");
    }
    @When("Isi username")
    public void isi_username() {
    	 loginPage.usernameA("D6200927");
         extentTest.log(LogStatus.PASS, "User isi username benar");
    }
    @When("Isi password")
    public void isi_password() {
    	 loginPage.passwordA("1997-10-23");
         extentTest.log(LogStatus.PASS, "User isi password benar");
    }
    @When("Klik button login")
    public void klik_button_login() {
    	loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login");
    }
    @Then("Masuk Ke Halaman Home Sales")
    public void masuk_ke_halaman_Home_Sales() {
    	Assert.assertEquals(loginPage.getTxtPleaseFill(), "please fill out this field");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan Informasi Username Dan Password Tidak Boleh Kosong");
    }
}

