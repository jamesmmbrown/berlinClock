Feature: Converter

  Scenario Outline: As a clock user I want to be able to see single minutes so that I can accurately tell the time down to the minute
    Given I have started the converter
    And I enter "<time>"
    Then "<singleMinuteRow>" is returned for the single minutes row
    Examples:
      | time     | singleMinuteRow |
      | 00:00:00 | OOOO            |
      | 23:59:59 | YYYY            |
      | 12:32:00 | YYOO            |
      | 12:34:00 | YYYY            |

  Scenario Outline: As a clock user I want to be able to see five minutes so that I can tell higher minute amounts more easily at a glance
    Given I have started the converter
    And I enter "<time>"
    Then "<fiveMinuteRow>" is returned for the five minutes row
    Examples:
      | time     | fiveMinuteRow |
      | 00:00:00 | OOOOOOOOOOO   |
      | 23:59:59 | YYRYYRYYRYY   |
      | 12:04:59 | OOOOOOOOOOO   |
      | 12:23:00 | YYRYOOOOOOO   |
      | 12:35:00 | YYRYYRYOOOO   |