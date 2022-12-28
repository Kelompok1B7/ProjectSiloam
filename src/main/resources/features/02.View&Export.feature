Feature: View & Export Data

Scenario: Field Start date dan End date kosong ketika View
Given Masuk Ke Halaman View&Export
When Start date kosong
And End date kosong
And Klik button filter
Then Start Date dan End Date Tidak Boleh Kosong

Scenario: Field Start date benar dan End date kosong ketika View
Given Masuk Ke Halaman View&Export
When Start date benar
And End date kosong
And Klik button filter
Then End Date Tidak Boleh Kosong

Scenario: Field Start date kosong dan End date benar ketika View
Given Masuk Ke Halaman View&Export
When Start date kosong
And End date benar
And Klik button filter
Then Start Date Tidak Boleh Kosong

Scenario: Field Start date dan End date benar ketika View
Given Masuk Ke Halaman View&Export
When Start date benar
And End date benar
And Klik button filter
Then Menampilkan Daftar Data Input

Scenario: Foto Faskes Awal
When Klik foto fakses awal
Then Menampilkan gambar fakses awal

Scenario: Foto Faskes Tujuan
When Klik foto fakses tujuan
Then Menampilkan gambar fakses tujuan

Scenario: PDF Aggrement
When Klik pdf aggrement
Then Menampilkan PDF Aggrement

Scenario: View Data
When Klik view
Then Menampilkan View Data

Scenario: View Data Before
Given Berada view data
When Klik gambar before
Then Menampilkan Gambar Before

Scenario: View Data After
Given Berada view data
When Klik gambar after
Then Menampilkan Gambar After

Scenario: Preview Data
Given Berada view data
When Klik preview data
Then Menampilkan PDF gambar Before dan After

Scenario: Back View Data
Given Berada view data
When Klik button back
Then Kembali Ke Halaman View & Export

Scenario: Field Start date dan End date kosong ketika Export
Given Masuk Ke Halaman View&Export
When Start date kosong
And End date kosong
And Klik button export
Then Start Date dan End Date Tidak Boleh Kosong

Scenario: Field Start date benar dan End date kosong ketika Export
Given Masuk Ke Halaman View&Export
When Start date benar
And End date kosong
And Klik button export
Then Start Date dan End Date Tidak Boleh Kosong

Scenario: Field Start date kosong dan End date benar ketika Export
Given Masuk Ke Halaman View&Export
When Start date kosong
And End date benar
And Klik button export
Then Start Date dan End Date Tidak Boleh Kosong

Scenario: Field Start date dan End date benar ketika Export
Given Masuk Ke Halaman View&Export
When Start date benar
And End date benar
And Klik button export
Then Menampilkan Notice Harus Klik button filter

Scenario: Export Data
Given Masuk Ke Halaman View&Export
When Start date benar
And End date benar
And Klik button filter
And Klik button export
Then Data Terdownload format xls

Scenario: Field Start date dan End date kosong ketika Download
Given Masuk Ke Halaman View&Export
When Start date kosong
And End date kosong
And Klik button download
Then Start Date dan End Date Tidak Boleh Kosong

Scenario: Field Start date benar dan End date kosong ketika Download
Given Masuk Ke Halaman View&Export
When Start date benar
And End date kosong
And Klik button download
Then Start Date dan End Date Tidak Boleh Kosong

Scenario: Field Start date kosong dan End date benar ketika Download
Given Masuk Ke Halaman View&Export
When Start date kosong
And End date benar
And Klik button download
Then Start Date dan End Date Tidak Boleh Kosong

Scenario: Field Start date dan End date benar ketika Download
Given Masuk Ke Halaman View&Export
When Start date benar
And End date benar
And Klik button download
Then Menampilkan Notice Harus Klik button filter

Scenario: Download Data
Given Masuk Ke Halaman View&Export
When Start date benar
And End date benar
And Klik button filter
And Klik button download
Then Data Terdownload format zip 

Scenario: Refresh Data
Given Masuk Ke Halaman View&Export
When Start date benar
And End date benar
And Klik button filter
And Klik button refresh
Then Refresh Pada Halaman View & Export

 Scenario: Logout Admin
   	Given Berada Di Halaman Home Admin
   	When klik User Administrator
    When klik logout
    Then Kembali Ke Halaman Login