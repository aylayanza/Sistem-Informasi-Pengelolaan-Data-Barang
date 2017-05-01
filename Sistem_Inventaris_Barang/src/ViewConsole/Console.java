/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewConsole;

/**
 *
 * @author Farid Kiftirul Aziz
 */
import Model.Aplikasi;
import Model.Barang;
import Model.Gudang;
import Model.Orang;
import Model.Penyedia;
import Model.Petugas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 *
 */
public class Console {

    private Aplikasi apl;
    private Scanner IInt;
    private Scanner IStr;

    public Console(Aplikasi apl) {
        this.apl = apl;
        IInt = new Scanner(System.in);
        IStr = new Scanner(System.in);
    }

    public int inputInteger() {
        try {
            return IInt.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Anda harus memasukkan karakter berupa angka");
        } finally {
            IInt = new Scanner(System.in);
        }
    }

    public void MenuGudang() {
        int pil = 0;
        do {
            try {
                System.out.println("------ Menu Gudang-------");
                System.out.println("- 1. Add Gudang");
                System.out.println("- 2. Add Barang       ");
                System.out.println("- 3. Remove Barang         ");
                System.out.println("- 4. Lihat semua Barang   ");
                System.out.println("- 5. Cari Barang berdasarkan ID    ");
                System.out.println("- 6. Cari Barang berdasarkan Index ");
                System.out.println("- 7. Show Gudang");
                System.out.println("- 0. Kembali                 ");
                System.out.println("-----------------------------");
                System.out.print("- Pilih menu : ");
                pil = inputInteger();
                switch (pil) {
                    case 1:
                        System.out.println("");
                        System.out.println("Lokasi  :");
                        String Lokasig = IStr.nextLine();
                        Gudang o = new Gudang(Lokasig);
                        apl.addGudang(o);
                        break;
                    case 2:
                        System.out.println("--- Add Barang ---");
                        System.out.print(" Nama Barang        : ");
                        String nama = IStr.nextLine();
                        System.out.print(" Stok Barang        : ");
                        int jmlBarang = IInt.nextInt();
                        System.out.print(" Tanggal Pembelian  : ");
                        String tgl = IStr.nextLine();
                        System.out.print(" Harga Barang       : ");
                        double harga = inputInteger();
                        System.out.println("Lokasi            :");
                        String Lokasi = IStr.nextLine();
                        Barang br = new Barang(nama, jmlBarang, tgl, harga);
                        Gudang r = apl.searchGudang(Lokasi);
                        if (r == null) {
                            System.out.println("Gudang tidak ditemukan");
                        } else {
                            r.addBarang(br);
                        }
                        break;

                    case 3:
                        System.out.println("--- Remove Barang ---");
                        System.out.print(" - Id Barang : ");
                        String id = IStr.nextLine();
                        apl.removeBarang(id);
                        break;
                    case 4:
                        System.out.println("--- Lihat semua Barang ---");
                        apl.viewBarang();
                        break;
                    case 5:
                        System.out.println("--- Cari Barang berdasarkan Id ---");
                        System.out.print(" - Masukkan Id Barang : ");
                        id = IStr.nextLine();
                        Penyedia k = apl.getSetBarang(id);
                        System.out.println(k);
                        break;
                    case 6:
                        System.out.println("--- Cari Barang berdasarkan Index ---");
                        System.out.print(" - Masukkan Index Barang : ");
                        int index = inputInteger();
                        k = apl.getDaftarBarang();
                        System.out.println(k);
                        break;
                    case 7:
                        System.out.println("Show Gudang");
                        apl.ShowGudang();
                        break;
                    case 0:
                        break;
                }

            } catch (Exception e) {
                System.out.println("error : " + e.getMessage());
            } finally {
                IInt = new Scanner(System.in);
                IStr = new Scanner(System.in);
            }
        } while (pil != 0);
    }

