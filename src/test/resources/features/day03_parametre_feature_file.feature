@parameter
Feature: search_feature

  Background: Google_sayfasina_git
    Given kullanici google a gider

    @smoke
  Scenario: TC01_google_iphone_search
    When  kullanici "iphone" icin arama yapar
    Then  sonuclarda "iphone" oldugunu dogrular
    And   close the application

  @smoke
  Scenario: TC02_google_airfry_search
    When  kullanici "airfry" icin arama yapar
    Then  sonuclarda "airfry" oldugunu dogrular
    And   close the application

  @regression
  Scenario: TC03_google_tea_search
    When  kullanici "tea" icin arama yapar
    Then  sonuclarda "tea" oldugunu dogrular
    And   close the application
