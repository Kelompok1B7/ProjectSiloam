package com.juaracoding.ta.ProjectSiloam.pages;

import com.juaracoding.ta.ProjectSiloam.drivers.DriverSingleton;
import com.juaracoding.ta.ProjectSiloam.drivers.strategies.Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    
   @FindBy(xpath = "//input[@placeholder='Username']")
   WebElement username;

   @FindBy(xpath = "//input[@placeholder='Password']")
   WebElement password;

   @FindBy(xpath = "//button[@type='submit']")
   WebElement btnLogin;
    
   String txtPleaseFill = "please fill out this field";
    
   @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissable']")
    WebElement txtWrongUsernamePassword;
   
   @FindBy(xpath = "//h1[@class='page-header']")
    WebElement txtDashboard;

    public void usernameA(String username){
        this.username.sendKeys(username);
    }
    public void passwordA(String password){
        this.password.sendKeys(password);
    }
    public void clickBtnLogin(){
        btnLogin.click();
    }
    public String getTxtPleaseFill(){
        return "please fill out this field";
    }
    public String getTxtInvalidCredentials(){
        return txtWrongUsernamePassword.getText();
    }
    public String getTxtDashbaord(){
        return txtDashboard.getText();
    }
    
}
