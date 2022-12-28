package com.juaracoding.ta.ProjectSiloam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.ta.ProjectSiloam.drivers.DriverSingleton;

public class ReturnPage {
	
	private static WebDriver driver;
	
	  public ReturnPage() {
	        this.driver = DriverSingleton.getDriver();
	        PageFactory.initElements(driver, this);
	    }
	  
	  @FindBy(xpath = "//span[normalize-space()='New']")
	   WebElement New;
	  @FindBy(xpath = "//input[@id='tgl']")
	   WebElement sdate;
	  @FindBy(xpath = "//input[@id='tgl2'] ")
	   WebElement edate;
	  Select se = new Select(driver.findElement(By.xpath("//span[@id='select2-status-container']")));
	//span[@id='select2-status-container']
	  @FindBy(xpath = "//button[@id='btn-filter']")
	   WebElement btnFilter;
	  @FindBy(xpath = "//button[@id='btn-reset']")
	   WebElement btnReset;
	  
	  @FindBy(xpath = "//input[@type='search'] ")
	   WebElement Search;
	  @FindBy(xpath = "//i[@class='fa fa-search']")
	   WebElement btnSearch;
	  @FindBy(xpath = "//span[@id='btnRefresh']")
	   WebElement btnRefresh;
	
	  @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/center[1]/a[1]/span[1]']")
	   WebElement btnIcon;
	
	  @FindBy(xpath = "//tbody/tr[1]/td[7]/span[1]")
	   WebElement txtDataCom;
	  @FindBy(xpath = " /html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/center[1]/a[1]/span[1]")
	   WebElement txtDataPen;
	  @FindBy(xpath = "//td[@class='dataTables_empty']")
	   WebElement txtNoData;
	
	  @FindBy(xpath = "//td[normalize-space()='HANDI SETIAWAN']")
	   WebElement txtSearch;
	  @FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
	   WebElement txtUpload;
	  
	  //Filter Data
	  
	  public void clickbtnNew(){
	      	 New.click();
	      	}
	  public void setStartDate(String sdate) {
	    this.sdate.sendKeys(sdate);
	    this.sdate.sendKeys(Keys.TAB);
	     }
	  public void setEndDate(String edate){
	     this.edate.sendKeys(edate);
	     this.edate.sendKeys(Keys.TAB);
	    }
	  public void setStatusComp(){
	     se.selectByIndex(2);
	    }
	  public void setStatusPen(){
      	 se.selectByIndex(1);
      	}
	  public void clickbtnFil(){
	      	 btnFilter.click();
	      	}
	  public void clickbtnRes(){
	      	 btnReset.click();
	      	}
	  public void clickbtnIcon(){
	      	 btnIcon.click();
	      	}
	  //Search Data
	  public void setSearch(String search) {
		    this.Search.sendKeys(search);
		    this.Search.sendKeys(Keys.TAB);
		     }
	  public void clickbtnSearch(){
	      	 btnSearch.click();
	      	}
	  public void clickbtnRef(){
	      	 btnRefresh.click();
	      	}
	  
	  public String getTxtReset(){
		    return sdate.getText();
		    }
	  public String getTxtPen(){
		    return txtDataPen.getText();
		    }
	  public String getTxtCom(){
		    return txtDataCom.getText();
		    }
	  public String getTxtNoData(){
		    return txtNoData.getText();
		    }
	  public String getTxtSearch(){
		    return txtSearch.getText();
		    }
	  public String getTxtUpload(){
		    return txtUpload.getText();
		    }
}
