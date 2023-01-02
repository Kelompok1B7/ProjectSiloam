package com.juaracoding.ta.ProjectSiloam.step_definitions;

import com.juaracoding.ta.ProjectSiloam.pages.InputPages;

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
    private InputPages inputPage = new InputPages();

    public TestInput() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Test Case 21
    @Given("TS76_Berada Di Halaman Input")
    public void p16_klik_button_input() {
        inputPage.clickBtnInput();
        extentTest.log(LogStatus.PASS, "User click button Input");
    }
    public void ts76_berada_ke_halaman_Input() {
        extentTest.log(LogStatus.PASS, "User berada di halaman input");
    }
    @When("TS77_Mengisi semua field dengan benar")
    public void ts77_mengisi_semua_field_dengan_benar() {
        inputPage.nama("Elma Lucyana Christine");

        inputPage.nomorbpjs("1900897678422");
        extentTest.log(LogStatus.PASS, "Nomor BPJS diisi kurang dari 13 karater");

        inputPage.nomorktp("8900903458943787");

        inputPage.alamat("Graha Handaya, Unit Q-S, Jl. Raya Perjuangan No.12A, Kebon Jeruk, Kota Jakarta Barat, DKI Jakarta.");

        inputPage.clickBtnKota_Ktp();

        inputPage.clickBtnKota_Ktp2();

        inputPage.faskesawal("Faskes Diponegoro Utara");

        inputPage.clickBtnFaskes_Tujuan();

        inputPage.clickBtnFaskes_Tujuan2();

        inputPage.alasan("Faskes awal terlalu jauh dari rumah");

    }

    @When("TS78_Klik button Simpan Data")
    public void ts78_klik_button_simpan_data() {
        inputPage.clickBtnSimpan_Data();
        extentTest.log(LogStatus.PASS, "User click button Simpan Data");
    }
    @Then("TS79_Berpindah ke Halaman Upload")
    public void ts79_berpindah_ke_halaman_upload() {
        extentTest.log(LogStatus.PASS, "User Berpindah ke halaman selanjutnya");
    }

}

