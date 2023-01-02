package com.juaracoding.ta.ProjectSiloam.pages;

import com.juaracoding.ta.ProjectSiloam.drivers.DriverSingleton;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TTDdigialPage {
    private WebDriver driver;
//    private Actions faskes_tujuan;
//    private Actions Btnkota_ktp;

    public TTDdigialPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //    @FindBy(xpath = "//*[@id=\"btnEdit\"]")
    @FindBy(xpath = "//*[@id=\"btnEdit\"]")
    WebElement btnEdit;
    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement nama;
    public void btnEdit(){
        btnEdit.click();
    }
    public void updatenama() {
        nama.clear();
        nama.sendKeys("Fulanah");
    }
    @FindBy(xpath = "//input[@id='no_bpjs']")
    WebElement no_bpjs;
    public void updateno_bpjs(){
        no_bpjs.clear();
        no_bpjs.sendKeys("35421742534");
    }
    @FindBy(xpath = "//input[@id='no_ktp']")
    WebElement no_ktp;
    public void updateno_ktp(){
        no_ktp.clear();
        no_ktp.sendKeys("8224532123456736");
    }

    @FindBy(xpath = "//textarea[@id='address']")
    WebElement alamat;
    public void updatealamat(){
        alamat.clear();
        alamat.sendKeys("JL.H.Sanan");
    }
    //    dropdown
    @FindBy(xpath = "")
    WebElement btnKota_Ktp;

    //   mengisi data jakarta timur
    @FindBy(xpath = "//option[@value='KOTA JAKARTA TIMUR']")
    WebElement btnKota_Ktp2;

    public void clickBtnKota_Ktp(){

        btnKota_Ktp.click();
    }
    public void clickBtnKota_Ktp2(){

        btnKota_Ktp2.click();
    }

    @FindBy(xpath = "//input[@id='origin_faskes']")
    WebElement faskes_awal;
    public void updatfaskes_awal(){
        faskes_awal.clear();
        faskes_awal.sendKeys("JL.H.aja");
    }

    @FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
    WebElement updatefaskes_tujuan;

//    @FindBy(xpath = "//input[@role='textbox']")
    @FindBy(xpath = "//*[@id=\"select2-destination_faskes-result-oquz-3||Clinic Bona Indah||Kota Jakarta Selatan\"]")
    WebElement faskes_tujuan2;

   public void faskes(){
       updatefaskes_tujuan.click();
       faskes_tujuan2.click();
   }
    @FindBy(xpath = "//textarea[@id='reason']")
    WebElement alasan;
    public void updatealasan(){
        alasan.clear();
        alasan.sendKeys("Rujukan");
    }
    @FindBy(xpath = "//button[@id='btnUpdate']")
    static
    WebElement btnSimpan;
    public void btnSimpan() {
        btnSimpan.click();
    }
}


