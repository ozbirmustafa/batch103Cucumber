Feature:

    Background: Google_sayfasina_git
        Given kullanici google a gider

    @iphone
    Scenario: TC01_google_iphone_search
        When  kullanici iphone için arama yapar
        Then  sonuclarda iphone oldugunu dogrular
        And   close the application

    @tesla
    Scenario: TC02_google_tesla_search
         When  kullanici tesla için arama yapar
         Then  sonuclarda tesla oldugunu dogrular
         And   close the application




#  1. Her feature file, Feature: kelimesi ile başlamak zorundadır
#  2. Her vir file da, yalnız bir Feature: kullanılabilir
#  3. Senaryo(TEST CASE) oluşturmak için Scenerio: kelimesi kullanılır
#  4. Birden fazla Scenerio: kullanılabilir
#  5. Her bir adım Given, When, And, Then, But, * kelimelerinden biriyle başlamalıdır.
#  6. Given -> Genelde ilk satırlarda, pre condition stepleri için kullanılır.
#  7. Then -> Genelde son satırlarda, verification stepleri için kullanılır.
#  8. And, When -> Genelde ara adımlarda bağlaç olarak kullanılır.

#  NOTE: Teknik olarak istenilen kelime istenilen stepte kullanılabilir,
#        ama anlam karmaşası olmaması için bu adımlar takip edilir.
#  9. Belirli Scenario lari calistirmak icin cucumber tags ler kullanilir
#     tag ler Fetuature, Scenario, Scerio Outline, Examples kelimeleri ile birlikte kullanilabilir
#  10. Background: Her bir Scenario kelimesinden ONCE tek bir sefer calisir
#  11. dryRun=false -> dryRun yokmus gibi normal sekilde calisir. Yani tum adimlari tek tetk browserda acar.
#      dryRun=true  -> Yeni bir STEP(adim) eklendiginde sadece tanimlanmamis step definitions lari olusturmak icin kullanilir
#      kullanilma sebebi zamandan tasarrufdur.

