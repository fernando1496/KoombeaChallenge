Feature: Automated Dimension Tests

  @testOne
  Scenario Outline: User goes to Dimensions, then select the length option and calculates a value using different inputs
  META-DATA: {"dataProvider":"dimensionsValues", "dataProviderClass":"Data.DataProviders.class"}
    Given user selected "<scenario>"
    When he select an option on first spinner
    And selects an option on the second spinner
    Then the correct result must be displayed on the screen.

    Examples:
      | scenario | originalUnit | conversionUnit    | quantityToConvert | result     |
      | Length   | Foot         | Centimeter        | 4                 | 121.92     |
      | Length   | Inch         | Centimeter        | 56.23             | 142.8242   |
      | Area     | Hectare      | Square meter      | 5                 | 50 000     |
      | Area     | Decare       | Square centimeter | 2                 | 20 000 000 |
      | Volume   | Quart        | Bushel            | 2                 | 0.0625     |
      | Volume   | Pint         | Peck              | 23                | 1.4375     |
      | Volume   | Pint         | Cup               | 13                | 000000     |