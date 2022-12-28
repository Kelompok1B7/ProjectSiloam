package com.juaracoding.ta.ProjectSiloam.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.juaracoding.ta.ProjectSiloam.pages.ReturnPage;
import com.juaracoding.ta.ProjectSiloam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestReturn {
	private static WebDriver driver;
    private static ExtentTest extentTest;
    private ReturnPage returnPage = new ReturnPage();

   public TestReturn() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
   
   //Test Case 1
  
//   @Given("Masuk Ke Halaman Return")
//   public void masuk_di_halaman_return() {
//	   //returnPage.clickbtnNew();
//	   driver.get(Constants.URLR);
//       extentTest.log(LogStatus.PASS,"Masuk ke Halaman Return");
//   }
   
   @Given("Masuk Ke Halaman Return")
   public void masuk_ke_halaman_return() {
       //returnPage.clickbtnNew();
	   driver.get(Constants.URLR);
	   extentTest.log(LogStatus.PASS,"Masuk ke Halaman Return");
   }
   @When("Isi start date")
   public void isi_start_date() {
       returnPage.setStartDate("2022-12-24");
       extentTest.log(LogStatus.PASS,"Isi start date");
   }
   @When("Isi end date")
   public void isi_end_date() {
	   returnPage.setEndDate("2022-12-24");
       extentTest.log(LogStatus.PASS,"Isi end date");
      
   }
   @When("Isi status pending")
   public void isi_status_pending() {
	   returnPage.setStatusPen();
	   extentTest.log(LogStatus.PASS,"Isi status pending");
   }
   @When("Klik button Filter")
   public void klik_button_filter() {
	   returnPage.clickbtnFil();
	   extentTest.log(LogStatus.PASS,"Klik button Filter");
       
   }
   @Then("Menampilkan Data Pending")
   public void menampilkan_data_pending() {
	   Assert.assertEquals(returnPage.getTxtPen(),"");
	   extentTest.log(LogStatus.PASS, "Menampilkan Data Pending");
   }
   
   //Test Case 2
   
   @When("Isi status complete")
   public void isi_status_complete() {
	   returnPage.setStatusComp();
	   extentTest.log(LogStatus.PASS,"Isi status complete");
   }
   @Then("Menampilkan Data Complete")
   public void menampilkan_data_complete() {
	   Assert.assertEquals(returnPage.getTxtCom(), "Sudah TDD Digital");
	   extentTest.log(LogStatus.PASS, "Menampilkan Data Complete");
       }
   
   //Test Case 3
   @When("Isi status")
   public void isi_status() {
	   returnPage.setStatusComp();
	   extentTest.log(LogStatus.PASS,"Isi status");
   }
   @When("Klik button reset")
   public void klik_button_reset() {
	   returnPage.clickbtnRes();
	   extentTest.log(LogStatus.PASS,"Klik button reset");
   }
   @Then("Semua Field Akan Reset")
   public void semua_field_akan_reset() {
	   Assert.assertEquals(returnPage.getTxtReset(),"");
	   extentTest.log(LogStatus.PASS, "Semua Field Akan Reset");
   }
   
   //Test Case 4
   
   @When("Isi search tidak terdaftar")
   public void isi_search_tidak_terdaftar() {
	   returnPage.setSearch("FANDI");
       extentTest.log(LogStatus.PASS,"Isi search tidak terdaftar");
   }
   @When("Klik button search")
   public void klik_button_search() {
	   returnPage.clickbtnSearch();
	   extentTest.log(LogStatus.PASS,"Klik button search");
   }
   @Then("Tidak Menampilkan Data")
   public void tidak_menampilkan_data() {
	   Assert.assertEquals(returnPage.getTxtNoData(), "No data available in table");
	   extentTest.log(LogStatus.PASS, "Tidak Menampilkan Data");
   }
   
   //Test Case 5
   
   @When("Isi search terdaftar")
   public void isi_search_terdaftar() {
	   returnPage.setSearch("HANDI");
       extentTest.log(LogStatus.PASS,"Isi search tidak terdaftar");
   }
   
   @Then("Menampilkan Data")
   public void menampilkan_data() {
	   Assert.assertEquals(returnPage.getTxtSearch(), "HANDI SETIAWA");
	   extentTest.log(LogStatus.PASS, "Menampilkan Data");
   }
   //Test Case 6
   @When("Klik button icon")
   public void klik_button_icon() {
	   returnPage.clickbtnIcon();
	   extentTest.log(LogStatus.PASS,"Klik button icon");
   }
   @Then("Menampilkan Halaman Upload")
   public void menampilkan_halaman_upload() {
	   Assert.assertEquals(returnPage.getTxtUpload(), "Upload Document");
	   extentTest.log(LogStatus.PASS, "Menampilkan Halaman Upload");
   }
   //Test Case 7
   @When("Klik button Refresh")
   public void klik_button_refresh() {
	   returnPage.clickbtnRef();
	   extentTest.log(LogStatus.PASS,"Klik button Refresh");
   }
   @Then("Halaman Return Akan Refresh")
   public void halaman_return_akan_refresh() {
	   Assert.assertEquals(returnPage.getTxtReset(), "");
	   extentTest.log(LogStatus.PASS, "Halaman Return Akan Refresh");
   }
}
