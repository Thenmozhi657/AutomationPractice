$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AutomationPgrm.feature");
formatter.feature({
  "line": 2,
  "name": "Automation Practice end to end Test automation scenario",
  "description": "this feature file includes login,search the product,adding to cart",
  "id": "automation-practice-end-to-end-test-automation-scenario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@APendtoend"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Verify user validate the automation practise home page",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;verify-user-validate-the-automation-practise-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@testcase"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User hit the Automation Practice website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User verify the site logo",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User verifies the page title",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_hit_the_Automation_Practice_website()"
});
formatter.result({
  "duration": 9389319605,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verify_the_site_logo()"
});
formatter.result({
  "duration": 282720637,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_the_page_title()"
});
formatter.result({
  "duration": 10819282,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify user login the application with valid credentials",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;verify-user-login-the-application-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@testcase1"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User click on SignIn button in header",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User enter the email id \u0027poorna1@gmail.com\u0027 in the login page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enter the password \u0027abc123\u0027 in the login page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User click on login button in the login page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User verifies the username \u0027poorna kala\u0027 present in the header",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_on_SignIn_button_in_header()"
});
formatter.result({
  "duration": 5555906281,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "poorna1@gmail.com",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_enter_the_email_id_in_the_login_page(String)"
});
formatter.result({
  "duration": 947088237,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_enter_the_password_in_the_login_page(String)"
});
formatter.result({
  "duration": 411391336,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button_in_the_login_page()"
});
formatter.result({
  "duration": 2368262526,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_the_username_poorna_kala_present_in_the_header()"
});
formatter.result({
  "duration": 100781,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Verify user searching products with more steps",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;verify-user-searching-products-with-more-steps",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@testcase2"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User mouseover the Women option present in the product search page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User click the Summer dresses appear in the category page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User verifies the SUMMER DRESSES displayed in the product page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User select the dropdown button to sort the product",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User click on the selected product",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User verfies whether the same product is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_mouseover_the_Women_option_present_in_the_product_search_page()"
});
formatter.result({
  "duration": 371472676,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_Summer_dresses_appear_in_the_category_page()"
});
formatter.result({
  "duration": 7393119987,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_the_SUMMER_DRESSES_displayed_in_the_product_page()"
});
formatter.result({
  "duration": 90893,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_dropdown_button_to_sort_the_product()"
});
formatter.result({
  "duration": 90512,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_selected_product()"
});
formatter.result({
  "duration": 3415148364,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verfies_whether_the_same_product_is_displayed()"
});
formatter.result({
  "duration": 144516,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Verify user adding the product to cart",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;verify-user-adding-the-product-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@testcase3"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "User choose the Quantity and size present in the cart page",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User click on the add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User Verfy the product add to cart successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User click on the proceed to checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "verify the product summary page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_choose_the_Quantity_and_size_present_in_the_cart_page()"
});
formatter.result({
  "duration": 132346,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_add_to_cart_button()"
});
formatter.result({
  "duration": 60220189832,
  "error_message": "java.lang.Exception\r\n\tat com.cucumber.baseclass.baseClass.Click(baseClass.java:284)\r\n\tat com.cucumber.stepdefinition.StepDefinition.user_click_on_the_add_to_cart_button(StepDefinition.java:112)\r\n\tat ✽.And User click on the add to cart button(AutomationPgrm.feature:30)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.user_Verfy_the_product_add_to_cart_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_proceed_to_checkout_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.verify_the_product_summary_page()"
});
formatter.result({
  "status": "skipped"
});
});