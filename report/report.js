$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/EbayHome.feature");
formatter.feature({
  "name": "Ebay Home Page Scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search items count",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@P2"
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
  "name": "I search for iphone 11",
  "keyword": "When "
});
formatter.match({
  "location": "steps.EbayHome_Steps.i_search_for_iphone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate at least 1000 search present",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.EbayHome_Steps.i_validate_at_least_search_present()"
});
formatter.result({
  "status": "passed"
});
});