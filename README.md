# Truecaller_AndroidApp_Login

# Objective:
Developed a sample framework that supports to develop automation test scripts for Truecaller Android App. Currently it has method to login/sign-up in the application.

## Libraries used:
  1. Java
  2. Selenium WebDriver
  3. TestNG
  4. Extentreports
  5. Maven
  6. Appium
  
## Steps to start:
  1. Clone / Download the project into your local.
  2. Open the Command prompt and navigate to project location.
  Execute the following Maven command's
    a. mvn clean :- To clean the maven repo.
    b. mvn install :- To install the maven requirements.
    c. mvn test :- To execute the test scenarios.

## Approach:
  1. Implemented modular driven approach.
  2. Used page object model design pattern.
  3. Maintained low level and high level logs.
  4. Implemented FileUtil, RandomUtil, Screenshot libraries.
  5. Test data maintained in properties files.
  6. Browser and environment are parameterized from xml suits.
  7. Maintained groups for all test scripts.
  8. Used TestNG library for assertions & reporting.
  9. Added screenshots with emailable-report.
  10. Added Extentreports with screenshots.
  11. Used Appium and real device to automate scripts.
