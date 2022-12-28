Feature: Login Sales

		Scenario: Field Username dan Password Kosong pada Sales
   	Given Berada Di Halaman Login Sales
   	When Isi username kosong pada Sales
    When Isi password kosong pada Sales
    And Klik button login
    Then Username dan Password Tidak Boleh Kosong
    
	 	Scenario: Field Username Kosong dan Password Salah pada Sales
   	Given Berada Di Halaman Login Sales
   	When Isi username kosong pada Sales
    When Isi password salah pada Sales
    And Klik button login 
    Then Username Tidak Boleh Kosong

    Scenario: Field Username Salah dan Password Kosong pada Sales
   	Given Berada Di Halaman Login Sales
   	When Isi username salah pada Sales
    When Isi password kosong pada Sales
    And Klik button login 
    Then Password Tidak Boleh Kosong
    
    Scenario: Field Username dan Password Salah pada Sales
   	Given Berada Di Halaman Login Sales
   	When Isi username salah pada Sales
    When Isi password salah pada Sales
    And Klik button login 
    Then Username dan Password Salah
    
    Scenario: Field Username Salah dan Password Benar pada Sales
   	Given Berada Di Halaman Login Sales
   	When Isi username salah pada Sales
    When Isi password benar pada Sales
    And Klik button login 
    Then Username dan Password Salah

		Scenario: Field Username Benar dan Password Salah pada Sales
   	Given Berada Di Halaman Login Sales
   	When Isi username benar pada Sales
    When Isi password salah pada Sales
    And Klik button login 
    Then Username dan Password Salah
    
  	Scenario: Field Username dan Password Benar pada Sales
   	Given Berada Di Halaman Login Sales
   	When Isi username benar pada Sales
    When Isi password benar pada Sales
    And Klik button login
    Then Masuk Ke Halaman Home Sales
    
    #Scenario: Logout Sales
   #	Given Berada Di Halaman Home Sales
   #	When klik pojok kanan atas
    #When klik logout
    #Then Kembali Ke Halaman Login
    