    public void MenuPetugas() {
        int pil = 0;
        do {
            try {
                System.out.println("------ Menu Petugas -------");
                System.out.println(" 1. Create Petugas       ");
                System.out.println(" 2. Add Petugas         ");
                System.out.println(" 3. Remove Pettugas         ");
                System.out.println(" 4. Show All Petugas   ");
                System.out.println(" 5. Search Petugas by Index    ");
                System.out.println(" 6. Search Petugas by Id ");
                System.out.println(" 0. Kembali               ");
                System.out.println("---------------------------");
                System.out.print("- Pilih menu : ");
                pil = inputInteger();
                switch (pil) {
                    case 1:
                        System.out.println("--- Add Petugas ---");
                        System.out.println("Nama Petugas    : ");
                        String namaPtg = IStr.nextLine();
                        System.out.println("Alamat Petugas  : ");
                        String alamat = IStr.nextLine();
                        System.out.println("No.Hp   :");
                        String NoHp = IStr.nextLine();
                        Petugas p = new Petugas(namaPtg, alamat, NoHp);
                        apl.addPetugas(p);

                    case 2:
                        System.out.println("--- Remove Petugas ---");
                        System.out.print(" Id Petugas : ");
                        String id = IStr.nextLine();
                        apl.removePetugas(id);
                        break;
                    case 3:
                        System.out.println("--- Show All Petugas ---");
                        apl.viewListConsole(apl.ListPetugas());
                        break;
                    case 4:
                        System.out.println("--- Search Petugas by Id ---");
                        System.out.print(" Masukkan id Petugas : ");
                        id = IStr.nextLine();
                        Petugas k = apl.getPetugas(id);
                        System.out.println(k);
                        break;
                    case 5:
                        System.out.println("--- Search Petugas by Index ---");
                        System.out.print(" Masukkan index Petugas : ");
                        int index = inputInteger();
                        k = apl.getPetugas(index);
                        System.out.println(k);
                        break;
                    case 0:
                        break;
                }
            } catch (Exception e) {
                System.out.println("error : " + e.getMessage());
            } finally {
                IInt = new Scanner(System.in);
                IStr = new Scanner(System.in);
            }
        } while (pil != 0);
    }

//       public void menuPenyedia() {
//        int pil2 = 0;
//        do {
//            try {
//                System.out.println("-----Menu Penyedia-----");
//                System.out.println("1. Create Penyedia         ");
//                System.out.println("2. Add Penyedia         ");
//                System.out.println("3. Lihat Daftar Penyedia       ");
//                System.out.println("4. Remove Barang        ");
//                System.out.println("0. Kembali              ");
//                System.out.println("------------------------");
//                System.out.print("-Pilih Menu : ");
//                pil2 = inputInteger();
//                switch (pil2) {
//                    case 1:
//                        System.out.println("----Add Barang----");
//                        System.out.print("Nama : ");
//                        String NamaBarang = IStr.nextLine();
//                        System.out.print(" ID Barang            : ");
//                        String ID_Barang = IStr.nextLine();
//                        System.out.print(" Stok Barang          : ");
//                        int stokBarang = IInt.nextInt();
//                        System.out.print(" Tanggal Pembelian    : ");
//                        String tanggal_pembelian = IStr.nextLine();
//                        System.out.print(" Harga                : ");
//                        double hargaBarang = inputInteger();
//
//                        break;
//                    case 2:
//                        System.out.println("----Stock Barang----");
//
//                        break;
//                    case 3:
//                        System.out.println("----Detail Barang----");
//
//                        break;
//                    case 4:
//                        System.out.println("----Remove Barang----");
//                        System.out.println("- ID barang : ");
//                        String id3 = IStr.nextLine();
//
//                        break;
//                    case 0:
//                        break;
//                }
//            } catch (Exception e) {
////                System.out.println("Error : " +getMessage());
//            } finally {
//                IInt = new Scanner(System.in);
//                IStr = new Scanner(System.in);
//            }
//        } while (pil2 != 0);
//    }
    public void menuPenyedia() {
        int pil2 = 0;
        do {
            try {
                System.out.println("-----Menu Penyedia-----");
                System.out.println("1. Add Penyedia         ");
                System.out.println("2. Add Barang           ");
                System.out.println("3. Show Barang          ");
                System.out.println("4. Show Penyedia        ");
                System.out.println("0. Kembali              ");
                System.out.println("------------------------");
                System.out.print("-Pilih Menu : ");
                pil2 = inputInteger();
                switch (pil2) {
                    case 1:
                        System.out.println("----Add Penyedia----");
                        System.out.println("Nama    :           ");
                        String namakr = IStr.nextLine();
                        System.out.println("Alamat  :           ");
                        String alamatkr = IStr.nextLine();
                        System.out.println("NoHp    :           ");
                        String noHPkr = IStr.nextLine();
                        Penyedia kr = new Penyedia(namakr, alamatkr, noHPkr);
                        apl.addPenyedia(kr);
                        break;

                    case 2:
                        System.out.println("----Add Barang----");
                        System.out.print("Nama : ");
                        String Nama = IStr.nextLine();
                        System.out.print(" Jumlah Barang          : ");
                        int jmlBarang = IInt.nextInt();
                        System.out.print(" Tanggal Pembelian    : ");
                        String tanggal_pembelian = IStr.nextLine();
                        System.out.print(" Harga                : ");
                        double hargaBarang = inputInteger();
                        Barang h = new Barang(Nama, jmlBarang, tanggal_pembelian, hargaBarang);
//                        apl.addPenyedia(h);
                        break;
                    case 3:
                        System.out.println("----Show Barang----");
                        System.out.println("Nama                :   ");
                        String namab = IStr.nextLine();
                        System.out.println("jumlah barang       ");
                        apl.viewListConsole(apl.ListBarang());
                        break;
                    case 4:
                        System.out.println("----Show Penyedia----");
                        apl.viewListConsole(apl.ListPenyedia());
                        break;
                    case 0:
                        break;
                }
            } catch (Exception e) {
//                System.out.println("Error : " +getMessage());
            } finally {
                IInt = new Scanner(System.in);
                IStr = new Scanner(System.in);
            }
        } while (pil2 != 0);
    }

    public void mainMenu() {
        int pil = 0;
        do {
            try {
                System.out.println("------ Menu Utama -------");
                System.out.println("- 1. Kelola Gudang    ");
                System.out.println("- 2. Kelola Petugas      ");
                System.out.println("- 3. Kelola Penyedia");
                System.out.println("-------------------------");
                System.out.print("- Pilih menu : ");
                pil = inputInteger();
                switch (pil) {
                    case 1:
                        apl.loadGudang();
                        MenuGudang();
                        apl.saveGudang();
                        break;
                    case 2:
                        apl.loadPetugas();
                        MenuPetugas();
                        apl.savePetugas();
                        break;
                    case 3:
                        apl.loadPenyedia();
                        menuPenyedia();
                        apl.savePenyedia();
                        break;
                    case 0:
                        System.out.println("Thank You!!");
                }

            } catch (Exception e) {
                System.out.println("Error : " + e.getMessage());
            } finally {
                IInt = new Scanner(System.in);
                IStr = new Scanner(System.in);
            }

        } while (pil != 0);
    }
}
