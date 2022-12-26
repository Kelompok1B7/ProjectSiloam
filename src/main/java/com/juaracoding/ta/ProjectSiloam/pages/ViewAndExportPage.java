package com.juaracoding.ta.ProjectSiloam.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ta.ProjectSiloam.drivers.DriverSingleton;

public class ViewAndExportPage {
	private static WebDriver driver;
	
	public ViewAndExportPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
	}
	// View & Export
	@FindBy(xpath = "//input[@id='datepicker']")
	   WebElement sdate;
	@FindBy(xpath = "//input[@id='datepicker2']")
	   WebElement edate;
	@FindBy(xpath = "//i[@class='fa fa-filter']")
	   WebElement btnFilter;
	@FindBy(xpath = "//i[@class='fa fa-redo-alt']")
	   WebElement btnRefresh;
	@FindBy(xpath = "//i[@class='fa fa-file-export']")
	   WebElement btnExport;
	@FindBy(xpath = "//button[normalize-space()='Download']")
	   WebElement btnDownload;
	@FindBy(xpath = "//*[@id=\"data-table-default2\"]/tbody/tr[3]/td[7]/a")
	   WebElement btnAwal;
	@FindBy(xpath = "//*[@id=\"data-table-default2\"]/tbody/tr[3]/td[8]/a")//tbody/tr[3]/td[2]/a[1]
	   WebElement btnTujuan;
	@FindBy(xpath = "//*[@id=\"data-table-default2\"]/tbody/tr[3]/td[9]/a")//tbody/tr[3]/td[2]/a[1]
	   WebElement btnPDF;
	
	@FindBy(xpath = "//*[@id=\"data-table-default2\"]/tbody/tr[3]/td[2]/a")//tbody/tr[3]/td[7]/a[1]
	   WebElement btnViewData;
	@FindBy(xpath = "/html/body/div[5]/div/div/div/div[2]/form/div/table/tbody/tr[2]/th[1]/a/img")
	   WebElement imgViewBefore;
	@FindBy(xpath = "/html/body/div[5]/div/div/div/div[2]/form/div/table/tbody/tr[2]/th[2]/a/img")
	   WebElement imgViewAfter;
	@FindBy(xpath = "//a[@id='preview']")
	   WebElement btnPreviewData;
	@FindBy(xpath = "//a[@class='btn btn-danger']")
	   WebElement btnViewBack;
	
	
	@FindBy(xpath = "//h1[@class='page-header']")
	   WebElement txtViewExport;
	@FindBy(xpath = "//body//img")
	   WebElement previewImage;
	
	public void setStartDate(String sdate){
		 
        this.sdate.sendKeys(sdate);
        this.sdate.sendKeys(Keys.ENTER);
    }
    public void setEndDate(String edate){
        this.edate.sendKeys(edate);
        this.sdate.sendKeys(Keys.ENTER);
    }
    public void clickBtnFilter(){
        btnFilter.click();
    }
    public void clickBtnRefresh(){
        btnRefresh.click();
    }
    public void clickBtnExport(){
        btnExport.click();
    }
    public void clickBtnDownload(){
        btnDownload.click();
    }
    public void clickBtnView(){
        btnViewData.click();
    }
    public void clickBtnAwal(){
        btnAwal.click();
    }
    public void clickBtnTujuan(){
        btnTujuan.click();
    }
    public void clickBtnPDF(){
        btnPDF.click();
    }
  
    // View Data
    public void clickBefore(){
        imgViewBefore.click();
    }
    public void clickAfter(){
        imgViewAfter.click();
    }
    public void clickBtnPreview(){
        btnPreviewData.click();
    }
    public void clickBtnViewBack(){
        btnViewBack.click();
    }
    
    public String getTxtViewExport(){
      return txtViewExport.getText();
  }
    public String getTxtPreview(){
    return previewImage.getText();
    }
//    public String getTxtPleaseFill(){
//        return "please fill out this field";
//    }
//    public String getTxtInvalidCredentials(){
//        return txtWrongUsernamePassword.getText();
//    }
//    public String getTxtDashbaord(){
//        return txtDashboard.getText();
//    }
}
