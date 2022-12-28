package com.juaracoding.ta.ProjectSiloam.pages;

import com.juaracoding.ta.ProjectSiloam.drivers.DriverSingleton;
import com.juaracoding.ta.ProjectSiloam.drivers.strategies.Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginAdminPage {
    private WebDriver driver;

    public LoginAdminPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    //URL
    @FindBy(xpath = " /html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
    WebElement search;
   
    //Login
   @FindBy(xpath = "//input[@placeholder='Username']")
   WebElement username;
   @FindBy(xpath = "//input[@placeholder='Password']")
   WebElement password;
   @FindBy(xpath = "//button[@type='submit']")
   WebElement btnLogin;
    
   //Alert
   @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissable']")
    WebElement txtWrongUsernamePassword;
   @FindBy(xpath = "//h1[@class='page-header']")
    WebElement txtDashboard;


   //Url
   public void searchURL(String search){
       this.search.sendKeys(search);
   }
   public void enterURL(){
	   this.search.sendKeys(Keys.ENTER);
   }
   
   //Login
    public void usernameA(String username){
        this.username.sendKeys(username);
    }
    public void passwordA(String password){
        this.password.sendKeys(password);
    }
    public void clickBtnLogin(){
        btnLogin.click();
    }
    
    //Alert
    public String getTxtPleaseFill(){
        return "please fill out this field";
    } public String getTxtWrongUserPass(){
        return "Wrong username or password!";
    }
    public String getTxtDashbaord(){
        return txtDashboard.getText();
    }
    
}
