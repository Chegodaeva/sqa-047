Feature: Shout

  Scenario: Listener within range
    Given Lucy is standing 15 metre from Sean
    When Sean shouts "Free bagels"
    Then Lucy should hear Sean's message
    Then Lucy pay 3 cent
