package com.juaracoding.ta.ProjectSiloam.step_definitions;

import com.aventstack.extentreports.ExtentTest;
import com.juaracoding.ta.ProjectSiloam.pages.UploadPage;
import com.juaracoding.ta.ProjectSiloam.utils.Constants;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.Logs;

import static com.relevantcodes.extentreports.LogStatus.PASS;

public class TestUpload {

    private static WebDriver driver;
    private static com.relevantcodes.extentreports.ExtentTest extentTest;
    private UploadPage UploadPage = new UploadPage();

    public TestUpload() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

   @Given("Berada Di Form Upload Document")
public void berada_di_form_upload_document() {
//       driver.get(Constants.URLR);
       // Write code here that turns the phrase above into concrete actions
}
@When("Klik button + Foto Faskes Awal")
public void klik_button_foto_faskes_awal() {
    UploadPage.clickBtnAwal();
    // Write code here that turns the phrase above into concrete actions
}
@When("Klik Choose File Faskes Awal")
public void klik_choose_file_faskes_awal() {
    UploadPage.clickBtnChooseAwal();
    // Write code here that turns the phrase above into concrete actions
}
@When("Klik button Simpan")
public void klik_button_simpan()
        throws InterruptedException {
//        Hooks.delay( 10);
    UploadPage.clickBtnSimpan();
    // Write code here that turns the phrase above into concrete actions
}
    @When("Klik button Ok")
    public void klik_button_ok() {
//        Hooks.delay(3);
//        driver.switchTo().alert().accept();
//        Hooks.delay(2);
        UploadPage.clickBtnOk();
    }
@When("Klik button + Foto Faskes Tujuan")
public void klik_button_foto_faskes_tujuan() {
//        Hooks.delay(5);
    Actions actions = new Actions(driver);
    actions.moveByOffset(50, 50).click();
    actions.build().perform();
    UploadPage.clickBtnTujuan();
    // Write code here that turns the phrase above into concrete actions
}
@When("Klik Choose File Faskes Tujuan")
public void klik_choose_file_faskes_tujuan() {
    UploadPage.clickBtnChooseTujuan();
    // Write code here that turns the phrase above into concrete actions
}
@When("Klik button + Foto TTD Digital")
public void klik_button_foto_ttd_digital() {
    Actions actions = new Actions(driver);
    actions.moveByOffset(50, 50).click();
    actions.build().perform();
    Hooks.delay(2);
    UploadPage.clickBtnTTD();
    // Write code here that turns the phrase above into concrete actions
}
@When("Klik Choose File TTD Digital")
public void klik_choose_file_ttd_digital() {
    UploadPage.clickBtnChooseTTD();
    // Write code here that turns the phrase above into concrete actions
}

@When("Klik Selanjutnya")
public void klik_selanjutnya() {
//    Actions actions = new Actions(driver);
////    actions.moveByOffset(50, 50).click();
//    actions.build().perform();
    Hooks.scroll(150);
//    Hooks.delay(2);
        UploadPage.clickBtnLanjut();
        driver.switchTo().alert().accept();
        Hooks.delay(2);
    // Write code here that turns the phrase above into concrete actions
}
@Then("User Ke Halaman TTD Digital")
public void user_ke_halaman_ttd_digital() {

}
 }
