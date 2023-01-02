Feature: User Ubah Data
  Scenario: TC01_Mengubah data ttd
#    When Berada di halaman ttd digital
    And User klik edit
    And User mengubah nama
    And User mengubah no BPJS
    And User mengubah no KTP
    And User mengubah alamat
    And User select kota KTP
    And User click kota KTP
    And User mengubah faskes awal
    And User select faskes tujuan
    And User mengubah alasan
    Then User klik tombol simpan

#    Scenario: TC02_Membatalkan ubah data
#      When Berada di halaman ttd digital
#      And User klik edit
#      Then User klik tombol cancel
#
#    Scenario: TC03_Menghapus no bpjs dan no ktp
#      When Berada di halaman ttd digital
#      And User klik edit
#      And User mengubah data kecuali nama
#      Then User klik tombol simpan
#
#    Scenario: TC04_Mengubah data kecuali no BPJS
#      When User Klik edit
#      And User mengubah no BPJS kurang dari 13 digit
#      Then User klik simpan
#
#    Scenario: TC04_Mengisi no KTP kurang dari 16 digit
#      When User klik edit
#      And User mengubah no KTP kurang dari 16 digit
#      Then User klik simpan