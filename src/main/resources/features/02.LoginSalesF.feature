Feature: Login Sales

  Scenario: Field Username dan Password Benar pada Sales
   	Given Berada Di Halaman Login Sales
   	When Isi username
    When Isi password
    And Klik button login
    Then Masuk Ke Halaman Home Sales
    