/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import database.FileIO;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.List;

/**
 *
 * @author Farid Kiftirul Aziz
 */
public class Aplikasi {

//    private ArrayList<Orang> listOrang;
//    private FileIO save;
//    public Aplikasi() {
////        listOrang = new ArrayList();
//        save = new FileIO();
//        daftarPenyedia = new ArrayList();
//        daftarGudang = new ArrayList();
//        daftarPetugas = new ArrayList();
//
//    }
    private ArrayList<Penyedia> daftarPenyedia = new ArrayList<>();
    private ArrayList<Petugas> daftarPetugas = new ArrayList<>();
    private ArrayList<Gudang> daftarGudang = new ArrayList<>();
    private ArrayList<Barang> daftarBarang = new ArrayList<>();
    private FileIO save;
    private int jmlPenyedia = 15;
    private int jmlPetugas = 5;
    private int jmlGudang = 10;
    private int jmlBarang = 10;

    //Coba-coba
//    public Penyedia getDaftarBarang() {
//        return getDaftarBarang();
//    }
    public Aplikasi() {

        this.save = new FileIO();
    }

    public Penyedia getDaftarBarang() {
        return getDaftarBarang();
    }
//
//    public void createBarang(Barang b) throws IOException {
////        Barang b = new Barang(nama, idBarang, jmlBarang, tgl, harga);
//        daftarBarang.add(b);
////        saveBarang();
//    }

    public void removeBarang(String id) {
        for (int i = 0; i < daftarPenyedia.size(); i++) {
            if (daftarBarang.get(i).getID_Barang().equals(id)) {
                daftarBarang.remove(i);
                break;
            }
        }
    }

    public void savebarangtofile() {
        for (int i = 0; i < daftarPenyedia.size(); i++) {
            for (int j = 0; j < daftarPenyedia.get(i).getDaftarBarang().size(); j++) {
                daftarBarang.add(daftarPenyedia.get(i).getDaftarBarang().get(j));

            }
        }
    }

    public ArrayList<Barang> getListDaftarBarang() {
        return daftarBarang;
    }

    public ArrayList<Gudang> getListDaftarGudang() {
        return daftarGudang;
    }

    public Gudang searchGudang(String Lokasi) {
        for (int i = 0; i < daftarGudang.size(); i++) {
            if (daftarGudang.get(i).getLokasi().equals(Lokasi)) {
                return daftarGudang.get(i);
            }
        }
        return null;
    }

    public ArrayList<Petugas> getListDaftarPetugas() {
        return daftarPetugas;
    }

    public ArrayList<Penyedia> getListDaftarPenyedia() {
        return daftarPenyedia;
    }

    public String[] ListBarang() throws IOException {
        List listbarang = daftarBarang.stream().map(E -> "ID Barang : " + E.getID_Barang() + ", "
                + "Nama Barang : " + E.getNamaBarang()).collect(Collectors.toList());
        return (String[]) listbarang.stream().toArray(arr -> new String[arr]);
    }

    public Petugas getPetugas(String id) {
        Petugas p = null;
        for (int i = 0; i < jmlPetugas; i++) {
            if (daftarPetugas.get(i).getIdPetugas().equals(id)) {
                p = daftarPetugas.get(i);
                break;
            }
        }
        return p;
    }

    public void addPetugas(Petugas p) throws IOException {
        daftarPetugas.add(p);
    }

    public void removePetugas(String id) {
        for (int i = 0; i < jmlPetugas; i++) {
            if (daftarPetugas.get(i).getIdPetugas().equals(id)) {
                daftarPetugas.remove(i);
                break;
            }
        }
    }

    public String[] ListPetugas() throws IOException {
        List listpetugas = daftarPetugas.stream().map(E -> "ID Petugas : " + E.getIdPetugas()).collect(Collectors.toList());
        return (String[]) listpetugas.stream().toArray(arr -> new String[arr]);
    }

    public void addPenyedia(Penyedia e) throws IOException {
        daftarPenyedia.add(e);
    }

    public Penyedia getPenyedia(String id) {
        Penyedia p = null;
        for (int i = 0; i < jmlPenyedia; i++) {
            if (daftarPenyedia.get(i).getIdPenyedia().equals(id)) {
                p = daftarPenyedia.get(i);
                break;
            }
        }
        return p;
    }

