    Feature: Ebay Home Page Scenario
      @P1
   Scenario: Advanced Search Link

    Given I am on Ebay Home page
    When I click on Advanced Link
    Then I navigate to Advanced Search page

      @P2
     Scenario: Search items count
       Given    I am on Ebay Home page
       When    I search for iphone 11
       Then    I validate at least 1000 search present

        # Hello world