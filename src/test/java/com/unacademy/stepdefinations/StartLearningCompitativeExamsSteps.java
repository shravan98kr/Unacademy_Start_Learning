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

public class StartLearningCompitativeExamsSteps {
	public WebDriver driver;
	public ChooseYourGoalPageFactory goalpage;
	public GoalHomePagePageFactory homepage;
	public StartLearningPageFactory startlearningpage;
	public Utility util;

	public  String goal;
	public String educator;
	public String syllabus;
	public String app;


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
	@Given("User is on Unacdemy web page")
	public void user_is_on_Unacdemy_web_page() throws IOException, InterruptedException 
	{
		driver.get(util.getBaseUrl());
		driver.manage().window().maximize();
		
		util.waitMetod(2);
		System.out.println(driver.getTitle());
	}

	@When("user clicks on Prepare for Competitive exams Start Learning button")
	public void user_clicks_on_Prepare_for_Competitive_exams_Start_Learning_button() throws InterruptedException 
	{
		startlearningpage.clickStartLearnComptitiveCmd();
	}

	@Then("user is on Choose your goal page where the list of topics are displayed")
	public void user_is_on_Choose_your_goal_page_where_the_list_of_topics_are_displayed() throws IOException, InterruptedException 
	{
		Assert.assertEquals(goalpage.noOfGoals(),util.noOfGoalsInExams());  
	}

	@When("user clicks on {string} to be the goal")
	public void user_clicks_on_to_be_the_goal(String goal) throws InterruptedException
	{ 
		this.goal=goal;
		goalpage.clickOnGoal(goal);
	}

	@Then("user is on goal home page")
	public void user_is_on_goal_home_page() throws InterruptedException, IOException
	{
		util.waitMetod(2);
		System.out.println(driver.getTitle());
		Assert.assertEquals(homepage.getTitle().contains(goal.substring(0,5)),true);
	}

	@When("user scrolls down on home to verify different sections are present")
	public void user_scrolls_down_on_home_to_verify_different_sections_are_present() throws InterruptedException
	{
		homepage.scrollToLiveClassHeader();
		homepage.scrollToPrepareWithTopEducatorHeader();
		homepage.scrollToBatchesForSyllabusCompletionHeader();
		homepage.scrollToCoursesStartingSoonHeader();
		homepage.scrollToBestOfAllTimeHeader();
		homepage.scrollToComprehensiveSyllabusHeader();
		homepage.scrollToTrackYourPreparationHeader();
		homepage.scrollToApplicationHeader();
	}

	@Then("user can see sections like What youll get Section,Free Live classes Section,Prepare With Top Educators and so on")
	public void user_can_see_sections_like_What_youll_get_Section_Free_Live_classes_Section_Prepare_With_Top_Educators_and_so_on() throws InterruptedException 
	{
		Assert.assertEquals(homepage.isLiveClassHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isPrepareWithTopEducatorHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isBatchesForSyllabusCompletionHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isCoursesStartingSoonHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isBestOfAllTimeHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isComprehensiveSyllabusHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isTrackYourPreparationHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isApplicationHeaderDisplayed(),true);
	}

	@When("user scrolls to find Prepare With Top Educators Section")
	public void user_scrolls_to_find_Prepare_With_Top_Educators_Section() throws InterruptedException 
	{
		homepage.scrollToPrepareWithTopEducatorHeader();
	}

	@Then("user is on Prepare With Top Educators Section")
	public void user_is_on_Prepare_With_Top_Educators_Section() throws InterruptedException 
	{
		Assert.assertEquals(homepage.isPrepareWithTopEducatorHeaderDisplayed(),true);
	}

	@When("user clicks on profile of the educator as {string}")
	public void user_clicks_on_profile_of_the_educator_as(String educator) throws InterruptedException 
	{
		this.educator=educator;
		homepage.clickOnProfile(educator);
	}

	@Then("user is on the profile page")
	public void user_is_on_the_profile_page() throws InterruptedException, IOException 
	{
		Assert.assertEquals(homepage.getTitle().contains(educator),true);
	}

	@When("user navigates to goal home page")
	public void user_navigates_to_goal_home_page() throws InterruptedException 
	{
		homepage.navigation();
	}

	@When("user scrolls to find  Comprehensive syllabus section on home page")
	public void user_scrolls_to_find_Comprehensive_syllabus_section_on_home_page() throws InterruptedException 
	{
		homepage.scrollToComprehensiveSyllabusHeader();
	}

	@Then("user is on the Comprehensive syllabus section")
	public void user_is_on_the_Comprehensive_syllabus_section() throws InterruptedException 
	{
		Assert.assertEquals(homepage.isComprehensiveSyllabusHeaderDisplayed(),true);
	}

	@When("user clicks on the {string} to see syllabus")
	public void user_clicks_on_the_to_see_syllabus(String syllabus) throws InterruptedException
	{
		this.syllabus=syllabus;
		homepage.clickOnSubject(syllabus);
	}

	@Then("user is navigated to the syllabus page")
	public void user_is_navigated_to_the_syllabus_page() throws InterruptedException, IOException 
	{
		Assert.assertEquals(homepage.getTitle().contains(syllabus),true);
	}

	@When("user scrolls to find Get the Learning App Section")
	public void user_scrolls_to_find_Get_the_Learning_App_Section() throws InterruptedException 
	{
		homepage.scrollToApplicationHeader();
	}

	@Then("user can see icons to download the app from App Store and Google Play")
	public void user_can_see_icons_to_download_the_app_from_App_Store_and_Google_Play() throws InterruptedException 
	{
		Assert.assertEquals(homepage.isApplicationHeaderDisplayed(),true);
	}

	@When("user clicks on {string} icon on which application is needful")
	public void user_clicks_on_icon_on_which_application_is_needful(String app) throws InterruptedException 
	{
		this.app=app;
		homepage.clickOnAppIcon(app);
	}

	@Then("user is on Application Installation Page")
	public void user_is_on_Application_Installation_Page() throws InterruptedException, IOException 
	{
		Assert.assertEquals(homepage.getTitle().contains(goal.substring(0,5)),true);
	}

	@After
	public void browserDeLaunch()
	{
		homepage.quit();
	}
}
