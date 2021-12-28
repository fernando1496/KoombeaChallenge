$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DimensionFeatureTests.feature");
formatter.feature({
  "line": 1,
  "name": "Automated Dimension Tests",
  "description": "",
  "id": "automated-dimension-tests",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User goes to Dimensions, then select the length option and calculates a value using different inputs",
  "description": "META-DATA: {\"dataProvider\":\"dimensionsValues\", \"dataProviderClass\":\"Data.DataProviders.class\"}",
  "id": "automated-dimension-tests;user-goes-to-dimensions,-then-select-the-length-option-and-calculates-a-value-using-different-inputs",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@testOne"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user selected \"\u003cscenario\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he select an option on first spinner",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "selects an option on the second spinner",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the correct result must be displayed on the screen.",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "automated-dimension-tests;user-goes-to-dimensions,-then-select-the-length-option-and-calculates-a-value-using-different-inputs;",
  "rows": [
    {
      "cells": [
        "scenario",
        "originalUnit",
        "conversionUnit",
        "quantityToConvert",
        "result"
      ],
      "line": 12,
      "id": "automated-dimension-tests;user-goes-to-dimensions,-then-select-the-length-option-and-calculates-a-value-using-different-inputs;;1"
    },
    {
      "cells": [
        "Length",
        "Foot",
        "Centimeter",
        "4",
        "121.92"
      ],
      "line": 13,
      "id": "automated-dimension-tests;user-goes-to-dimensions,-then-select-the-length-option-and-calculates-a-value-using-different-inputs;;2"
    },
    {
      "cells": [
        "Length",
        "Inch",
        "Centimeter",
        "56.23",
        "142.8242"
      ],
      "line": 14,
      "id": "automated-dimension-tests;user-goes-to-dimensions,-then-select-the-length-option-and-calculates-a-value-using-different-inputs;;3"
    },
    {
      "cells": [
        "Area",
        "Hectare",
        "Square meter",
        "5",
        "50 000"
      ],
      "line": 15,
      "id": "automated-dimension-tests;user-goes-to-dimensions,-then-select-the-length-option-and-calculates-a-value-using-different-inputs;;4"
    },
    {
      "cells": [
        "Area",
        "Decare",
        "Square centimeter",
        "2",
        "20 000 000"
      ],
      "line": 16,
      "id": "automated-dimension-tests;user-goes-to-dimensions,-then-select-the-length-option-and-calculates-a-value-using-different-inputs;;5"
    },
    {
      "cells": [
        "Volume",
        "Quart",
        "Bushel",
        "2",
        "0.0625"
      ],
      "line": 17,
      "id": "automated-dimension-tests;user-goes-to-dimensions,-then-select-the-length-option-and-calculates-a-value-using-different-inputs;;6"
    },
    {
      "cells": [
        "Volume",
        "Pint",
        "Peck",
        "23",
        "1.4375"
      ],
      "line": 18,
      "id": "automated-dimension-tests;user-goes-to-dimensions,-then-select-the-length-option-and-calculates-a-value-using-different-inputs;;7"
    },
    {
      "cells": [
        "Volume",
        "Pint",
        "Cup",
        "13",
        "000000"
      ],
      "line": 19,
      "id": "automated-dimension-tests;user-goes-to-dimensions,-then-select-the-length-option-and-calculates-a-value-using-different-inputs;;8"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5821927583,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User goes to Dimensions, then select the length option and calculates a value using different inputs",
  "description": "META-DATA: {\"dataProvider\":\"dimensionsValues\", \"dataProviderClass\":\"Data.DataProviders.class\"}",
  "id": "automated-dimension-tests;user-goes-to-dimensions,-then-select-the-length-option-and-calculates-a-value-using-different-inputs;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@testOne"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user selected \"Length\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he select an option on first spinner",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "selects an option on the second spinner",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the correct result must be displayed on the screen.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Length",
      "offset": 15
    }
  ],
  "location": "DimensionStepDefinitions.user_selected_length(String)"
});
formatter.result({
  "duration": 4063840000,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.he_select_an_option_on_first_spinner()"
});
formatter.result({
  "duration": 37667,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.selects_an_option_on_the_second_spinner()"
});
formatter.result({
  "duration": 22834,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.the_correct_result_must_be_displayed_on_the_screen()"
});
formatter.result({
  "duration": 17958,
  "status": "passed"
});
formatter.before({
  "duration": 4653207916,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User goes to Dimensions, then select the length option and calculates a value using different inputs",
  "description": "META-DATA: {\"dataProvider\":\"dimensionsValues\", \"dataProviderClass\":\"Data.DataProviders.class\"}",
  "id": "automated-dimension-tests;user-goes-to-dimensions,-then-select-the-length-option-and-calculates-a-value-using-different-inputs;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@testOne"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user selected \"Length\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he select an option on first spinner",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "selects an option on the second spinner",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the correct result must be displayed on the screen.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Length",
      "offset": 15
    }
  ],
  "location": "DimensionStepDefinitions.user_selected_length(String)"
});
formatter.result({
  "duration": 3512793167,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.he_select_an_option_on_first_spinner()"
});
formatter.result({
  "duration": 46875,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.selects_an_option_on_the_second_spinner()"
});
formatter.result({
  "duration": 40209,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.the_correct_result_must_be_displayed_on_the_screen()"
});
formatter.result({
  "duration": 20834,
  "status": "passed"
});
formatter.before({
  "duration": 4730611500,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User goes to Dimensions, then select the length option and calculates a value using different inputs",
  "description": "META-DATA: {\"dataProvider\":\"dimensionsValues\", \"dataProviderClass\":\"Data.DataProviders.class\"}",
  "id": "automated-dimension-tests;user-goes-to-dimensions,-then-select-the-length-option-and-calculates-a-value-using-different-inputs;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@testOne"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user selected \"Area\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he select an option on first spinner",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "selects an option on the second spinner",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the correct result must be displayed on the screen.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Area",
      "offset": 15
    }
  ],
  "location": "DimensionStepDefinitions.user_selected_length(String)"
});
formatter.result({
  "duration": 3856466333,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.he_select_an_option_on_first_spinner()"
});
formatter.result({
  "duration": 67750,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.selects_an_option_on_the_second_spinner()"
});
formatter.result({
  "duration": 22750,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.the_correct_result_must_be_displayed_on_the_screen()"
});
formatter.result({
  "duration": 16750,
  "status": "passed"
});
formatter.before({
  "duration": 4657421250,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User goes to Dimensions, then select the length option and calculates a value using different inputs",
  "description": "META-DATA: {\"dataProvider\":\"dimensionsValues\", \"dataProviderClass\":\"Data.DataProviders.class\"}",
  "id": "automated-dimension-tests;user-goes-to-dimensions,-then-select-the-length-option-and-calculates-a-value-using-different-inputs;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@testOne"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user selected \"Area\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he select an option on first spinner",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "selects an option on the second spinner",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the correct result must be displayed on the screen.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Area",
      "offset": 15
    }
  ],
  "location": "DimensionStepDefinitions.user_selected_length(String)"
});
formatter.result({
  "duration": 3901264292,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.he_select_an_option_on_first_spinner()"
});
formatter.result({
  "duration": 37750,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.selects_an_option_on_the_second_spinner()"
});
formatter.result({
  "duration": 32833,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.the_correct_result_must_be_displayed_on_the_screen()"
});
formatter.result({
  "duration": 151167,
  "status": "passed"
});
formatter.before({
  "duration": 4618422000,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User goes to Dimensions, then select the length option and calculates a value using different inputs",
  "description": "META-DATA: {\"dataProvider\":\"dimensionsValues\", \"dataProviderClass\":\"Data.DataProviders.class\"}",
  "id": "automated-dimension-tests;user-goes-to-dimensions,-then-select-the-length-option-and-calculates-a-value-using-different-inputs;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@testOne"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user selected \"Volume\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he select an option on first spinner",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "selects an option on the second spinner",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the correct result must be displayed on the screen.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Volume",
      "offset": 15
    }
  ],
  "location": "DimensionStepDefinitions.user_selected_length(String)"
});
formatter.result({
  "duration": 3490980959,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.he_select_an_option_on_first_spinner()"
});
formatter.result({
  "duration": 50708,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.selects_an_option_on_the_second_spinner()"
});
formatter.result({
  "duration": 17167,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.the_correct_result_must_be_displayed_on_the_screen()"
});
formatter.result({
  "duration": 28583,
  "status": "passed"
});
formatter.before({
  "duration": 4667355875,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User goes to Dimensions, then select the length option and calculates a value using different inputs",
  "description": "META-DATA: {\"dataProvider\":\"dimensionsValues\", \"dataProviderClass\":\"Data.DataProviders.class\"}",
  "id": "automated-dimension-tests;user-goes-to-dimensions,-then-select-the-length-option-and-calculates-a-value-using-different-inputs;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@testOne"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user selected \"Volume\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he select an option on first spinner",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "selects an option on the second spinner",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the correct result must be displayed on the screen.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Volume",
      "offset": 15
    }
  ],
  "location": "DimensionStepDefinitions.user_selected_length(String)"
});
formatter.result({
  "duration": 3832370708,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.he_select_an_option_on_first_spinner()"
});
formatter.result({
  "duration": 54125,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.selects_an_option_on_the_second_spinner()"
});
formatter.result({
  "duration": 17375,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.the_correct_result_must_be_displayed_on_the_screen()"
});
formatter.result({
  "duration": 31834,
  "status": "passed"
});
formatter.before({
  "duration": 4746185125,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "User goes to Dimensions, then select the length option and calculates a value using different inputs",
  "description": "META-DATA: {\"dataProvider\":\"dimensionsValues\", \"dataProviderClass\":\"Data.DataProviders.class\"}",
  "id": "automated-dimension-tests;user-goes-to-dimensions,-then-select-the-length-option-and-calculates-a-value-using-different-inputs;;8",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@testOne"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user selected \"Volume\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he select an option on first spinner",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "selects an option on the second spinner",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the correct result must be displayed on the screen.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Volume",
      "offset": 15
    }
  ],
  "location": "DimensionStepDefinitions.user_selected_length(String)"
});
formatter.result({
  "duration": 3811490042,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.he_select_an_option_on_first_spinner()"
});
formatter.result({
  "duration": 188375,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.selects_an_option_on_the_second_spinner()"
});
formatter.result({
  "duration": 15709,
  "status": "passed"
});
formatter.match({
  "location": "DimensionStepDefinitions.the_correct_result_must_be_displayed_on_the_screen()"
});
formatter.result({
  "duration": 152917,
  "status": "passed"
});
});