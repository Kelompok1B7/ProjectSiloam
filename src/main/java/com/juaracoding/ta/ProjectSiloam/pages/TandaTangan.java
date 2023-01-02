//package com.juaracoding.ta.ProjectSiloam.pages;
//
//import com.juaracoding.ta.ProjectSiloam.drivers.DriverSingleton;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class TandaTangan {
//    private WebDriver driver;
//    public TandaTangan(){
//        this.driver = DriverSingleton.getDriver();
//        PageFactory.initElements(driver, this);
//    }
//    @FindBy(xpath = "//button[@id='btnEdit']")
//    WebElement editBtn;
//
//    @FindBy(xpath = "//input[@id='name']")
//    WebElement nama;
//
//  public void editBtn(){
//      editBtn.click();
//  }
//    public void nama (String nama){
//        this.nama.sendKeys(nama);
//    }
//
//
//}
