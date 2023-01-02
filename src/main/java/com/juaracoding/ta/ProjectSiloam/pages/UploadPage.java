package com.juaracoding.ta.ProjectSiloam.pages;

import com.juaracoding.ta.ProjectSiloam.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPage {

    private WebDriver driver;

    public UploadPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    WebElement btnOk;
    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Awal']")
    WebElement btnAwal;
    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Tujuan']")
    WebElement btnTujuan;
    @FindBy(xpath = "//span[normalize-space()='Tanda Tangan Digital']")
    WebElement btnTTD;
    @FindBy(xpath = "//input[@id='file']")
    WebElement btnChoose;
    @FindBy(xpath = "//button[@id='btnSave']")
    WebElement btnSimpan;
    @FindBy(xpath = "//*[@id=\"default-tab-2\"]/div[2]/div/div/a")
    WebElement btnLanjut;


    public void clickBtnOk() {
        btnOk.click();
    }
    public void clickBtnAwal(){
        btnAwal.click();
    }
    public void clickBtnTujuan(){
        btnTujuan.click();
    }
    public void clickBtnTTD(){
        btnTTD.click();
    }
    public void clickBtnSimpan(){
        btnSimpan.click();
    }

    public void clickBtnLanjut(){
        btnLanjut.click();
    }
    public void clickBtnChooseAwal(){

        btnChoose.sendKeys("E:\\GAMBAR\\B.jpg");
    }
    public void clickBtnChooseTujuan(){
        btnChoose.sendKeys("E:\\GAMBAR\\B.jpg");
    }
    public void clickBtnChooseTTD(){
        btnChoose.sendKeys("E:\\GAMBAR\\B.jpg");
    }

}
