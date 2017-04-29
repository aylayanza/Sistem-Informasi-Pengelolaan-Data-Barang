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
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Kukuh Rahingga P
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
                System.out.println("- 1. Add Barang       ");
                System.out.println("- 2. Remove Barang         ");
                System.out.println("- 3. Lihat semua Barang   ");
                System.out.println("- 4. Cari Barang berdasarkan Index    ");
                System.out.println("- 5. Cari Barang berdasarkan ID ");
                System.out.println("- 0. Kembali                 ");
                System.out.println("-----------------------------");
                System.out.print("- Pilih menu : ");
                pil = inputInteger();
                switch (pil) {
                    case 1:
                        System.out.println("--- Add Barang ---");
                        System.out.print(" Nama Barang        : ");
                        String nama = IStr.nextLine();
                        System.out.print(" ID Barang          : ");
                        String idBarang = IStr.nextLine();
                        System.out.print(" Stok Barang        : ");
                        int jmlBarang = IInt.nextInt();
                        System.out.print(" Tanggal Pembelian  : ");
                        String tgl = IStr.nextLine();
                        System.out.print(" Harga Barang       : ");
                        double harga = inputInteger();
                        apl.createBarang(nama, idBarang, jmlBarang, tgl, harga);
                        break;

                    case 2:
                        System.out.println("--- Remove Barang ---");
                        System.out.print(" - Id Barang : ");
                        String id = IStr.nextLine();
                        apl.removeBarang(id);
                        break;
                    case 3:
                        System.out.println("--- Lihat semua Barang ---");
                        apl.viewListConsole(apl.getListBarang());
                        break;
                    case 4:
                        System.out.println("--- Cari Barang berdasarkan Index ---");
                        System.out.print(" - Masukkan Index Barang : ");
                        int index = inputInteger();

                        break;
                    case 5:
                        System.out.println("--- Cari Barang berdasarkan Id ---");
                        System.out.print(" - Masukkan Id Barang : ");
                        id = IStr.nextLine();

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
                        System.out.println("--- Create Petugas ---");
                        System.out.println("Id Petugas  ");String IdPetugas = IStr.nextLine();
                        System.out.print(" Nama           : ");
                        String nama = IStr.nextLine();
                        System.out.print(" Alamat        : ");
                        String jabatan = IStr.nextLine();
                        System.out.print(" NoHp           : ");
                        int noHp = IStr.nextInt();
                        apl.createPetugas(nama, jabatan, noHp);
                        break;
                    case 2:
                        System.out.println("--- Add Petugas ---");
                        System.out.println("Nama Petugas    : ");
                        String namaPtg = IStr.nextLine();
                        System.out.println("Alamat Petugas  : ");
                        String alamat = IStr.nextLine();
                        System.out.println("Id Petugas  :");
                        String idPetugas = IStr.nextLine();

                    case 3:
                        System.out.println("--- Remove Petugas ---");
                        System.out.print(" Id Petugas : ");
                        String id = IStr.nextLine();
                        apl.removePetugas(id);

                        break;
                    case 4:
                        System.out.println("--- Show All Petugas ---");

                        break;
                    case 5:
                        System.out.println("--- Search Petugas by Index ---");
                        System.out.print(" Masukkan index Petugas : ");
                        int index = inputInteger();

                        break;
                    case 6:
                        System.out.println("--- Search Petugas by Id ---");
                        System.out.print(" Masukkan id Petugas : ");
                        id = IStr.nextLine();

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
                System.out.println("1. Add Barang           ");
                System.out.println("2. Stock Barang         ");
                System.out.println("3. Detail Barang        ");
                System.out.println("4. Remove Barang        ");
                System.out.println("0. Kembali              ");
                System.out.println("------------------------");
                System.out.print("-Pilih Menu : ");
                pil2 = inputInteger();
                switch (pil2) {
                    case 1:
                        System.out.println("----Add Barang----");
                        System.out.print("Nama : ");
                        String NamaBarang = IStr.nextLine();
                        System.out.print(" ID Barang            : ");
                        String ID_Barang = IStr.nextLine();
                        System.out.print(" Stok Barang          : ");
                        int stokBarang = IInt.nextInt();
                        System.out.print(" Tanggal Pembelian    : ");
                        String tanggal_pembelian = IStr.nextLine();
                        System.out.print(" Harga                : ");
                        double hargaBarang = inputInteger();

                        break;
                    case 2:
                        System.out.println("----Stock Barang----");

                        break;
                    case 3:
                        System.out.println("----Detail Barang----");

                        break;
                    case 4:
                        System.out.println("----Remove Barang----");
                        System.out.println("- ID barang : ");
                        String id3 = IStr.nextLine();

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

//    public void MenuBarang() {
//        int pil3 = 0;
//        do {
//            try {
//                System.out.println("-----Menu Penyedia-----");
//                System.out.println("1. Create Barang        ");
//                System.out.println("2. Show All Barang         ");
//                System.out.println("3. Remove Barang by Id      ");
//                System.out.println("4. Remove Barang by Index       ");
//                System.out.println("0. Kembali               ");
//                System.out.println("------------------------");
//                System.out.print("-Pilih Menu : ");
//                pil3 = inputInteger();
//                switch (pil3) {
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
//        } while (pil3 != 0);
//    }
    public void mainMenu() {
        int pil = 0;
        do {
            try {
                System.out.println("------ Menu Utama -------");
                System.out.println("- 1. Kelola Gudang    ");
                System.out.println("- 2. Kelola Petugas      ");
                System.out.println("- 3. Kelola Penyedia");
                System.out.println("- 4. Kelola Barang");
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
