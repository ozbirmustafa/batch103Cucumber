@excel_automation
Feature: excel_login_feature
  Scenario: TC01_musteri_giris_testi
    Given kullanici "customer_info" bilgileri ile giris yapar

  # Admin Giris Testi
  # customer_info->admin_info
  Scenario: TC02_musteri_giris_testi
    Given kullanici "admin_info" bilgileri ile giris yapar