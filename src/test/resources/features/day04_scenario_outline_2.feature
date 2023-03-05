@TC01_create_personal
Feature: personel_olusturma
  Scenario Outline: TC01_create_personal


    Given kullanici "https://editor.datatables.net/" gider
    When kullanici new butonuna tiklar
    And kullanici firstname "<firstname>" girer
    And kullanici lastname "<lastname>" girer
    And kullanici positions "<positions>" girer
    And kullanici office "<office>" girer
    And kullanici extension "<extension>" girer
    And kullanici start_date "<start_date>" girer
    And kullanici salary "<salary>" girer
    And kullanici create butonuna tiklar.
    When kullanici firstname ile "<firstname>" arar
    Then firstname "<firstname>" in olustugunu test et
    Then close the application



    Examples:
      | firstname | lastname   | positions    | office     | extension | start_date | salary |
      | John      | Walker     | SDET         | Istanbul   | 345       | 2023-03-01 | 100000 |
      | Zeynep    | Black      | Developer    | Ankara     | 3412      | 2023-03-04 | 800000 |
      | Ali       | Tez        | BA           | London     | 678       | 2023-03-08 | 870000 |
      | Feza      | Sar        | PO           | Izmir      | 7456      | 2023-03-03 | 860000 |
      | Mukesh    | Sanitarian | Scrum Master | Haydarabat | 980       | 2023-03-09 | 50000  |
      | Caroline  | James      | Developer    | New York   | 1980      | 2023-03-12 | 150000 |
