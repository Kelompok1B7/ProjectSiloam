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
   //Login Duplicate Admin
   @When("Klik button login")
   public void klik_button_login() {
   	loginPage.clickBtnLogin();
       extentTest.log(LogStatus.PASS, "Klik button login");
   }
   
    //Test Case 1	
   @Given("Berada Di Halaman Login Sales")
   public void Berada_Di_Halaman_Login_Sales() {
   	driver.get(Constants.URL);
       extentTest.log(LogStatus.PASS,"Berada Di Halaman Login Sales");
   }
   @When("Isi username kosong pada Sales")
   public void Isi_username_kosong_pada_Sales() {
   	 loginPage.usernameA("");
        extentTest.log(LogStatus.PASS, "Isi username kosong pada Sales");
   }
   @When("Isi password kosong pada Sales")
   public void Isi_password_kosong_pada_Admin() {
   	 loginPage.passwordA("");
        extentTest.log(LogStatus.PASS, "Isi password kosong pada Sales");
   }
   //Test Case 2
   @When("Isi password salah pada Sales")
   public void Isi_password_salah_pada_Sales() {
   	 loginPage.passwordA("qwerty123");
        extentTest.log(LogStatus.PASS, "Isi password salah pada Sales");
   }

   //Test Case 3
   @When("Isi username salah pada Sales")
   public void Isi_username_salah_pada_Sales() {
   	 loginPage.usernameA("qwerty123");
        extentTest.log(LogStatus.PASS, "Isi username salah pada Sales");
   }

   //Test Case 5
   @When("Isi password benar pada Sales")
   public void Isi_password_benar_pada_Sales() {
   	 loginPage.passwordA("1997-10-23");
        extentTest.log(LogStatus.PASS, "Isi username salah pada Admin");
   }
   //Test Case 6
   @When("Isi username benar pada Sales")
   public void Isi_username_benar_pada_Sales() {
   	 loginPage.usernameA("D6200927");
        extentTest.log(LogStatus.PASS, "Isi username salah pada Sales");
   }
   //Test Case 7
   
   //Test Case 8
    
   //Test Case 9
   @Then("Masuk Ke Halaman Home Sales")
   public void Masuk_Ke_Halaman_Home_Sales() {
   	Assert.assertEquals(loginPage.getTxtDashbaordS(),"Home");
   	extentTest.log(LogStatus.PASS, "Masuk Ke Halaman Home Sales");
   }
}

