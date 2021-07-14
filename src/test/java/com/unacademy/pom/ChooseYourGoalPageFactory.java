package com.unacademy.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.unacademy.library.Utility;

public class ChooseYourGoalPageFactory 
{
	public Utility util = new Utility();
	public WebDriver driver;
	@FindBy(xpath = "//ul[contains(@class,'GoalGroupNav')]//child::li") List<WebElement> listofgoals;
	
	public ChooseYourGoalPageFactory(WebDriver driver) 
	{
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnGoal(String goal) throws InterruptedException 
	{
		WebElement goaloption = driver.findElement(By.xpath("//p[text()='"+goal+"']"));
		util.scrolltoElement(driver, goaloption);
		util.waitMetod(2);
		goaloption.click();
	}
	
	public int noOfGoals() throws InterruptedException 
	{
		util.waitMetod(2);
		return listofgoals.size();
	}

	public String getTitle() throws InterruptedException 
	{
		util.waitMetod(2);
		return driver.getTitle();	
	}
	
}
