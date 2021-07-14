Feature: Exploring Start Learning for Competative Exams

  Scenario Outline: Choosing a goal in Class 6 to 12 header
    Given User is on Unacdemy Page
    When user clicks on Prepare for Class6to12 Start Learning button
    Then user is on Choose your goal page where the list of goals of Class6to12 are displayed
    When user clicks on a "<goal>" to be the goal
    Then user is on Goal Home page
    When user scrolls down on home to view different sections are present
    Then user can see sections like Free Live classes Section,Prepare With Top Educators and so on
    When user scrolls down to find Batches for syllabus completion section
    Then user is on Batches for syllabus completion section
    When user clicks on "<batch>" to explore
    Then user is on batch page
    When user navigates to goal Home page
    And user scrolls down to find Courses starting soon section
    Then user is on Courses starting soon section
    When user clicks on "<course>" to explore course
    Then user is on course page
    When user goes back to goal Home page
    And user scrolls down to find Best of all time section
    Then user is on Best of all time section
    When user clicks on "<best_course>" to explore best course
    Then user is on respective best course page

    Examples: 
      | goal          | batch                                                    | course                                        | best_course                |
      | CBSE Class 9  | Challengers batch - Maths, Science, English, Hindi & SST | Complete Course on Mathematics - NCERT        | Complete Course on English |
      | CBSE Class 12 | Lakshya Batch for Term 1 - Science                       | Comprehensive Course on Relations & Functions | Detailed Course on English |
