@scenario_outline_1
  Feature: search_feature_2


    Background: Google_sayfasina_git
      Given kullanici google a gider

      Scenario Outline: arama_testi

      When  kullanici "<product>" icin arama yapar
      Then  sonuclarda "<product>" oldugunu dogrular
      And   close the application

      Examples: data
        | product |
        | iphone  |
        | tesla   |
        | tv      |
        | flower  |
        | cat     |


