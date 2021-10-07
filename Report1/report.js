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
  "status": "passed"
});
formatter.step({
  "name": "I click on Advanced Link",
  "keyword": "When "
});
formatter.match({
  "location": "steps.EbayHome_Steps.i_click_on_Advanced_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to Advanced Search page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.EbayHome_Steps.i_navigate_to_Advanced_Search_page()"
});
formatter.result({
  "status": "passed"
});
});