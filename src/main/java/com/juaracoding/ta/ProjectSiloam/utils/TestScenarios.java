package com.juaracoding.ta.ProjectSiloam.utils;

public enum TestScenarios {
	//Login Admin
    T1("Url Invalid"),
	T2("Url Valid"),
	T3("Field Username dan Password Kosong pada Admin"),
    T4("Field Username Kosong dan Password Salah pada Admin"),
    T5("Field Username Salah dan Password Kosong pada Admin"),
    T6("Field Username dan Password Salah pada Admin"),
    T7("Field Username Salah dan Password Benar pada Admin"),
    T8("Field Username Benar dan Password Salah pada Admin"),
    T9("Field Username Kapital Benar dan Password Salah pada Admin"),
    T10("Field Username Benar dan Password Kapital Benar pada Admin"),
	T11("Field Username dan Password Benar pada Admin"),
 
	//View&Export
	T12("Field Start date dan End date kosong ketika View"),
	T13("Field Start date benar dan End date kosong ketika View"),
	T14("Field Start date kosong dan End date benar ketika View"),
    T15("Field Start date dan End date benar ketika View"),
    T16("Foto Faskes Awal"),
    T17("Foto Faskes Tujuan"),
    T18("PDF Aggrement"),
    T19("View Data"),
    T20("View Data Before"),
    T21("View Data After"),
	T22("Preview Data"),
	T23("Back View Data"),
	T24("Field Start date dan End date kosong ketika Export"),
    T25("Field Start date benar dan End date kosong ketika Export"),
    T26("Field Start date kosong dan End date benar ketika Export"),
    T27("Field Start date dan End date benar ketika Export"),
    T28("Export Data"),
    T29("Field Start date dan End date kosong ketika Download"),
    T30("Field Start date benar dan End date kosong ketika Download"),
    T31("Field Start date kosong dan End date benar ketika Download"),
	T32("Field Start date dan End date benar ketika Download"),
	T33("Download Data"),
	T34("Refresh Data"),
	
	//Logout Admin
	T35("Logout Admin"),
	
	//Login Sales
	T36("Field Username dan Password Kosong pada Sales"),
    T37("Field Username Kosong dan Password Salah pada Sales"),
    T38("Field Username Salah dan Password Kosong pada Sales"),
    T39("Field Username dan Password Salah pada Sales"),
    T40("Field Username Salah dan Password Benar pada Sales"),
    T41("Field Username Benar dan Password Salah pada Sales"),
	T42("Field Username dan Password Benar pada Sales"),
	T43("Input Semua dengan Status Pending"),
	T44("Input Semua dengan Status Complete"),
    T45("Reset Data"),
    T46("Search Data Tidak Terdaftar"),
    T47("Search Data Terdaftar"),
    T48("Upload Document Data"),
    T49("Refresh Data");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