    public String[] ListPenyedia() throws IOException {
        List listpenyedia = daftarPenyedia.stream().map(E -> "ID Penyedia : " + E.getIdPenyedia()).collect(Collectors.toList());
        return (String[]) listpenyedia.stream().toArray(arr -> new String[arr]);
    }

    //Login Petugas
    public boolean loginPetugas(String Username, String Password) {
        for (Petugas ptg : daftarPetugas) {
            if (ptg.getUsername().equals(Username) && ptg.getPassword().equals(Password)) {
                return true;
            }
        }
        return false;
    }

    //Login Penyedia
    public boolean LoginPenyedia(String Username, String Password) {
        for (Penyedia pny : daftarPenyedia) {
            if (pny.getUsername().equals(Username) && pny.getPassword().equals(Password)) {
                return true;
            }
        }
        return false;
    }

//    //Barang
//    public Barang getBarang(String Id) {
//        return daftarBarang.stream()
//                .filter(e -> e.getID_Barang().equals(Id))
//                .findFirst().orElse(null);
//    }
//
    public Penyedia getSetBarang(String Id) {
        Penyedia i = getDaftarBarang();
        if ((i != null) && (i instanceof Penyedia)) {
            return i;
        } else {
            throw new IllegalStateException("Barang tidak ada");
        }
    }
//
    public Barang getBarangByIndeks(int indeks) {
        Barang k = daftarBarang.get(indeks);
        return k;

    }
//
//    public void createBarang(String nama, String idBarang, int jmlBarang, String tgl, double harga) {
//        Barang b = new Barang(nama, idBarang, jmlBarang, tgl, harga);
//        daftarBarang.add(b);
//    }
//
//    //Bara
//
// 
//
// 
//
////    public Barang getBarang(String id) {
////        return daftarBarang.stream()
////                .filter(b -> b.getID_Barang().equals(idBarang))
////                .findFirst().orElse(null);
////    }
//
//
//    //enyedia
//    public void addPenyedia(Penyedia p) {
//        if (jmlPenyedia < daftarPenyedia.size()) {
//            this.daftarPenyedia.add(p);
//        }
//        this.jmlPenyedia++;
//    }
//
//
//    public Penyedia getPenyedia(int index) {
//        Penyedia pny = daftarPenyedia.get(index);
//        return pny;
//    }
//
//    public void createPenyedia(String nama, String alamat, String idPenyedia, int noHP) {
//        Penyedia pny = new Penyedia(nama, alamat, idPenyedia, noHP);
//        daftarPenyedia.add(pny);
//    }
//
//    //Petugas
////    public void addPetugas(Petugas q) {
////        if (jmlPetugas < daftarPetugas.size()) {
////            this.daftarPetugas.add(q);
////        }
////        this.jmlPetugas++;
////    }
//   
//
//

    public Petugas getPetugas(int index) {
        Petugas ptg = daftarPetugas.get(index);
        return ptg;
    }
//

    public void addGudang(Gudang g) {
        if (jmlGudang > daftarGudang.size()) {
            this.daftarGudang.add(g);
        }
    }
//
//
//
//
////    public void createBarang(String nama, String idBarang, int jmlBarang, String tgl, double harga) {
////        daftarBarang.add(new Barang(nama, idBarang, jmlBarang, tgl, harga));
////    }
//    public void createPetugas(String nama, String alamat, int noHP) {
//        Petugas ptg = new Petugas(nama, alamat, noHP);
//
//    }
//
//    public Petugas getPetugasI(String Id) {
//        return daftarPetugas.stream()
//                .filter(e -> e.getIdPetugas().equals(Id))
//                .findFirst().orElse(null);
//    }
//
//    public Petugas getSetPetugas(String Id) {
//        Petugas i = getPetugas(Id);
//        if ((i != null) && (i instanceof Petugas)) {
//            return i;
//        } else {
//            throw new IllegalStateException("Barang tidak ada");
//        }
//    }
//
//    //Tambahan

    public void viewListConsole(String[] list) {
        Arrays.stream(list).forEach(System.out::println);
    }

