package com.juaracoding.ta.ProjectSiloam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.ta.ProjectSiloam.drivers.DriverSingleton;

public class ReturnPage {
	private WebDriver driver;
	  public ReturnPage() {
	        this.driver = DriverSingleton.getDriver();
	        PageFactory.initElements(driver, this);
	    }
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

	
	  @FindBy(xpath = "//td[@class='dataTables_empty']")
	   WebElement txtNoData;
	//i[@class='fa fa-history']
	//tbody/tr[1]/td[7]/center[1]/a[1]
}
