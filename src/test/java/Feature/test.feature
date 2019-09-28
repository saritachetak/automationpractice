Feature: accessing different websites
  Scenario: accesing google website
    Given I am a chrome user
    When I access google.com
    Then I see google search page