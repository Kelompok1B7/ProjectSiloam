Feature: User Login Admin

  Scenario: Field Username dan Password Benar pada Admin
   	Given Berada Di Halaman Login Admin
   	When Isi username
    When Isi password
    And Klik button login
    Then Masuk Ke Halaman Home Sales
   