@APendtoend
Feature: Automation Practice end to end Test automation scenario
this feature file includes login,search the product,adding to cart		
@testcase 
Scenario: Verify user validate the automation practise home page
Given User hit the Automation Practice website
Then User verify the site logo
And User verifies the page title

@testcase1 
Scenario: Verify user login the application with valid credentials 
When User click on SignIn button in header
And User enter the email id 'poorna1@gmail.com' in the login page
And User enter the password 'abc123' in the login page 
And User click on login button in the login page
Then User verifies the username 'poorna kala' present in the header 

@testcase2 
Scenario: Verify user searching products with more steps
When User mouseover the Women option present in the product search page
And User click the Summer dresses appear in the category page
Then User verifies the SUMMER DRESSES displayed in the product page
And User select the dropdown button to sort the product
And User click on the selected product
Then User verfies whether the same product is displayed 

@testcase3 
Scenario: Verify user adding the product to cart
When User choose the Quantity and size present in the cart page
And User click on the add to cart button 
Then User Verfy the product add to cart successfully
And User click on the proceed to checkout button
Then verify the product summary page 


   




