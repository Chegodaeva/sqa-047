Feature: Shout

  Background: Create person
    * Create Lucy

  Scenario: Listener within range
    Given Lucy is 350m from Sean
    When Sean shouts "free bagels at Sean's"
    Then Lucy should hear Sean's message

  Scenario: Listener without range
    Given Lucy is 800m from Sean
    When Sean shouts "free bagels at Sean's"
    Then Lucy should hear Sean's message