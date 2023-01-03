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
	T13("TCC12_Tidak Mengisi Alasan"),
	T14("TCC13_Mengisi Nomor BPJS dengan Alphabet"),
	T15("TCC14_Mengisi Nomor KTP dengan Alphabet"),
	T16("TCC15_Mengisi Nomor BPJS lebih dari 13 karakter"),
	T17("TCC16_Mengisi Nomor KTP lebih dari 13 karakter"),
	T18("TCC17_Mengisi Nomor BPJS kurang dari 13 karakter"),
	T19("TCC18_Mengisi Nomor KTP kurang dari 13 karakter"),
	T20("TCC19_Kota KTP dan Faskes Tujuan di Kota yang Samar"),
	T21("TCC20_Kota KTP dan Faskes Tujuan di Kota yang Berbeda"),
	T22("TCC21_Mengisi Semua Field Dengan Benar");
 

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
