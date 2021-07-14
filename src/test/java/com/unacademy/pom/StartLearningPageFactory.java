package com.unacademy.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.unacademy.library.Utility;

public class StartLearningPageFactory {
	public WebDriver driver;
	public Utility util = new Utility();
	
	@FindBy(xpath = "//button[text()='Start learning']") List<WebElement> startlearningcmd;
	
	public StartLearningPageFactory(WebDriver driver) 
	{
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void clickStartLearnComptitiveCmd() throws InterruptedException 
	{
		WebElement startlearningcompetativecmd = startlearningcmd.get(0);
		util.scrolltoElement(driver, startlearningcompetativecmd);
		util.waitMetod(2);
		startlearningcompetativecmd.click();
	}

	public void clickStartLearnClass6to12Cmd() throws InterruptedException 
	{
		WebElement startlearningclass6to12cmd = startlearningcmd.get(1);
		util.scrolltoElement(driver, startlearningclass6to12cmd);
		util.waitMetod(2);
		startlearningclass6to12cmd.click();
	}

	public String gettitle() 
	{
		return driver.getTitle();
	}
}
