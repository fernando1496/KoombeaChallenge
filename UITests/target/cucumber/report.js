$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/DimensionFeatureTests.feature");
formatter.feature({
  "line": 1,
  "name": "Automated Dimension Tests",
  "description": "",
  "id": "automated-dimension-tests",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User goes to Dimensions, then select the length option and calculates a value using different inputs",
  "description": "",
  "id": "automated-dimension-tests;user-goes-to-dimensions,-then-select-the-length-option-and-calculates-a-value-using-different-inputs",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@testOne"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user selected \"Length\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "he select an option on first spinner",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "selects an option on the second spinner",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the correct result must be displayed on the screen.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});