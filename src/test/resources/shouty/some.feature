@notimportant
Feature: Skeleton

  @smoke
  Scenario: Listener died
    Given Lucy is standing 25 metre from Sean
    When Sean shouts "Free bagels"
    Then Lucy should hear Sean's message
    Then Lucy pay 10 cent