@parameter
Feature: search_feature

  Background: Google_sayfasina_git
    Given kullanici google a gider

  Scenario: TC01_google_iphone_search
    When  kullanici "iphone" için arama yapar
    Then  sonuclarda "iphone" oldugunu dogrular
    And   close the application

  Scenario: TC02_google_airfry_search
    When  kullanici "airfry" için arama yapar
    Then  sonuclarda "airfry" oldugunu dogrular
    And   close the application
