Feature: Exploring Start Learning for Competative Exams

  Scenario Outline: Choosing a goal in  Competative Exams header and other features
    Given User is on Unacdemy web page
    When user clicks on Prepare for Competitive exams Start Learning button
    Then user is on Choose your goal page where the list of topics are displayed
    When user clicks on "<goal>" to be the goal
    Then user is on goal home page
    When user scrolls down on home to verify different sections are present
    Then user can see sections like What youll get Section,Free Live classes Section,Prepare With Top Educators and so on
    When user scrolls to find Prepare With Top Educators Section
    Then user is on Prepare With Top Educators Section
    When user clicks on profile of the educator as "<educator>"
    Then user is on the profile page
    When user navigates to goal home page
    And user scrolls to find  Comprehensive syllabus section on home page
    Then user is on the Comprehensive syllabus section
    When user clicks on the "<topic>" to see syllabus
    Then user is navigated to the syllabus page
    When user navigates to goal home page
    And user scrolls to find Get the Learning App Section
    Then user can see icons to download the app from App Store and Google Play
    When user clicks on "<app>" icon on which application is needful
    Then user is on Application Installation Page

    Examples: 
      | goal       | educator       | topic       | app        |
      | IIT JEE    | Brijesh Jindal | Mathematics | Play Store |
      #| Bank Exams | Nimisha Bansal | Reasoning   | appStore   |