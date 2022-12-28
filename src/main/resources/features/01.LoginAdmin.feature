Feature: Login Admin
	
		Scenario: Url Invalid
   	Given Buka browser
   	When Isi url salah
    And Klik search
    Then Tidak menampilkan Url yang ingin dikunjungi
    
    Scenario: Url Valid
   	Given Buka browser
   	When Isi url benar
    And Klik search
    Then Menampilkan Url yang ingin dikunjungi

 		Scenario: Field Username dan Password Kosong pada Admin
   	Given Berada Di Halaman Login Admin
   	When Isi username kosong pada Admin
    When Isi password kosong pada Admin
    And Klik button login
    Then Username dan Password Tidak Boleh Kosong

	 	Scenario: Field Username Kosong dan Password Salah pada Admin
   	Given Berada Di Halaman Login Admin
   	When Isi username kosong pada Admin
    When Isi password salah pada Admin
    And Klik button login 
    Then Username Tidak Boleh Kosong

    Scenario: Field Username Salah dan Password Kosong pada Admin
   	Given Berada Di Halaman Login Admin
   	When Isi username salah pada Admin
    When Isi password kosong pada Admin
    And Klik button login 
    Then Password Tidak Boleh Kosong
    
    Scenario: Field Username dan Password Salah pada Admin
   	Given Berada Di Halaman Login Admin
   	When Isi username salah pada Admin
    When Isi password salah pada Admin
    And Klik button login 
    Then Username dan Password Salah
    
    Scenario: Field Username Salah dan Password Benar pada Admin
   	Given Berada Di Halaman Login Admin
   	When Isi username salah pada Admin
    When Isi password benar pada Admin
    And Klik button login 
    Then Username dan Password Salah

		Scenario: Field Username Benar dan Password Salah pada Admin
   	Given Berada Di Halaman Login Admin
   	When Isi username benar pada Admin
    When Isi password salah pada Admin
    And Klik button login 
    Then Username dan Password Salah
    
    Scenario: Field Username Kapital Benar dan Password Salah pada Admin
   	Given Berada Di Halaman Login Admin
   	When Isi username kapital benar pada Admin
    When Isi password benar pada Admin
    And Klik button login 
    Then Username dan Password Salah
    
    Scenario: Field Username Benar dan Password Kapital Benar pada Admin
   	Given Berada Di Halaman Login Admin
   	When Isi username benar pada Admin
    When Isi password kapital benar pada Admin
    And Klik button login 
    Then Username dan Password Salah
	
  	Scenario: Field Username dan Password Benar pada Admin
   	Given Berada Di Halaman Login Admin
   	When Isi username benar pada Admin
    When Isi password benar pada Admin
    And Klik button login 
    Then Masuk Ke Halaman Home Admin
    
    #Scenario: Logout Admin
   #	Given Berada Di Halaman Home Admin
   #	When klik pojok kanan atas
    #When klik logout
    #Then Kembali Ke Halaman Login
   