    public void viewBarang() {
        for (int i = 0; i < daftarGudang.size(); i++) {
            System.out.println("Lokasi Gudang : " + daftarGudang.get(i).getLokasi());
            System.out.println(daftarGudang.get(i).getDaftarBarang().size()+"");
            for (int j = 0; j < daftarGudang.get(i).getDaftarBarang().size(); j++) {
                System.out.println("Nama Barang :" + daftarGudang.get(i).getDaftarBarang().get(j).getNamaBarang());
                System.out.println("Id Barang :" + daftarGudang.get(i).getDaftarBarang().get(j).getID_Barang());
                System.out.println("Tanggal Pembelian :" + daftarGudang.get(i).getDaftarBarang().get(j).getTanggal_pembelian());
                System.out.println("Nama Barang :" + daftarGudang.get(i).getDaftarBarang().get(j).getStokBarang());
                System.out.println("Harga Barang :" + daftarGudang.get(i).getDaftarBarang().get(j).getHargaBarang());
                
            }
        }
    }

    public void ShowGudang() {
        System.out.println(daftarGudang.size() + "");
        for (int i = 0; i < daftarGudang.size(); i++) {
            System.out.println("Lokasi Gudang : " + daftarGudang.get(i).getLokasi());
        }

    }
//   
//

    public String[] getListPenyedia() {
        List idPenyedia = daftarPenyedia.stream()
                .map(e -> e.toStringAll()).collect(Collectors.toList());
        return (String[]) idPenyedia.stream().toArray(size -> new String[size]);
    }
//
//    public String[] getListPetugas() {
//        List idPetugas = daftarPetugas.stream()
//                .map(e -> e.toStringAll()).collect(Collectors.toList());
//        return (String[]) idPetugas.stream().toArray(size -> new String[size]);
//    }
//
//    public String[] getListGudang() {
//        List idGudang = daftarGudang.stream()
//                .map(e -> e.toStringAll()).collect(Collectors.toList());
//        return (String[]) idGudang.stream().toArray(size -> new String[size]);
//    }
    //Database Barang

    public void loadBarang() throws FileNotFoundException, IOException {
        try {
            daftarBarang = (ArrayList<Barang>) save.getObject("FileBarang.dat");
        } catch (FileNotFoundException ex) {
            File f = new File("FileBarang.dat");
            f.createNewFile();
        } catch (EOFException ex) {
            daftarBarang = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }

    public void saveBarang() throws FileNotFoundException, IOException {
        try {
            save.saveObject(daftarBarang, "FileBarang.dat");
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("file not found");
        } catch (IOException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }

    //Database Penyedia
    public void loadPenyedia() throws FileNotFoundException, IOException {
        try {
            daftarPenyedia = (ArrayList<Penyedia>) save.getObject("FilePenyedia.dat");
        } catch (FileNotFoundException ex) {
            File f = new File("FilePenyedia.dat");
            f.createNewFile();
        } catch (EOFException ex) {
            daftarPenyedia = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }

    public void savePenyedia() throws FileNotFoundException, IOException {
        try {
            save.saveObject(daftarPenyedia, "FilePenyedia.dat");
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("file not found");
        } catch (IOException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }

    //Database Petugas
    public void loadPetugas() throws FileNotFoundException, IOException {
        try {
            daftarPetugas = (ArrayList<Petugas>) save.getObject("FilePetugas.dat");
        } catch (FileNotFoundException ex) {
            File f = new File("FilePentugas.dat");
            f.createNewFile();
        } catch (EOFException ex) {
            daftarPetugas = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }

    public void savePetugas() throws FileNotFoundException, IOException {
        try {
            save.saveObject(daftarPetugas, "FilePetugas.dat");
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("file not found");
        } catch (IOException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }

    //Database Barang
    public void loadGudang() throws FileNotFoundException, IOException {
        try {
            daftarGudang = (ArrayList<Gudang>) save.getObject("FileGudang.dat");
        } catch (FileNotFoundException ex) {
            File f = new File("FileGudang.dat");
            f.createNewFile();
        } catch (EOFException ex) {
            daftarGudang = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }

    public void saveGudang() throws FileNotFoundException, IOException {
        try {
            save.saveObject(daftarGudang, "FileGudang.dat");
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("file not found");
        } catch (IOException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }

//    public String ambilString(String idPenyedia, Penyedia p, Gudang g) {
//        Penyedia p = getPenyedia(idPenyedia);
//        Barang b = p.getBarang)();
//        Gudang g = b.getID_Barang();
//        
//        String s = "";
//        s = s + p.toString();
//        return s;
//        
//    }
}
