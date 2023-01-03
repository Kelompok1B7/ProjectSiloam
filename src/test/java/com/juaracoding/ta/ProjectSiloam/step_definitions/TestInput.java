package com.juaracoding.ta.ProjectSiloam.step_definitions;

import com.juaracoding.ta.ProjectSiloam.pages.InputPage;

import com.juaracoding.ta.ProjectSiloam.step_definitions.Hooks;
import com.juaracoding.ta.ProjectSiloam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestInput {
	
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private InputPage inputPage = new InputPage();

   public TestInput() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
   
    //Test Case 1	
   @Given("TS01_Berada Di Halaman Home")
   public void ts01_masuk_ke_halaman_Home_() {
   	extentTest.log(LogStatus.PASS, "User memasuki halaman home");
    }
    
    @When("TS02_Klik button Input")
    public void ts02_klik_button_input() {
    	inputPage.clickBtnInput();
        extentTest.log(LogStatus.PASS, "User click button Input");
    }
    @Then("TS03_Masuk Ke Halaman Input")
    public void ts03_masuk_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User Memasuki Halaman Input");
    }
    
    // Test Case 2
    @Given("TS04_Berada Di Halaman Input")
    public void ts04_masuk_ke_halaman_Input_() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    
    @When("TS05_Klik button Upload")
    public void ts05_klik_button_upload() {
    	inputPage.clickBtnUpload();
        extentTest.log(LogStatus.PASS, "User click button Upload");
    }
    @Then("TS06_Validasi")
    public void ts06_validasi() {
    	extentTest.log(LogStatus.PASS, "User Validasi");
    }
    
 // Test Case 3
    @Given("TS07_Berada Di Halaman Input")
    public void ts07_berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    
    @When("TS08_Klik button TTD Digital")
    public void ts08_klik_button_ttd_digital() {
    	inputPage.clickBtnTTD_Digital();
        extentTest.log(LogStatus.PASS, "User click button TTD Digital");
    }
    @Then("TS09_Validasi")
    public void ts09_validasi() {
    	extentTest.log(LogStatus.PASS, "User Validasi");
    }
    
    // Test Case 4
    @Given("TS10_Berada Di Halaman Input")
    public void ts10_berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    @When("TS11_Tidak Mengisi Apapun")
    public void ts11_nama_kosong() {
    	 inputPage.nama("");
         extentTest.log(LogStatus.PASS, "Tidak mengisi apapun");

    	 inputPage.nomorbpjs("");

    	 inputPage.nomorktp("");

    	 inputPage.alamat("");

    	 inputPage.clickBtnKota_Ktp();

    	 inputPage.faskesawal("");

    	 inputPage.clickBtnFaskes_Tujuan();

    }
    
    @When("TS12_Klik button Simpan Data")
    public void ts12_klik_button_simpan_data() {
    	inputPage.clickBtnSimpan_Data();
        extentTest.log(LogStatus.PASS, "User click button Simpan Data");
    }
    @Then("TS13_Validasi")
    public void ts13_validasi() {
    	Assert.assertEquals(inputPage.getTxtPleaseFill(), "please fill out this field");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan informasi Data tidak boleh kosong");
    }
    
    // Test Case 5
    @Given("TS14_Berada Di Halaman Input")
    public void ts14_berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    @When("TS15_Tidak Mengisi Nama")
    public void ts15_tidak_mengisi_nama() {
    	 inputPage.nama("");
         extentTest.log(LogStatus.PASS, "Nama tidak diisi");

    	 inputPage.nomorbpjs("1546722447780760");

    	 inputPage.nomorktp("3755019936362666");

    	 inputPage.alamat("Graha Handaya, Unit Q-S, Jl. Raya Perjuangan No.12A, Kebon Jeruk, Kota Jakarta Barat, DKI Jakarta.");

    	 inputPage.clickBtnKota_Ktp();
         
         inputPage.clickBtnKota_Ktp2();

    	 inputPage.faskesawal("Faskes Diponegoro Utara");

    	 inputPage.clickBtnFaskes_Tujuan();
         
         inputPage.clickBtnFaskes_Tujuan2();
         
    	 inputPage.alasan("Faskes awal terlalu jauh dari rumah");
    }
    
    @When("TS16_Klik button Simpan Data")
    public void ts16_klik_button_simpan_data() {
    	inputPage.clickBtnSimpan_Data();
        extentTest.log(LogStatus.PASS, "User click button Simpan Data");
    }
    @Then("TS17_Validasi")
    public void ts17_validasi() {
    	Assert.assertEquals(inputPage.getTxtPleaseFill(), "please fill out this field");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan informasi Data tidak boleh kosong");
    }
    
    // Test Case 6
    
    @Given("TS18_Berada Di Halaman Input")
    public void p1_klik_button_input() {
    	inputPage.clickBtnInput();
        extentTest.log(LogStatus.PASS, "User click button Input");
    }
    public void ts18_berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    @When("TS19_Tidak Mengisi Nomor BPJS")
    public void ts19_tidak_mengisi_nomor_bpjs() {
    	 inputPage.nama("Elma Lucyana Christin");

    	 inputPage.nomorbpjs("");
         extentTest.log(LogStatus.PASS, "Nomor BPJS tidak diisi");

    	 inputPage.nomorktp("3755019936362666");

    	 inputPage.alamat("Graha Handaya, Unit Q-S, Jl. Raya Perjuangan No.12A, Kebon Jeruk, Kota Jakarta Barat, DKI Jakarta.");

    	 inputPage.clickBtnKota_Ktp();
         
         inputPage.clickBtnKota_Ktp2();
    
    	 inputPage.faskesawal("Faskes Diponegoro Utara");

    	 inputPage.clickBtnFaskes_Tujuan();
         
         inputPage.clickBtnFaskes_Tujuan2();
         
    	 inputPage.alasan("Faskes awal terlalu jauh dari rumah");
    }
    
    @When("TS20_Klik button Simpan Data")
    public void ts20_klik_button_simpan_data() {
    	inputPage.clickBtnSimpan_Data();
        extentTest.log(LogStatus.PASS, "User click button Simpan Data");
    }
    @Then("TS21_Validasi")
    public void ts21_validasi() {
    	Assert.assertEquals(inputPage.getTxtPleaseFill(), "please fill out this field");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan informasi Data tidak boleh kosong");
    }
    
    // Test Case 7
    @Given("TS22_Berada Di Halaman Input")
    public void p2_klik_button_input() {
    	inputPage.clickBtnInput();
        extentTest.log(LogStatus.PASS, "User click button Input");
    }
    public void ts22_berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    @When("TS23_Tidak Mengisi Nomor KTP")
    public void ts23_tidak_mengisi_nomor_ktp() {
    	 inputPage.nama("Elma Lucyana Christin");

    	 inputPage.nomorbpjs("1546722447780760");

    	 inputPage.nomorktp("");
         extentTest.log(LogStatus.PASS, "Nomor KTP tidak diisi");

    	 inputPage.alamat("Graha Handaya, Unit Q-S, Jl. Raya Perjuangan No.12A, Kebon Jeruk, Kota Jakarta Barat, DKI Jakarta.");

    	 inputPage.clickBtnKota_Ktp();
         
         inputPage.clickBtnKota_Ktp2();

    	 inputPage.faskesawal("Faskes Diponegoro Utara");

    	 inputPage.clickBtnFaskes_Tujuan();
         
         inputPage.clickBtnFaskes_Tujuan2();
         
    	 inputPage.alasan("Faskes awal terlalu jauh dari rumah");
    }
    
    @When("TS24_Klik button Simpan Data")
    public void ts24_klik_button_simpan_data() {
    	inputPage.clickBtnSimpan_Data();
        extentTest.log(LogStatus.PASS, "User click button Simpan Data");
    }
    @Then("TS25_Validasi")
    public void ts25_validasi() {
    	Assert.assertEquals(inputPage.getTxtPleaseFill(), "please fill out this field");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan informasi Data tidak boleh kosong");
    }

 // Test Case 8
    @Given("TS26_Berada Di Halaman Input")
    public void p3_klik_button_input() {
    	inputPage.clickBtnInput();
        extentTest.log(LogStatus.PASS, "User click button Input");
    }
    public void ts26_berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    @When("TS27_Tidak Mengisi Alamat")
    public void ts27_tidak_mengisi_alamat() {
    	 inputPage.nama("Elma Lucyana Christin");

    	 inputPage.nomorbpjs("1546722447780760");
    
    	 inputPage.nomorktp("3755019936362666");

    	 inputPage.alamat("");
         extentTest.log(LogStatus.PASS, "Alamat tidak diisi");

    	 inputPage.clickBtnKota_Ktp();
         
         inputPage.clickBtnKota_Ktp2();

    	 inputPage.faskesawal("Faskes Diponegoro Utara");

    	 inputPage.clickBtnFaskes_Tujuan();
         
         inputPage.clickBtnFaskes_Tujuan2();
         
    	 inputPage.alasan("Faskes awal terlalu jauh dari rumah");
    }
    
    @When("TS28_Klik button Simpan Data")
    public void ts28_klik_button_simpan_data() {
    	inputPage.clickBtnSimpan_Data();
        extentTest.log(LogStatus.PASS, "User click button Simpan Data");
    }
    @Then("TS29_Validasi")
    public void ts29_validasi() {
    	Assert.assertEquals(inputPage.getTxtFillAlamat(), "Field Alamat Harus Diisi!");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan informasi Data tidak boleh kosong");
    }
    
    
    // Test Case 9
    @Given("TS30_Berada Di Halaman Input")
    public void p4_klik_button_input() {
    	inputPage.clickBtnInput();
        extentTest.log(LogStatus.PASS, "User click button Input");
    }
    public void ts30_berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    @When("TS31_Tidak Mengisi Kota KTP")
    public void ts31_kota_ktp_tidak_diisi() {
    	 inputPage.nama("Elma Lucyana Christin");

    	 inputPage.nomorbpjs("1546722447780760");

    	 inputPage.nomorktp("3755019936362666");

    	 inputPage.alamat("Graha Handaya, Unit Q-S, Jl. Raya Perjuangan No.12A, Kebon Jeruk, Kota Jakarta Barat, DKI Jakarta.");

    	 inputPage.clickBtnKota_Ktp();
         extentTest.log(LogStatus.PASS, "Kota KTP ditekan");

    	 inputPage.faskesawal("Faskes Diponegoro Utara");

    	 inputPage.clickBtnFaskes_Tujuan();
         
         inputPage.clickBtnFaskes_Tujuan2();
         
    	 inputPage.alasan("Faskes awal terlalu jauh dari rumah");
    }
    
    @When("TS32_Klik button Simpan Data")
    public void ts32_klik_button_simpan_data() {
    	inputPage.clickBtnSimpan_Data();
        extentTest.log(LogStatus.PASS, "User click button Simpan Data");
    }
    @Then("TS33_Validasi")
    public void ts33_validasi() {
    	Assert.assertEquals(inputPage.getTxtSelectItem(), "Please select an item in the list.");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan informasi Data tidak boleh kosong");
    }
    
    // Test Case 10
    @Given("TS34_Berada Di Halaman Input")
    public void p5_klik_button_input() {
    	inputPage.clickBtnInput();
        extentTest.log(LogStatus.PASS, "User click button Input");
    }
    public void ts34_berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    @When("TS35_Tidak Mengisi Faskes Awal")
    public void ts35_faskes_awal_tidak_diisi() {
    	 inputPage.nama("Elma Lucyana Christin");

    	 inputPage.nomorbpjs("1546722447780760");

    	 inputPage.nomorktp("3755019936362666");

    	 inputPage.alamat("Graha Handaya, Unit Q-S, Jl. Raya Perjuangan No.12A, Kebon Jeruk, Kota Jakarta Barat, DKI Jakarta.");

    	 inputPage.clickBtnKota_Ktp();
         
         inputPage.clickBtnKota_Ktp2();
	  	 
    	 inputPage.faskesawal("");
         extentTest.log(LogStatus.PASS, "Faskes awal tidak diisi");

    	 inputPage.clickBtnFaskes_Tujuan();
         
         inputPage.clickBtnFaskes_Tujuan2();
         
    	 inputPage.alasan("Faskes awal terlalu jauh dari rumah");
    }
    
    @When("TS36_Klik button Simpan Data")
    public void ts36_klik_button_simpan_data() {
    	inputPage.clickBtnSimpan_Data();
        extentTest.log(LogStatus.PASS, "User click button Simpan Data");
    }
    @Then("TS37_Validasi")
    public void ts37_validasi() {
    	Assert.assertEquals(inputPage.getTxtSelectItem(), "Please select an item in the list.");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan informasi Data tidak boleh kosong");
    }
    
    // Test Case 11
    @Given("TS38_Berada Di Halaman Input")
    public void p6_klik_button_input() {
    	inputPage.clickBtnInput();
        extentTest.log(LogStatus.PASS, "User click button Input");
    }
    public void ts38_berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    @When("TS39_Tidak Mengisi Faskes Tujuan")
    public void ts39_faskes_tujuan_tidak_diisi() {
    	 inputPage.nama("Elma Lucyana Christin");

    	 inputPage.nomorbpjs("1546722447780760");

    	 inputPage.nomorktp("3755019936362666");

    	 inputPage.alamat("Graha Handaya, Unit Q-S, Jl. Raya Perjuangan No.12A, Kebon Jeruk, Kota Jakarta Barat, DKI Jakarta.");

    	 inputPage.clickBtnKota_Ktp();
         
         inputPage.clickBtnKota_Ktp2();

    	 inputPage.faskesawal("Faskes Diponegoro Utara");

    	 inputPage.clickBtnFaskes_Tujuan();
         extentTest.log(LogStatus.PASS, "Faskes Tujuan Ditekan");
    }
    
    @When("TS40_Klik button Simpan Data")
    public void ts40_klik_button_simpan_data() {
    	inputPage.clickBtnSimpan_Data();
        extentTest.log(LogStatus.PASS, "User click button Simpan Data");
    }
    @Then("TS41_Validasi")
    public void ts41_validasi() {
    	Assert.assertEquals(inputPage.getTxtPleaseFill(), "please fill out this field");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan informasi Data tidak boleh kosong");
    }
    
    // Test Case 12
    @Given("TS42_Berada Di Halaman Input")
    public void p7_klik_button_input() {
    	inputPage.clickBtnInput();
        extentTest.log(LogStatus.PASS, "User click button Input");
    }
    public void ts42_berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    @When("TS43_Tidak Mengisi Alasan")
    public void ts43_alasan_tidak_diisi() {
    	 inputPage.nama("Elma Lucyana Christin");

    	 inputPage.nomorbpjs("1546722447780760");

    	 inputPage.nomorktp("3755019936362666");

    	 inputPage.alamat("Graha Handaya, Unit Q-S, Jl. Raya Perjuangan No.12A, Kebon Jeruk, Kota Jakarta Barat, DKI Jakarta.");

    	 inputPage.clickBtnKota_Ktp();
         
         inputPage.clickBtnKota_Ktp2();

    	 inputPage.faskesawal("Faskes Diponegoro Utara");

    	 inputPage.clickBtnFaskes_Tujuan();

    	 inputPage.clickBtnFaskes_Tujuan2();

    	 inputPage.alasan("");
         extentTest.log(LogStatus.PASS, "Alasan tidak diisi");
    }
    
    @When("TS44_Klik button Simpan Data")
    public void ts44_klik_button_simpan_data() {
    	inputPage.clickBtnSimpan_Data();
        extentTest.log(LogStatus.PASS, "User click button Simpan Data");
    }
    @Then("TS45_Validasi")
    public void ts45_validasi() {
    	Assert.assertEquals(inputPage.getTxtFillAlasan(), "Field Alasan Harus Diisi!");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan informasi Data tidak boleh kosong");
    }
    
    // Test Case 13
    @Given("TS46_Berada Di Halaman Input")
    public void p8_klik_button_input() {
    	inputPage.clickBtnInput();
        extentTest.log(LogStatus.PASS, "User click button Input");
    }
    public void ts46_berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    @When("TS47_Mengisi Nomor BPJS dengan alphabet")
    public void ts47_mengisi_nomor_bpjs_dengan_alphabet() {
    	 inputPage.nama("");

    	 inputPage.nomorbpjs("Anzi Matta");
         extentTest.log(LogStatus.PASS, "Nomor BPJS diisi dengan alphabet");

    	 inputPage.nomorktp("");

    	 inputPage.alamat("");

    	 inputPage.clickBtnKota_Ktp();

    	 inputPage.faskesawal("");

    	 inputPage.clickBtnFaskes_Tujuan();

    }
    
    @When("TS48_Klik button Simpan Data")
    public void ts48_klik_button_simpan_data() {
    	inputPage.clickBtnSimpan_Data();
        extentTest.log(LogStatus.PASS, "User click button Simpan Data");
    }
    @Then("TS49_Validasi")
    public void ts49_validasi() {
    	Assert.assertEquals(inputPage.getTxtPleaseFill(), "please fill out this field");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan informasi Data tidak boleh kosong");
    }
    
    // Test Case 14
    @Given("TS50_Berada Di Halaman Input")
    public void p9_klik_button_input() {
    	inputPage.clickBtnInput();
        extentTest.log(LogStatus.PASS, "User click button Input");
    }
    public void ts50_berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    @When("TS51_Mengisi Nomor KTP dengan alphabet")
    public void ts51_mengisi_nomor_ktp_dengan_alphabet() {
    	 inputPage.nama("");

    	 inputPage.nomorbpjs("");

    	 inputPage.nomorktp("Anzi Matta");
         extentTest.log(LogStatus.PASS, "Nomor KTP diisi dengan alphabet");

    	 inputPage.alamat("");

    	 inputPage.clickBtnKota_Ktp();

    	 inputPage.faskesawal("");

    	 inputPage.clickBtnFaskes_Tujuan();

    }
    
    @When("TS52_Klik button Simpan Data")
    public void ts52_klik_button_simpan_data() {
    	inputPage.clickBtnSimpan_Data();
        extentTest.log(LogStatus.PASS, "User click button Simpan Data");
    }
    @Then("TS53_Validasi")
    public void ts53_validasi() {
    	Assert.assertEquals(inputPage.getTxtPleaseFill(), "please fill out this field");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan informasi Data tidak boleh kosong");
    }
    
    // Test Case 15
    @Given("TS54_Berada Di Halaman Input")
    public void p10_klik_button_input() {
    	inputPage.clickBtnInput();
        extentTest.log(LogStatus.PASS, "User click button Input");
    }
    public void ts54_berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    @When("TS55_Mengisi Nomor BPJS lebih dari 13 karakter")
    public void ts55_mengisi_nomor_bpjs_lebih_dari_13_karakter() {
    	 inputPage.nama("");

    	 inputPage.nomorbpjs("12345678901234567890");
         extentTest.log(LogStatus.PASS, "Nomor BPJS diisi lebih dari 13 karakter");

    	 inputPage.nomorktp("");

    	 inputPage.alamat("");

    	 inputPage.clickBtnKota_Ktp();

    	 inputPage.faskesawal("");

    	 inputPage.clickBtnFaskes_Tujuan();

    }
    
    @When("TS56_Klik button Simpan Data")
    public void ts56_klik_button_simpan_data() {
    	inputPage.clickBtnSimpan_Data();
        extentTest.log(LogStatus.PASS, "User click button Simpan Data");
    }
    @Then("TS57_Validasi")
    public void ts57_validasi() {
    	Assert.assertEquals(inputPage.getTxtPleaseFill(), "please fill out this field");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan informasi Data tidak boleh kosong");
    }
    
    // Test Case 16
    @Given("TS58_Berada Di Halaman Input")
    public void p11_klik_button_input() {
    	inputPage.clickBtnInput();
        extentTest.log(LogStatus.PASS, "User click button Input");
    }
    public void ts58_berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    @When("TS59_Mengisi Nomor KTP lebih dari 16 karakter")
    public void ts59_mengisi_nomor_ktp_lebih_dari_16_karakter() {
    	 inputPage.nama("");

    	 inputPage.nomorbpjs("");

    	 inputPage.nomorktp("12345678901234567890");
         extentTest.log(LogStatus.PASS, "Nomor KTP diisi lebih dari 13 karakter");

    	 inputPage.alamat("");

    	 inputPage.clickBtnKota_Ktp();

    	 inputPage.faskesawal("");

    	 inputPage.clickBtnFaskes_Tujuan();

    }
    
    @When("TS60_Klik button Simpan Data")
    public void ts60_klik_button_simpan_data() {
    	inputPage.clickBtnSimpan_Data();
        extentTest.log(LogStatus.PASS, "User click button Simpan Data");
    }
    @Then("TS61_Validasi")
    public void ts61_validasi() {
    	Assert.assertEquals(inputPage.getTxtPleaseFill(), "please fill out this field");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan informasi Data tidak boleh kosong");
    }
    
    // Test Case 17
    @Given("TS62_Berada Di Halaman Input")
    public void p12_klik_button_input() {
    	inputPage.clickBtnInput();
        extentTest.log(LogStatus.PASS, "User click button Input");
    }
    public void ts62_berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    @When("TS63_Mengisi Nomor BPJS kurang dari 13 karakter")
    public void ts63_mengisi_nomor_bpjs_kurang_dari_13_karakter() {
    	 inputPage.nama("Elma Lucyana Christin");

    	 inputPage.nomorbpjs("154672");
         extentTest.log(LogStatus.PASS, "Nomor BPJS diisi kurang dari 13 karater");

    	 inputPage.nomorktp("3755019936362666");

    	 inputPage.alamat("Graha Handaya, Unit Q-S, Jl. Raya Perjuangan No.12A, Kebon Jeruk, Kota Jakarta Barat, DKI Jakarta.");

    	 inputPage.clickBtnKota_Ktp();

         inputPage.clickBtnKota_Ktp2();

    	 inputPage.faskesawal("Faskes Diponegoro Utara");

    	 inputPage.clickBtnFaskes_Tujuan();

    	 inputPage.clickBtnFaskes_Tujuan2();

    	 inputPage.alasan("Faskes awal terlalu jauh dari rumah");

    }
    
    @When("TS64_Klik button Simpan Data")
    public void ts64_klik_button_simpan_data() {
    	inputPage.clickBtnSimpan_Data();
        extentTest.log(LogStatus.PASS, "User click button Simpan Data");
    }
    @Then("TS65_Validasi")
    public void ts65_validasi() {
    	Assert.assertEquals(inputPage.getTxtPleaseFill(), "please fill out this field");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan informasi Data tidak boleh kosong");
    }
    
    // Test Case 18
    @Given("TS66_Berada Di Halaman Input")
    public void p13_klik_button_input() {
    	inputPage.clickBtnInput();
        extentTest.log(LogStatus.PASS, "User click button Input");
    }
    public void ts66_berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    @When("TS67_Mengisi Nomor KTP kurang dari 16 karakter")
    public void ts67_mengisi_nomor_ktp_kurang_dari_16_karakter() {
    	 inputPage.nama("Elma Lucyana Christin");

    	 inputPage.nomorbpjs("1546722447780760");

    	 inputPage.nomorktp("375501");
         extentTest.log(LogStatus.PASS, "Nomor KTP diisi kurang dari 16 karakter");

    	 inputPage.alamat("Graha Handaya, Unit Q-S, Jl. Raya Perjuangan No.12A, Kebon Jeruk, Kota Jakarta Barat, DKI Jakarta.");

    	 inputPage.clickBtnKota_Ktp();

         inputPage.clickBtnKota_Ktp2();

    	 inputPage.faskesawal("Faskes Diponegoro Utara");

    	 inputPage.clickBtnFaskes_Tujuan();

    	 inputPage.clickBtnFaskes_Tujuan2();

    	 inputPage.alasan("Faskes awal terlalu jauh dari rumah");

    }
    
    @When("TS68_Klik button Simpan Data")
    public void ts68_klik_button_simpan_data() {
    	inputPage.clickBtnSimpan_Data();
        extentTest.log(LogStatus.PASS, "User click button Simpan Data");
    }
    @Then("TS69_Validasi")
    public void ts69_validasi() {
    	Assert.assertEquals(inputPage.getTxtPleaseFill(), "please fill out this field");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan informasi Data tidak boleh kosong");
    }
    
    // Test Case 19
    @Given("TS70_Berada Di Halaman Input")
    public void p14_klik_button_input() {
    	inputPage.clickBtnInput();
        extentTest.log(LogStatus.PASS, "User click button Input");
    }
    public void ts70_berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    @When("TS71_Kota KTP dan Faskes Tujuan di Kota yang Sama")
    public void ts71_kota_ktp_dan_faskes_tujuan_di_kota_yang_sama() {
    	 inputPage.nama("Elma Lucyana Christin");

    	 inputPage.nomorbpjs("1546722447780760");

    	 inputPage.nomorktp("3755019936362666");

    	 inputPage.alamat("Graha Handaya, Unit Q-S, Jl. Raya Perjuangan No.12A, Kebon Jeruk, Kota Jakarta Barat, DKI Jakarta.");

    	 inputPage.clickBtnKota_Ktp();
         
         inputPage.clickBtnKota_Ktp3();
	  	 extentTest.log(LogStatus.PASS, "Kota KTP Dipilih");

    	 inputPage.faskesawal("Faskes Diponegoro Utara");

    	 inputPage.clickBtnFaskes_Tujuan();

    	 inputPage.clickBtnFaskes_Tujuan2();
         extentTest.log(LogStatus.PASS, "Faskes Tujuan Dipilih");

    }
    
    @Then("TS72_Validasi")
    public void ts72_validasi() {
    	Assert.assertEquals(inputPage.getTxtPleaseFill(), "please fill out this field");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan informasi Data tidak boleh kosong");
    }
    
    // Test Case 20
    @Given("TS73_Berada Di Halaman Input")
    public void p15_klik_button_input() {
    	inputPage.clickBtnInput();
        extentTest.log(LogStatus.PASS, "User click button Input");
    }
    public void ts73_berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    @When("TS74_Kota KTP dan Faskes Tujuan di Kota yang Berbeda")
    public void ts74_kota_ktp_dan_faskes_tujuan_di_kota_yang_berbeda() {
    	 inputPage.nama("Elma Lucyana Christin");

    	 inputPage.nomorbpjs("1546722447780760");

    	 inputPage.nomorktp("3755019936362666");

    	 inputPage.alamat("Graha Handaya, Unit Q-S, Jl. Raya Perjuangan No.12A, Kebon Jeruk, Kota Jakarta Barat, DKI Jakarta.");

    	 inputPage.clickBtnKota_Ktp();
         
         inputPage.clickBtnKota_Ktp2();
	  	 extentTest.log(LogStatus.PASS, "Kota KTP Dipilih");

    	 inputPage.faskesawal("Faskes Diponegoro Utara");

    	 inputPage.clickBtnFaskes_Tujuan();

    	 inputPage.clickBtnFaskes_Tujuan2();
         extentTest.log(LogStatus.PASS, "Faskes Tujuan Dipilih");

    }
    
    @Then("TS75_Validasi")
    public void ts75_validasi() {
    	Assert.assertEquals(inputPage.getTxtPleaseFill(), "please fill out this field");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan informasi Data tidak boleh kosong");
    }
    
    // Test Case 21
    @Given("TS76_Berada Di Halaman Input")
    public void p16_klik_button_input() {
    	inputPage.clickBtnInput();
        extentTest.log(LogStatus.PASS, "User click button Input");
    }
    public void ts76_berada_ke_halaman_Input() {
    	extentTest.log(LogStatus.PASS, "User berada di halaman input");
     }
    @When("TS77_Mengisi semua field dengan benar")
    public void ts77_mengisi_semua_field_dengan_benar() {
    	 inputPage.nama("Elma Lucyana Christin");

    	 inputPage.nomorbpjs("2216337781761");

    	 inputPage.nomorktp("1215033935362165");

    	 inputPage.alamat("Graha Handaya, Unit Q-S, Jl. Raya Perjuangan No.12A, Kebon Jeruk, Kota Jakarta Barat, DKI Jakarta.");

    	 inputPage.clickBtnKota_Ktp();

         inputPage.clickBtnKota_Ktp2();

    	 inputPage.faskesawal("Faskes Diponegoro Utara");

    	 inputPage.clickBtnFaskes_Tujuan();

    	 inputPage.clickBtnFaskes_Tujuan2();

    	 inputPage.alasan("Faskes awal terlalu jauh dari rumah");

    }
    
    @When("TS78_Klik button Simpan Data")
    public void ts78_klik_button_simpan_data() {
    	inputPage.clickBtnSimpan_Data();
        extentTest.log(LogStatus.PASS, "User click button Simpan Data");
    }
    @Then("TS79_Validasi")
    public void ts79_validasi() {
    	Assert.assertEquals(inputPage.getTxtUploadDoc(), "UNTUK KE TAHAP SELANJUTNYA, DOKUMEN YANG WAJIB DIUPLOAD HARAP UNTUK DI LENGKAPI !");
    	extentTest.log(LogStatus.PASS, "User Berpindah ke halaman selanjutnya");

    }
    
}

