Feature: User Input Data

  Scenario: TCC01_Memasuki Halaman Input
   	Given TS01_Berada Di Halaman Home
    And TS02_Klik button Input
    Then TS03_Masuk Ke Halaman Input

	Scenario: TCC02_Memasuki Halaman Upload
   	Given TS04_Berada Di Halaman Input
    And TS05_Klik button Upload
    Then TS06_Validasi
    
	Scenario: TCC03_Memasuki Halaman TTD Digital
   	Given TS07_Berada Di Halaman Input
    And TS08_Klik button TTD Digital
    Then TS09_Validasi
    
	Scenario: TCC04_Tidak Mengisi Apapun
   	Given TS10_Berada Di Halaman Input
   	When TS11_Tidak Mengisi Apapun
    And TS12_Klik button Simpan Data
    Then TS13_Validasi
    
	Scenario: TCC05_Tidak Mengisi Nama
   	Given TS14_Berada Di Halaman Input
   	When TS15_Tidak Mengisi Nama
    And TS16_Klik button Simpan Data
    Then TS17_Validasi
    
	Scenario: TCC06_Tidak Mengisi Nomor BPJS
   	Given TS18_Berada Di Halaman Input
   	When TS19_Tidak Mengisi Nomor BPJS
    And TS20_Klik button Simpan Data
    Then TS21_Validasi
    
 	Scenario: TCC07_Tidak Mengisi Nomor KTP
   	Given TS22_Berada Di Halaman Input
   	When TS23_Tidak Mengisi Nomor KTP
    And TS24_Klik button Simpan Data
    Then TS25_Validasi

 	Scenario: TCC08_Tidak Mengisi Alamat
   	Given TS26_Berada Di Halaman Input
   	When TS27_Tidak Mengisi Alamat
    And TS28_Klik button Simpan Data
    Then TS29_Validasi
    
 	Scenario: TCC09_Tidak Mengisi Kota KTP
   	Given TS30_Berada Di Halaman Input
   	When TS31_Tidak Mengisi Kota KTP
    And TS32_Klik button Simpan Data
    Then TS33_Validasi
    
 	Scenario: TCC10_Tidak Mengisi Faskes Awal
   	Given TS34_Berada Di Halaman Input
   	When TS35_Tidak Mengisi Faskes Awal
    And TS36_Klik button Simpan Data
    Then TS37_Validasi
    
 	Scenario: TCC11_Tidak Mengisi Faskes Tujuan
   	Given TS38_Berada Di Halaman Input
   	When TS39_Tidak Mengisi Faskes Tujuan
    And TS40_Klik button Simpan Data
    Then TS41_Validasi
    
 	Scenario: TCC12_Tidak Mengisi Alasan
   	Given TS42_Berada Di Halaman Input
   	When TS43_Tidak Mengisi Alasan
    And TS44_Klik button Simpan Data
    Then TS45_Validasi
    
 	Scenario: TCC13_Mengisi nomor BPJS dengan alphabet
   	Given TS46_Berada Di Halaman Input
   	When TS47_Mengisi Nomor BPJS dengan alphabet
    And TS48_Klik button Simpan Data
    Then TS49_Validasi
    
 	Scenario: TCC14_Mengisi nomor KTP dengan alphabet
   	Given TS50_Berada Di Halaman Input
   	When TS51_Mengisi Nomor KTP dengan alphabet
    And TS52_Klik button Simpan Data
    Then TS53_Validasi
    
 	Scenario: TCC15_Mengisi nomor BPJS lebih dari 13 karakter
   	Given TS54_Berada Di Halaman Input
   	When TS55_Mengisi Nomor BPJS lebih dari 13 karakter
    And TS56_Klik button Simpan Data
    Then TS57_Validasi
    
 	Scenario: TCC16_Mengisi nomor KTP lebih dari 16 karakter
   	Given TS58_Berada Di Halaman Input
   	When TS59_Mengisi Nomor KTP lebih dari 16 karakter
    And TS60_Klik button Simpan Data
    Then TS61_Validasi
    
 	Scenario: TCC17_Mengisi nomor BPJS kurang dari 13 karakter
   	Given TS62_Berada Di Halaman Input
   	When TS63_Mengisi Nomor BPJS kurang dari 13 karakter
    And TS64_Klik button Simpan Data
    Then TS65_Validasi
    
 	Scenario: TCC18_Mengisi nomor KTP kurang dari 16 karakter
   	Given TS66_Berada Di Halaman Input
   	When TS67_Mengisi Nomor KTP kurang dari 16 karakter
    And TS68_Klik button Simpan Data
    Then TS69_Validasi
    
 	Scenario: TCC19_Kota KTP dan Faskes Tujuan di Kota yang Sama
   	Given TS70_Berada Di Halaman Input
   	When TS71_Kota KTP dan Faskes Tujuan di Kota yang Sama
    Then TS72_Validasi
    
 	Scenario: TCC20_Kota KTP dan Faskes Tujuan di Kota yang Berbeda
   	Given TS73_Berada Di Halaman Input
   	When TS74_Kota KTP dan Faskes Tujuan di Kota yang Berbeda
    Then TS75_Validasi
    
 	Scenario: TCC21_Mengisi semua field dengan benar
   	Given TS76_Berada Di Halaman Input
   	When TS77_Mengisi semua field dengan benar
    And TS78_Klik button Simpan Data
    Then TS79_Validasi