package com.juaracoding.ta.ProjectSiloam.utils;

public enum TestScenarios {

    T1("Field Username dan Password Benar pada Admin"),
    T2("Memasuki Halaman Input"),
	T3("Upload Semua Foto"),
//    T4("TC001 Mengubah data ttd")
    T4("TC01_Mengubah data ttd");
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
