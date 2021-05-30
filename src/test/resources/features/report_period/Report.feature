Feature:As a User I want to be able to enter valid number of report_period

  @report
  Scenario:Enter valid numbers of report_period
    Given User enter valid numbers of report_period
    Then User see pass number result

  @message
  Scenario:Enter special chars in report_period field
    Given User enter special chars in report_period field
    Then User see error special chars result