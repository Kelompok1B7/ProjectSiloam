Feature: Form Return Sales

Scenario: Input Semua dengan Status Pending
Given Masuk Ke Halaman Return
When Isi start date 
When Isi end date
When Isi status pending
And Klik button Filter
Then Menampilkan Data Pending

Scenario: Input Semua dengan Status Complete
Given Masuk Ke Halaman Return
When Isi start date 
When Isi end date
When Isi status complete
And Klik button Filter
Then Menampilkan Data Complete

Scenario: Reset Data
Given Masuk Ke Halaman Return
When Isi start date 
When Isi end date
When Isi status
When Klik button Filter
And Klik button reset
Then Semua Field Akan Reset

Scenario: Search Data Tidak Terdaftar
Given Masuk Ke Halaman Return
When Isi search tidak terdaftar
And Klik button search
Then Tidak Menampilkan Data

Scenario: Search Data Terdaftar
Given Masuk Ke Halaman Return
When Isi search terdaftar
And Klik button search
Then Menampilkan Data

Scenario: Upload Document Data
Given Masuk Ke Halaman Return
When Klik button icon
Then Menampilkan Halaman Upload 

Scenario: Refresh Data
Given Masuk Ke Halaman Return
When Isi start date 
When Isi end date
When Isi status
When Klik button Filter
And Klik button Refresh
Then Halaman Return Akan Refresh