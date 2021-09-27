$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/EbayHome.feature");
formatter.feature({
  "name": "Ebay Home Page Scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Advanced Search Link",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@P1"
    }
  ]
});
formatter.step({
  "name": "I am on Ebay Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.EbayHome_Steps.i_am_on_Ebay_Home_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat steps.EbayHome_Steps.i_am_on_Ebay_Home_page(EbayHome_Steps.java:20)\r\n\tat ✽.I am on Ebay Home page(file:///C:/automationfolder/features/EbayHome.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I click on Advanced Link",
  "keyword": "When "
});
formatter.match({
  "location": "steps.EbayHome_Steps.i_click_on_Advanced_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I navigate to Advanced Search page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.EbayHome_Steps.i_navigate_to_Advanced_Search_page()"
});
formatter.result({
  "status": "skipped"
});
});