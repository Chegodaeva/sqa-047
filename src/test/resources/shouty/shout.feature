@important
Feature: Shout

  Background: Example backgroung
    Given I meet Lucy

  @positive @negative
  Scenario: Listener within range
    Given Lucy is standing 15 metre from Sean
    When Sean shouts "Free bagels"
    Then Lucy should hear Sean's message
    Then Lucy pay 3 cent

  @negative
  Scenario: Listener without range
    Given Lucy is standing 100 metre from Sean
    When Sean shouts "Free bagels"
    Then Lucy should hear Sean's message
    Then Lucy pay 1000 cent
