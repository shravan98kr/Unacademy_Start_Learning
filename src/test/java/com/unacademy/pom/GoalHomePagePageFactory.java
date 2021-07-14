package com.unacademy.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.unacademy.library.Utility;

public class GoalHomePagePageFactory {
	public WebDriver driver ;
	public Utility util = new Utility();

	@FindBy(xpath="//h3[text()='Prepare with Top Educators']") WebElement preparewithtopeducatorheader;
	@FindBy(xpath="//h3[text()='Batches for syllabus completion']") WebElement batchesforsyllabuscompletionheader;
	@FindBy(xpath="//h3[text()='Courses starting soon']") WebElement coursesstartingsoonheader;
	@FindBy(xpath="//h3[text()='Best of all time']") WebElement bestofalltimeheader;
	@FindBy(xpath="//h3[text()='Comprehensive syllabus']") WebElement comprehensivesyllabusheader;
	@FindBy(xpath="//h3[text()='Track your preparation']") WebElement trackyourpreparationheader;
	@FindBy(xpath ="//h1[text()='Live Classes']" ) WebElement liveclassheader;
	@FindBy(xpath = "//h2[text()='Get the learning app']") WebElement applicationheader;
	@FindBy(xpath = "//h4[text()='See all'][@data-analytics='subscription-seeAll']") WebElement seeall_link;
	@FindBy(xpath = "//h2[text()='Learn on the phone or the computer']") WebElement appheader;

	public GoalHomePagePageFactory(WebDriver driver) 
	{
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void scrollToPrepareWithTopEducatorHeader() throws InterruptedException 
	{
		util.scrolltoElement(driver, preparewithtopeducatorheader);
	}
	public void scrollToBatchesForSyllabusCompletionHeader() throws InterruptedException 
	{
		util.scrolltoElement(driver, batchesforsyllabuscompletionheader);
	}
	public void scrollToCoursesStartingSoonHeader() throws InterruptedException 
	{
		util.scrolltoElement(driver, coursesstartingsoonheader);
	}
	public void scrollToBestOfAllTimeHeader() throws InterruptedException 
	{
		util.scrolltoElement(driver, bestofalltimeheader);
	}
	public void scrollToComprehensiveSyllabusHeader() throws InterruptedException 
	{
		util.scrolltoElement(driver, comprehensivesyllabusheader);		
	}
	public void scrollToTrackYourPreparationHeader() throws InterruptedException 
	{
		util.scrolltoElement(driver, trackyourpreparationheader);		
	}
	public void scrollToLiveClassHeader() throws InterruptedException 
	{
		util.scrolltoElement(driver, liveclassheader);		
	}
	public void scrollToApplicationHeader() throws InterruptedException 
	{
		util.scrolltoElement(driver, applicationheader);		
	}

	public void scrollToAppHeader() throws InterruptedException 
	{    	
		util.scrolltoElement(driver, appheader);		
	}

	public boolean isPrepareWithTopEducatorHeaderDisplayed() throws InterruptedException
	{    	
		util.scrolltoElement(driver, preparewithtopeducatorheader);
		return preparewithtopeducatorheader.isDisplayed();
	}

	public boolean isBatchesForSyllabusCompletionHeaderDisplayed() throws InterruptedException
	{
		util.scrolltoElement(driver, batchesforsyllabuscompletionheader);
		return batchesforsyllabuscompletionheader.isDisplayed();  
	}

	public boolean isCoursesStartingSoonHeaderDisplayed() throws InterruptedException
	{
		util.scrolltoElement(driver, coursesstartingsoonheader);
		return coursesstartingsoonheader.isDisplayed();
	}

	public boolean isBestOfAllTimeHeaderDisplayed() throws InterruptedException
	{
		util.scrolltoElement(driver, bestofalltimeheader);
		return bestofalltimeheader.isDisplayed();  
	}

	public boolean isComprehensiveSyllabusHeaderDisplayed() throws InterruptedException
	{
		util.scrolltoElement(driver, comprehensivesyllabusheader);		
		return comprehensivesyllabusheader.isDisplayed();  
	}

	public boolean isTrackYourPreparationHeaderDisplayed() throws InterruptedException
	{
		util.scrolltoElement(driver, trackyourpreparationheader);	
		return trackyourpreparationheader.isDisplayed();  
	}

	public boolean isLiveClassHeaderDisplayed() throws InterruptedException
	{
		util.scrolltoElement(driver, liveclassheader);		
		return liveclassheader.isDisplayed();  
	}

	public boolean isApplicationHeaderDisplayed() throws InterruptedException
	{
		util.scrolltoElement(driver, applicationheader);	
		return applicationheader.isDisplayed();  
	}
	public boolean isAppHeaderDisplayed() throws InterruptedException
	{
		util.scrolltoElement(driver, appheader);
		return appheader.isDisplayed();  
	}
//
//
//	public void clickOnSeeAllLink() throws InterruptedException 
//	{
//		je =(JavascriptExecutor) driver;
//		je.executeScript("arguments[0].scrollIntoView();",liveclassheader);
//		Thread.sleep(1000);
//		seeall_link.click();
//	}

    public void  clickOnProfile(String educator) throws InterruptedException 
	{
		util.scrolltoElement(driver, preparewithtopeducatorheader);
		util.waitMetod(2);
		driver.findElement(By.xpath("//h3[text()='"+educator+"']")).click();
		util.waitMetod(2);
	}

	public void clickOnSubject(String syllabus) throws InterruptedException 
	{
		util.scrolltoElement(driver, comprehensivesyllabusheader);
		util.waitMetod(2);
		driver.findElement(By.xpath("//h5[text()='"+syllabus+"']")).click();
		util.waitMetod(2);
	}


	public void clickOnAppIcon(String app) throws InterruptedException 
	{
		util.scrolltoElement(driver, applicationheader);
		util.waitMetod(2);
		driver.findElement(By.xpath("//img[@alt='"+app+"']")).click();
		util.waitMetod(2);
	}

	public void clickOnBatch(String batch) throws InterruptedException 
	{
		util.scrolltoElement(driver, batchesforsyllabuscompletionheader);
		util.waitMetod(2);
		driver.findElement(By.xpath("//h5[text()='"+batch+"']")).click();
		util.waitMetod(2);
	}

	public void clickOnCourse(String course) throws InterruptedException 
	{
		util.scrolltoElement(driver, coursesstartingsoonheader);
		util.waitMetod(2);
		driver.findElement(By.xpath("//h5[text()='"+course+"']")).click();
		util.waitMetod(2);
	}

	public void clickOnBestcourse(String bestcourse) throws InterruptedException 
	{
		util.scrolltoElement(driver, bestofalltimeheader);
		util.waitMetod(2);		driver.findElement(By.xpath("//h5[text()='"+bestcourse+"']")).click();
		util.waitMetod(2);
	}


	public String getTitle() throws InterruptedException 
	{
		util.waitMetod(4);
		return driver.getTitle();	
	}

	public void navigation() throws InterruptedException 
	{
		driver.navigate().back();
		util.waitMetod(4);
	}

	public void quit() 
	{
		driver.quit();	
	}
	
	public void clickOnHomeNavigationHeader(String goal) throws InterruptedException 
	{
		util.waitMetod(3);
		driver.findElement(By.xpath("//p[text()='"+goal+"']")).click();
		util.waitMetod(3);
	}

}
