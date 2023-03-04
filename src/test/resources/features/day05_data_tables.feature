@data_tables
Feature: data_tables
  Scenario: TC001_musteri_giris_testi
    Given kullanici "https://www.bluerentalcars.com/login" gider
    When kullanici emaili ve sifresini girer
      |email                          |sifre     |
      |sam.walker@bluerentalcars.com  |c!fas_art |
