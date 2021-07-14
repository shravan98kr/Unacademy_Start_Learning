package com.unacademy.stepdefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.unacademy.library.Utility;
import com.unacademy.pom.ChooseYourGoalPageFactory;
import com.unacademy.pom.GoalHomePagePageFactory;
import com.unacademy.pom.StartLearningPageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StartLearningClass6To12 {
	public WebDriver driver;
	public ChooseYourGoalPageFactory goalpage;
	public GoalHomePagePageFactory homepage;
	public StartLearningPageFactory startlearningpage;
	public Utility util;

	public  String goal;
	public String batch;
	public String course;
	public String best_course;
	
	@Before
	public void Inintialization() throws IOException
	{
		util= new Utility();
		System.setProperty(util.getWebDriver(),util.getExecutor());
		driver=new ChromeDriver();
		goalpage= new ChooseYourGoalPageFactory(driver);
		homepage = new GoalHomePagePageFactory(driver);
		startlearningpage = new StartLearningPageFactory(driver);
	}
	
	@After
	public void browserDeLaunch()
	{
		homepage.quit();
	}
	
	@Given("User is on Unacdemy page")
	public void user_is_on_Unacdemy_page() throws InterruptedException, IOException 
	{
		driver.get(util.getBaseUrl());
		driver.manage().window().maximize();
		util.waitMetod(2);
		System.out.println(driver.getTitle());
	}


	@When("user clicks on Prepare for Class6to12 Start Learning button")
	public void user_clicks_on_Prepare_for_Class6to12_Start_Learning_button() throws InterruptedException
	{
		startlearningpage.clickStartLearnClass6to12Cmd();
	}

	@Then("user is on Choose your goal page where the list of goals of Class6to12 are displayed")
	public void user_is_on_Choose_your_goal_page_where_the_list_of_goals_of_Class6to12_are_displayed() throws IOException, InterruptedException 
	{
		Assert.assertEquals(goalpage.noOfGoals(),util.noOfGoalsInClass());  
	}

	@When("user clicks on a {string} to be the goal")
	public void user_clicks_on_a_to_be_the_goal(String goal) throws InterruptedException 
	{
		this.goal=goal;
		goalpage.clickOnGoal(goal);
	}

	@Then("user is on Goal Home page")
	public void user_is_on_Goal_Home_page() throws InterruptedException, IOException 
	{
		Assert.assertEquals(homepage.getTitle().contains(goal),true);
	}

	@When("user scrolls down on home to view different sections are present")
	public void user_scrolls_down_on_home_to_view_different_sections_are_present() throws InterruptedException 
	{
		homepage.scrollToLiveClassHeader();
		homepage.scrollToPrepareWithTopEducatorHeader();
		homepage.scrollToBatchesForSyllabusCompletionHeader();
		homepage.scrollToCoursesStartingSoonHeader();
		homepage.scrollToBestOfAllTimeHeader();
		homepage.scrollToComprehensiveSyllabusHeader();
		homepage.scrollToTrackYourPreparationHeader();
		homepage.scrollToAppHeader();
	}

	@Then("user can see sections like Free Live classes Section,Prepare With Top Educators and so on")
	public void user_can_see_sections_like_Free_Live_classes_Section_Prepare_With_Top_Educators_and_so_on() throws InterruptedException
	{
		Assert.assertEquals(homepage.isLiveClassHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isPrepareWithTopEducatorHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isBatchesForSyllabusCompletionHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isCoursesStartingSoonHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isBestOfAllTimeHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isComprehensiveSyllabusHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isTrackYourPreparationHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isAppHeaderDisplayed(),true);
	}

	@When("user scrolls down to find Batches for syllabus completion section")
	public void user_scrolls_down_to_find_Batches_for_syllabus_completion_section() throws InterruptedException 
	{
		homepage.scrollToBatchesForSyllabusCompletionHeader();
	}

	@Then("user is on Batches for syllabus completion section")
	public void user_is_on_Batches_for_syllabus_completion_section() throws InterruptedException 
	{
		Assert.assertEquals(homepage.isBatchesForSyllabusCompletionHeaderDisplayed(),true);
	}

	@When("user clicks on {string} to explore")
	public void user_clicks_on_to_explore(String batch) throws InterruptedException 
	{
		this.batch=batch;
		homepage.clickOnBatch(batch);
	}

	@Then("user is on batch page")
	public void user_is_on_batch_page() throws InterruptedException, IOException 
	{
		Assert.assertEquals(homepage.getTitle().contains(batch),true);
	}

	@When("user navigates to goal Home page")
	public void user_navigates_to_goal_Home_page() throws InterruptedException 
	{
		homepage.navigation();
	}

	@When("user scrolls down to find Courses starting soon section")
	public void user_scrolls_down_to_find_Courses_starting_soon_section() throws InterruptedException 
	{
		homepage.scrollToCoursesStartingSoonHeader();
	}

	@Then("user is on Courses starting soon section")
	public void user_is_on_Courses_starting_soon_section() throws InterruptedException
	{
		Assert.assertEquals(homepage.isCoursesStartingSoonHeaderDisplayed(),true);
	}

	@When("user clicks on {string} to explore course")
	public void user_clicks_on_to_explore_course(String course) throws InterruptedException 
	{
		this.course=course;
		homepage.clickOnCourse(course);
	}

	@Then("user is on course page")
	public void user_is_on_course_page() throws InterruptedException, IOException 
	{
		Assert.assertEquals(homepage.getTitle().contains(course),true);
		
	}


	@When("user scrolls down to find Best of all time section")
	public void user_scrolls_down_to_find_Best_of_all_time_section() throws InterruptedException 
	{
		homepage.scrollToBestOfAllTimeHeader();
	}

	@Then("user is on Best of all time section")
	public void user_is_on_Best_of_all_time_section() throws InterruptedException 
	{
		Assert.assertEquals(homepage.isBestOfAllTimeHeaderDisplayed(),true);
	}

	@When("user clicks on {string} to explore best course")
	public void user_clicks_on_to_explore_best_course(String best_course) throws InterruptedException 
	{
		this.best_course=best_course;
		homepage.clickOnBestcourse(best_course);
	}

	@Then("user is on respective best course page")
	public void user_is_on_respective_best_course_page() throws InterruptedException, IOException 
	{
		Assert.assertEquals(homepage.getTitle().contains(best_course),true);
	}
	@When("user goes back to goal Home page")
	public void user_goes_back_to_goal_Home_page() throws InterruptedException 
	{
	   homepage.clickOnHomeNavigationHeader(goal);   
	}

}
