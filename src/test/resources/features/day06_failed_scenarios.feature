@failed_scenario
Feature: hooks_test

  #Bu scenario ları bilerek fail ettirdik
  Background: googlea_git
    Given kullanici google a gider
  Scenario: TC01_google_iphone_arama
    When kullanici "iphone" icin arama yapar
    Then  sonuclarda "samsung" oldugunu dogrular
    Then close the application

  Scenario: TC02_google_tesla_arama
    When kullanici "tesla" icin arama yapar
    Then  sonuclarda "toros" oldugunu dogrular
    Then ekran goruntusu al
    Then close the application