package com.juaracoding.ta.ProjectSiloam.step_definitions;

import com.juaracoding.ta.ProjectSiloam.pages.LoginAdminPage;
import com.juaracoding.ta.ProjectSiloam.step_definitions.Hooks;
import com.juaracoding.ta.ProjectSiloam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.Assert;

public class TestLoginAdmin {
	
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginAdminPage loginPage = new LoginAdminPage();

   public TestLoginAdmin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
   //URL INVALID
   @Given("Buka browser")
   public void Buka_browser() {
   	driver.get(Constants.URLG);
       extentTest.log(LogStatus.PASS,"Buka browser");
   }
   @When("Isi url salah")
   public void Isi_url_salah() {
   	 loginPage.searchURL("detik.com");
     extentTest.log(LogStatus.PASS, "Isi url salah");
   }
   @When("Klik search")
   public void Klik_search() {
	   loginPage.enterURL();
     extentTest.log(LogStatus.PASS, "Klik search");
   }
   @Then("Tidak menampilkan Url yang ingin dikunjungi")
   public void Tidak_menampilkan_Url_yang_ingin_dikunjungi() {
     Assert.assertEquals(loginPage.getTxtPleaseFill(), "please fill out this field");
     extentTest.log(LogStatus.PASS, "User Mendapatkan Informasi Username Dan Password Tidak Boleh Kosong");
        }
   //URL VALID      
   @When("Isi url benar")
   public void Isi_url_benar() {
   	 loginPage.searchURL("https://dev.ptdika.com/siloam/panel/login/");
     extentTest.log(LogStatus.PASS, "Isi url benar");
   }    
   @Then("Menampilkan Url yang ingin dikunjungi")
   public void Menampilkan_Url_yang_ingin_dikunjungi() {
     Assert.assertEquals(loginPage.getTxtPleaseFill(), "please fill out this field");
     extentTest.log(LogStatus.PASS, "Menampilkan Url yang ingin dikunjungi");    
   }
   
   //Test Invalid Login Admin
   // Test Case 1
   @Given("Berada Di Halaman Login Admin")
   public void Berada_Di_Halaman_Login_Admin() {
   	driver.get(Constants.URL);
       extentTest.log(LogStatus.PASS,"Berada Di Halaman Login Admin");
   }
   @When("Isi username kosong pada Admin")
   public void Isi_username_kosong_pada_Admin() {
   	 loginPage.usernameA("");
        extentTest.log(LogStatus.PASS, "Isi username kosong pada Admin");
   }
   @When("Isi password kosong pada Admin")
   public void Isi_password_kosong_pada_Admin() {
   	 loginPage.passwordA("");
        extentTest.log(LogStatus.PASS, "Isi password kosong pada Admin");
   }
//   @When("Klik button login")
//   public void klik_button_login() {
//   	loginPage.clickBtnLogin();
//       extentTest.log(LogStatus.PASS, "Klik button login");
//   }
   @Then("Username dan Password Tidak Boleh Kosong")
   public void Username_dan_Password_Tidak_Boleh_Kosong() {
   	Assert.assertEquals(loginPage.getTxtPleaseFill(), "please fill out this field");
   	extentTest.log(LogStatus.PASS, "Username dan Password Tidak Boleh Kosong");
   }
   
   //Test Case 2
   @When("Isi password salah pada Admin")
   public void Isi_password_salah_pada_Admin() {
   	 loginPage.passwordA("qwerty123");
        extentTest.log(LogStatus.PASS, "Isi password salah pada Admin");
   }
   @Then("Username Tidak Boleh Kosong")
   public void Username_Tidak_Boleh_Kosong() {
   	Assert.assertEquals(loginPage.getTxtPleaseFill(), "please fill out this field");
   	extentTest.log(LogStatus.PASS, "Username Tidak Boleh Kosong");
   }
   //Test Case 3
   @When("Isi username salah pada Admin")
   public void Isi_username_salah_pada_Admin() {
   	 loginPage.usernameA("qwerty123");
        extentTest.log(LogStatus.PASS, "Isi username salah pada Admin");
   }
   @Then("Password Tidak Boleh Kosong")
   public void Password_Tidak_Boleh_Kosong() {
   	Assert.assertEquals(loginPage.getTxtPleaseFill(), "please fill out this field");
   	extentTest.log(LogStatus.PASS, "Password Tidak Boleh Kosong");
   }
   //Test Case 4
   @Then("Username dan Password Salah")
   public void Username_dan_password_Salah() {
   	Assert.assertEquals(loginPage.getTxtWrongUserPass(), "Wrong username or password!");
   	extentTest.log(LogStatus.PASS, "Username dan Password Salah");
   }
   //Test Case 5
   @When("Isi password benar pada Admin")
   public void Isi_password_benar_pada_Admin() {
   	 loginPage.passwordA("d1k4@passw0rd");
        extentTest.log(LogStatus.PASS, "Isi username salah pada Admin");
   }
   //Test Case 6
   @When("Isi username benar pada Admin")
   public void Isi_username_benar_pada_Admin() {
   	 loginPage.usernameA("admindika");
        extentTest.log(LogStatus.PASS, "Isi username salah pada Admin");
   }
   //Test Case 7
   @When("Isi username kapital benar pada Admin")
   public void Isi_username_kapital_benar_pada_Admin() {
   	 loginPage.usernameA("ADMINDIKA");
        extentTest.log(LogStatus.PASS, "Isi username salah pada Admin");
   }
   //Test Case 8
   @When("Isi password kapital benar pada Admin")
   public void Isi_password_kapital_benar_pada_Admin() {
   	 loginPage.passwordA("D1K4@PASSW0RD");
        extentTest.log(LogStatus.PASS, "Isi username salah pada Admin");
   }
   //Test Valid Login Admin
   //Test Case 9
   @Then("Masuk Ke Halaman Home Admin")
   public void Masuk_Ke_Halaman_Home_Admin() {
   	Assert.assertEquals(loginPage.getTxtDashbaord(), "Home");
   	extentTest.log(LogStatus.PASS, "Masuk Ke Halaman Home Admin");
   }

}

