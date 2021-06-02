Feature:As a User I want to be able to enter valid number of messages

  @message @messageValid
  Scenario:Enter valid numbers of messages
      Given User enter valid numbers of messages
      Then User see pass number result

  @message @messageEmpty
  Scenario:Left messages empty
      Given User leave empty numbers of messages
      Then User see error empty result

  @message @messageLetters
  Scenario:Enter letters in messages field
      Given User enter letters in  messages field
      Then User see error letters result

#  @message
#  Scenario:Enter special chars in messages field
#    Given User enter special chars in messages field
#    Then User see error special chars result