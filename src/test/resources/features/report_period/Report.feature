Feature:As a User I want to be able to enter valid number of report_period

  @report @reportWS
  Scenario:Enter white space in report_period field
    Given User enter white space in report_period field
    Then User see error white space report_period result

  @report @reportSC
  Scenario:Enter special chars in report_period field
    Given User enter special chars in report_period field
    Then User see error special chars result