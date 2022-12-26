Feature: User Input Data

  Scenario: Memasuki Halaman Input
   	Given Berada Di Halaman Home
    And Klik button Input
    Then Masuk Ke Halaman Input

	Scenario: Memasuki Halaman Upload
   	Given Berada Di Halaman Input
    And Klik button Upload
    Then Tetap di Halaman Input   
    
	Scenario: Memasuki Halaman TTD Digital
   	Given Berada Di Halaman Input Dua
    And Klik button TTD Digital
    Then Tetap di Halaman Input Dua
    
	Scenario: Tidak Mengisi Apapun
   	Given Berada Di Halaman Input Tiga
   	When Nama Kosong
   	When Nomor BPJS Kosong
   	When Nomor KTP Kosong
   	When Alamat Kosong
   	When Kota KTP Kosong
   	When Faskes Awal Kosong
   	When Faskes Tujuan Kosong
    And Klik button Simpan Data
    Then Tetap di Halaman Input Tiga 