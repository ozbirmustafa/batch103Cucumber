@scenario_outline_1
  Feature: search_feature_2

    Background: Google_sayfasina_git
      Given kullanici google a gider

      Scenario Outline: arama_testi

      When  kullanici "<product>" için arama yapar
      Then  sonuclarda "<product>" oldugunu dogrular
      And   close the application

      Examples: data
        | product |
        | iphone  |
        | tesla   |
        | tv      |
        | flower  |
        | cat     |

  #Scenario -> Scenario Outline
  #"" -> "<sutun_ismi>"
  #Example kelimesi Scenario Outline dan sonra kullanilmali
  #Example verilerin kullanildagi yerdir
