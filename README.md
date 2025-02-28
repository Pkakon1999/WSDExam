# WSDExam

This repository is created for preparation of WSD exam.

Technologies Used

Programming Language: Java

Testing Framework: TestNG

Automation Tool: Selenium WebDriver

Build Tool: Maven


--Run the Tests--

Using TestNG (from IDE)

Open the project in IntelliJ IDEA or Eclipse.

Right-click on cartTest.java inside TestCases/.

Select Run 'cartTest'.


---Reason behind the approach---

1. Use of Explicit Waits

Instead of Thread.sleep(), WebDriverWait ensures synchronization between page loading and element interactions, reducing test flakiness.

2. Page Object Model (POM) Approach

In a full-scale framework, test logic should be separate from UI interaction logic. This structure improves maintainability and reusability.

3. JavaScript Execution for Scrolling

Some elements might not be visible immediately; JavaScript scrolling ensures they come into view before interaction.

4. Assertions for Test Validation

Product existence: Ensures the item is successfully added.

Quantity check: Verifies if the correct quantity is added.

Price validation: Confirms the price remains consistent from the product page to the cart.



THANK YOU!