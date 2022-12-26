package com.juaracoding.ta.ProjectSiloam.step_definitions;

import com.juaracoding.ta.ProjectSiloam.pages.InputPage;

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

public class TestInput {
	
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private InputPage inputPage = new InputPage();

   public TestInput() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
   
    //Test Case 1	
   @Given("Berada Di Halaman Home")
   public void masuk_ke_halaman_Home_() {
   	extentTest.log(LogStatus.PASS, "User memasuki halaman home");
    }
    
    @When("Klik button Input")
    public void klik_button_input() {
    	inputPage.clickBtnInput();
        extentTest.log(LogStatus.PASS, "User click button Input");
    }
    @Then("Masuk Ke Halaman Input")
    public void masuk_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User Memasuki Halaman Input");
    }
    
    // Test Case 2
    @Given("Berada Di Halaman Input")
    public void masuk_ke_halaman_Input_() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    
    @When("Klik button Upload")
    public void klik_button_upload() {
    	inputPage.clickBtnUpload();
        extentTest.log(LogStatus.PASS, "User click button Upload");
    }
    @Then("Tetap di Halaman Input")
    public void tetap_di_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User Tetap di Halaman Input");
    }
    
 // Test Case 3
    @Given("Berada Di Halaman Input Dua")
    public void berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    
    @When("Klik button TTD Digital")
    public void klik_button_ttd_digital() {
    	inputPage.clickBtnTTD_Digital();
        extentTest.log(LogStatus.PASS, "User click button TTD Digital");
    }
    @Then("Tetap di Halaman Input Dua")
    public void tetap_di_halaman_Input_2() {
    	extentTest.log(LogStatus.PASS, "User Tetap di Halaman Input");
    }
    
    // Test Case 4
    @Given("Berada Di Halaman Input Tiga")
    public void berada_ke_halaman_Input_3() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    @When("Nama Kosong")
    public void nama_kosong() {
    	 inputPage.nama("");
         extentTest.log(LogStatus.PASS, "Nama tidak diisi");
    }
    @When("Nomor BPJS Kosong")
    public void nomor_bpjs_kosong() {
    	 inputPage.nomorbpjs("");
         extentTest.log(LogStatus.PASS, "Nomor BPJS tidak diisi");
    }
    
    @When("Nomor KTP Kosong")
    public void nomor_ktp_kosong() {
    	 inputPage.nomorktp("");
         extentTest.log(LogStatus.PASS, "Nomor KTP tidak diisi");
    }
    @When("Alamat Kosong")
    public void alamat_kosong() {
    	 inputPage.alamat("");
         extentTest.log(LogStatus.PASS, "Alamat tidak diisi");
    }
    @When("Kota KTP Kosong")
    public void kota_ktp_kosong() {
    	 inputPage.clickBtnKota_Ktp();
         extentTest.log(LogStatus.PASS, "Kota KTP tidak diisi");
    }
//  //option[@value='KABUPATEN BANDUNG']
//    @When("Kota KTP Kosong kedua")
//    public void kota_ktp_kosong2() {
//    	 inputPage.clickBtnKota_Ktp2();
//         extentTest.log(LogStatus.PASS, "Kota KTP tidak diisi dua");
//    }
    @When("Faskes Awal Kosong")
    public void faskes_awal_kosong() {
    	 inputPage.alamat("");
         extentTest.log(LogStatus.PASS, "Alamat tidak diisi");
    }
    @When("Faskes Tujuan Kosong")
    public void faskes_tujuan_kosong() {
    	 inputPage.clickBtnFaskes_Tujuan();
         extentTest.log(LogStatus.PASS, "Faskes Tujuan tidak diisi");
    }
    
    @When("Klik button Simpan Data")
    public void klik_button_simpan_data() {
    	inputPage.clickBtnSimpan_Data();
        extentTest.log(LogStatus.PASS, "User click button Simpan Data");
    }
    @Then("Tetap di Halaman Input Tiga")
    public void tetap_di_halaman_Input_3() {
    	Assert.assertEquals(inputPage.getTxtPleaseFill(), "please fill out this field");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan informasi Data tidak boleh kosong");
    	driver.close();
    }
    
}

