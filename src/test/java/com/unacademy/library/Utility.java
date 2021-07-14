package com.unacademy.library;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility
{
	String path = "C:\\Capgemini\\Unacademy\\config.properties";
	File configFile = new File(path);
	FileReader reader ;
	Properties props ;	
	
	public void configfileinitialization() throws IOException
	{
		reader = new FileReader(configFile);
		props = new Properties();
		props.load(reader);
	}
	
	public String getWebDriver() throws IOException
	{
		configfileinitialization();
		return props.getProperty("Web_Driver");
	}

	public String getBaseUrl() throws IOException
	{
		configfileinitialization();
		return props.getProperty("baseUrl");
	}

	public String getExecutor() throws IOException
	{
		configfileinitialization();
		return props.getProperty("executable");
	}
    
	public void scrolltoElement(WebDriver driver,WebElement element)
	{
		JavascriptExecutor je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",element);
	}
	
	public String getExcelSheetPath() throws IOException
	{
		configfileinitialization();
		return props.getProperty("testDataexcelfile");
	}
	public String getExcelSheet1Name() throws IOException
	{
		configfileinitialization();
		return props.getProperty("sheet1name");
	}
	public String getExcelSheet2Name() throws IOException
	{
		configfileinitialization();
		return props.getProperty("sheet2name");
	}
	public void waitMetod(int seconds) throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		Thread.sleep(seconds*1000);
	}
	
	public int noOfGoalsInClass() 
	{
	   	return 5;
	}
	public int noOfGoalsInExams() 
	{
	   	return 20;
	}
}
