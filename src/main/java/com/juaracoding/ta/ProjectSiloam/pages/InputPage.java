package com.juaracoding.ta.ProjectSiloam.pages;

import com.juaracoding.ta.ProjectSiloam.drivers.DriverSingleton;
import com.juaracoding.ta.ProjectSiloam.drivers.strategies.Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InputPage {
    private WebDriver driver;

    public InputPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    
  //a[@href='https://dev.ptdika.com/siloam/sales/input']
    
   @FindBy(xpath = "//a[@href='https://dev.ptdika.com/siloam/sales/input']")
   WebElement btnInput;
   
 //li[@class='nav-items']//a[@class='nav-link disabled']//span[@class='d-sm-block d-none']
   @FindBy(xpath = "//li[@class='nav-items']//a[@class='nav-link disabled']//span[@class='d-sm-block d-none']")
   WebElement btnUpload;
   
 //li[2]//a[1]//b[1]//span[2]
   @FindBy(xpath = "//li[2]//a[1]//b[1]//span[2]")
   WebElement btnTTD_Digital;
   
 //input[@id='name']
   @FindBy(xpath = "//input[@id='name']")
   WebElement nama;
   
   String txtPleaseFill = "please fill out this field";
   
 //input[@id='no_bpjs']
   @FindBy(xpath = "//input[@id='no_bpjs']")
   WebElement nomorbpjs;
     
 //input[@id='no_ktp']
   @FindBy(xpath = "//input[@id='no_ktp']")
   WebElement nomorktp;
   
 //textarea[@id='address']
   @FindBy(xpath = "//textarea[@id='address']")
   WebElement alamat;
   
   String txtFillAlamat = "Field Alamat Harus Diisi!";
   
 //span[@id='select2-ktp_city-container']
   @FindBy(xpath = "//span[@id='select2-ktp_city-container']")
   WebElement btnKota_Ktp;
   
   String txtSelectItem = "Please select an item in the list.";
   
 //span[@id='select2-ktp_city-container']
   @FindBy(xpath = "//option[@value='KABUPATEN BANDUNG']")
   WebElement btnKota_Ktp2;  
   
 //option[@value='KOTA JAKARTA SELATAN']
   @FindBy(xpath = "//option[@value='KOTA JAKARTA BARAT']")
   WebElement btnKota_Ktp3;  
   
   @FindBy(xpath = "//input[@id='origin_faskes']")
   WebElement faskesawal;
   
   @FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
   WebElement btnFaskes_Tujuan;
   
 //option[@value='1||Clinic Meruya||Kota Jakarta Barat']
   @FindBy(xpath = "//option[@value='1||Clinic Meruya||Kota Jakarta Barat']")
   WebElement btnFaskes_Tujuan2;
   
 //textarea[@id='reason']
   @FindBy(xpath = "//textarea[@id='reason']")
   WebElement alasan;
   
   String txtFillAlasan = "Field Alasan Harus Diisi!";
   
   @FindBy(xpath = "//button[@type='submit']")
   WebElement btnSimpan_Data;
   
   String txtUploadDoc = "UNTUK KE TAHAP SELANJUTNYA, DOKUMEN YANG WAJIB DIUPLOAD HARAP UNTUK DI LENGKAPI !";
   
   
   //TAU BATASAN
   
    public void clickBtnInput(){
        btnInput.click();
    }
    	
    public void clickBtnUpload(){
        btnUpload.click();
    }
    
    public void clickBtnTTD_Digital(){
        btnTTD_Digital.click();
    }
    
    public void nama(String nama){
        this.nama.sendKeys(nama);
    }
    public void nomorbpjs(String nomorbpjs){
        this.nomorbpjs.sendKeys(nomorbpjs);
    }
    public void nomorktp(String nomorktp){
        this.nomorktp.sendKeys(nomorktp);
    }
    public void alamat(String alamat){
        this.alamat.sendKeys(alamat);
    }
    public void clickBtnKota_Ktp(){
        btnKota_Ktp.click();
    }
    public void clickBtnKota_Ktp2(){
        btnKota_Ktp2.click();
    }
    public void clickBtnKota_Ktp3(){
        btnKota_Ktp3.click();
    }
    public void faskesawal(String faskesawal){
        this.faskesawal.sendKeys(faskesawal);
    }
    public void clickBtnFaskes_Tujuan(){
        btnFaskes_Tujuan.click();
    }
    public void clickBtnFaskes_Tujuan2(){
        btnFaskes_Tujuan2.click();
    }
    public void alasan(String alasan){
        this.alasan.sendKeys(alasan);
    }
    
    public void clickBtnSimpan_Data(){
        btnSimpan_Data.click();
    }

    public String getTxtPleaseFill(){
        return "please fill out this field";
    }
    
    public String getTxtFillAlamat(){
        return "Field Alamat Harus Diisi!";
    }
    public String getTxtSelectItem(){
        return "Please select an item in the list.";
    }
    public String getTxtFillAlasan(){
        return "Field Alasan Harus Diisi!";
    }
    public String getTxtUploadDoc(){
        return "UNTUK KE TAHAP SELANJUTNYA, DOKUMEN YANG WAJIB DIUPLOAD HARAP UNTUK DI LENGKAPI !";
    }
}
