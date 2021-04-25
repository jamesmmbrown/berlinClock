Feature: Converter

  Scenario Outline: As a clock user I want to be able to see single minutes so that I can accurately tell the time down to the minute
    Given I have started the converter
    And I enter "<time>"
    Then "<row>" is returned for the single minutes row
    Examples:
      | time     | row  |
      | 00:00:00 | OOOO |
      | 23:59:59 | YYYY |
      | 12:32:00 | YYOO |
      | 12:34:00 | YYYY |