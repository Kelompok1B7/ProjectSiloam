Feature: User Upload Data

#  Scenario: Memasuki Halaman Upload
#    Given Berada di halaman Home Sales
#    When Klik Button Input
#    When Mengisi halaman input
#    When Klik button Simpan Data
#    Then Masuk Ke Halaman Upload Document

#  Scenario: Mengisi Upload Data
#    Given Masuk kedalam halaman upload
#    When Add foto faskes awal
#    When Add foto faskes tujuan
#    When Add tanda tangan digital
#    And Klik button selanjutnya
#    Then Pindah ke halaman ttd digital

  Scenario: Upload Semua Foto
    Given Berada Di Form Upload Document
    When Klik button + Foto Faskes Awal
    When Klik Choose File Faskes Awal
    When Klik button Simpan
    When Klik button Ok
    When Klik button + Foto Faskes Tujuan
    When Klik Choose File Faskes Tujuan
    When Klik button Simpan
    When Klik button Ok
    When Klik button + Foto TTD Digital
    When Klik Choose File TTD Digital
    When Klik button Simpan
    When Klik button Ok
    When Klik Selanjutnya
    Then User Ke Halaman TTD Digital

