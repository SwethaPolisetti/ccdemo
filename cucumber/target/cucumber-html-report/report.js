$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/Raghav/eclipse-workspace/cucumber/features/tags.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@entirefeature"
    }
  ]
});
formatter.scenario({
  "name": "search products in demowebshop",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@entirefeature"
    },
    {
      "name": "@searchprdcts"
    }
  ]
});
formatter.step({
  "name": "Amy is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "tags.amy_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Amy searches for a product",
  "keyword": "When "
});
formatter.match({
  "location": "tags.amy_searches_for_a_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she shall see list of products displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "tags.she_shall_see_list_of_products_displayed()"
});
formatter.result({
  "status": "passed"
});
});