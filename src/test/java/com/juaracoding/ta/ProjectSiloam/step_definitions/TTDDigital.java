package com.juaracoding.ta.ProjectSiloam.step_definitions;

import com.juaracoding.ta.ProjectSiloam.pages.TTDdigialPage;
import com.juaracoding.ta.ProjectSiloam.pages.UploadPage;
import com.juaracoding.ta.ProjectSiloam.utils.Constants;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TTDDigital {

    private static WebDriver driver;
    private static com.relevantcodes.extentreports.ExtentTest extentTest;
    private TTDdigialPage TTDPage = new TTDdigialPage();
    private Object btnEdit;

    public TTDDigital() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


//    @When("Berada di halaman ttd digital")
//    public void berada_di_halaman_ttd_digital() {
//
//        extentTest.log(LogStatus.PASS, "Berada di halaman ttd digital");
//        // Write code here that turns the phrase above into concrete actions
//
//    }
    @And("User klik edit")
    public void user_klik_edit() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("argumen[0].click();",btnEdit);
//        btnEdit.click();
    TTDPage.btnEdit();
        Hooks.delay(2);
//        TTDPage.btnEdit();
        extentTest.log(LogStatus.PASS, "User klik edit");
        // Write code here that turns the phrase above into concrete actions

    }
    @And("User mengubah nama")
    public void user_mengubah_nama() {
        TTDPage.updatenama();
        extentTest.log(LogStatus.PASS, "User mengubah nama");
        // Write code here that turns the phrase above into concrete actions

    }
    @And("User mengubah no BPJS")
    public void user_mengubah_no_bpjs() {
        TTDPage.updateno_bpjs();
        extentTest.log(LogStatus.PASS, "User mengubah no BPJS");
        // Write code here that turns the phrase above into concrete actions

    }
    @And("User mengubah no KTP")
    public void user_mengubah_no_ktp() {
        TTDPage.updateno_ktp();
        extentTest.log(LogStatus.PASS, "User mengubah no KTP");
        // Write code here that turns the phrase above into concrete actions

    }
    @And("User mengubah alamat")
    public void user_mengubah_alamat() {
        TTDPage.updatealamat();
        extentTest.log(LogStatus.PASS, "User mengubah alamat");
        // Write code here that turns the phrase above into concrete actions

    }
    @And("User select kota KTP")
    public void user_select_kota_ktp() {
        TTDPage.btnkota_ktp1();
        extentTest.log(LogStatus.PASS, "User select kota KTP");
        // Write code here that turns the phrase above into concrete actions
    }

    @And("User click kota KTP")
    public void user_click_kota_ktp() {
        TTDPage.btnkota_ktp2();
        extentTest.log(LogStatus.PASS, "user select kota ktp");
    }
    @And("User mengubah faskes awal")
    public void user_mengubah_faskes_awal() {
        TTDPage.updatfaskes_awal();
        extentTest.log(LogStatus.PASS, "User mengubah faskes awal");
        // Write code here that turns the phrase above into concrete actions

    }
    @When("User select faskes tujuan")
    public void user_select_faskes_tujuan() {
       TTDPage.faskes();
//        TTDPage.faskes_tujuan2();
        extentTest.log(LogStatus.PASS, "User select faskes tujuan");
        // Write code here that turns the phrase above into concrete actions

    }
    @When("User mengubah alasan")
    public void user_mengubah_alasan() {
        TTDPage.updatealasan();
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("User klik tombol simpan")
    public void user_klik_tombol_simpan() {
        TTDPage.btnSimpan();
        extentTest.log(LogStatus.PASS, " User klik tombol simpan");
        // Write code here that turns the phrase above into concrete actions

    }
}