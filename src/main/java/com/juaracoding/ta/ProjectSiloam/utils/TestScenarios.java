package com.juaracoding.ta.ProjectSiloam.utils;

public enum TestScenarios {

    T1("Field Username dan Password Benar pada Admin"),
	T2("TCC01_Memasuki Halaman Input"),
	T3("TCC02_Memasuki Halaman Upload"),
	T4("TCC03_Memasuki Halaman TTD Digital"),
	T5("TCC04_Tidak Mengisi Apapun"),
	T6("TCC05_Tidak Mengisi Nama"),
	T7("TCC06_Tidak Mengisi Nomor BPJS"),
	T8("TCC07_Tidak Mengisi Nomor KTP"),
	T9("TCC08_Tidak Mengisi Alamat"),
	T10("TCC09_Tidak Mengisi Kota KTP"),
	T11("TCC10_Tidak Mengisi Faskes Awal"),
	T12("TCC11_Tidak Mengisi Faskes Tujuan"),
	T13("TCC12_Tidak Mengisi Faskes Alasan"),
	T14("TCC13_Tidak Mengisi Alasan"),
	T15("TCC14_Mengisi Nomor BPJS dengan Alphabet"),
	T16("TCC15_Mengisi Nomor KTP dengan Alphabet"),
	T17("TCC16_Mengisi Nomor BPJS lebih dari 13 karakter"),
	T18("TCC17_Mengisi Nomor KTP lebih dari 13 karakter"),
	T19("TCC18_Mengisi Nomor BPJS kurang dari 13 karakter"),
	T20("TCC19_Mengisi Nomor KTP kurang dari 13 karakter"),
	T21("TCC19_Mengisi Semua Field Dengan Benar");
//    T4("Mengakses Tidak Masukan Username dan Masukan Password Benar"),
//    T5("Mengakses Tidak Masukan Password dan Masukan Username Benar"),
//    T6("Mengakses Masukan Username dan Password Salah"),
//    T7("Mengakses Masukan Username Salah dan Password Benar"),
//    T8("Mengakses Masukan Username Benar dan Password Salah"),
//    T9("Mengakses Masukan Username dan Password Benar");
 

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
