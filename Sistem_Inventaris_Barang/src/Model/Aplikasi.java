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
    public Aplikasi() {
//        listOrang = new ArrayList();
        save = new FileIO();
        daftarPenyedia = new ArrayList();
        daftarGudang = new ArrayList();
        daftarPetugas = new ArrayList();
        daftarBarang = new ArrayList();
    }

    private ArrayList<Penyedia> daftarPenyedia = new ArrayList<>();
    private ArrayList<Petugas> daftarPetugas = new ArrayList<>();
    private ArrayList<Gudang> daftarGudang = new ArrayList<>();
    private ArrayList<Barang> daftarBarang = new ArrayList<>();
    private int jmlPenyedia;
    private int jmlPetugas;
    private int jmlGudang;
    private int jmlBarang;
    private FileIO save;

    public void addPenyedia(Penyedia p) {
        if (jmlPenyedia < daftarPenyedia.size()) {
            this.daftarPenyedia.add(p);
        }
        this.jmlPenyedia++;
    }

    public void addPetugas(Petugas q) {
        if (jmlPetugas < daftarPetugas.size()) {
            this.daftarPetugas.add(q);
        }
        this.jmlPetugas++;
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

    public Penyedia getPenyedia(int index) {
        Penyedia pny = daftarPenyedia.get(index);
        return pny;
    }

    public Petugas getPetugas(int index) {
        Petugas ptg = daftarPetugas.get(index);
        return ptg;
    }

    public void addGudang(Barang b) {
        if (jmlBarang < daftarBarang.size()) {
            this.daftarBarang.add(b);
        }
        this.jmlBarang++;
    }

    public void createBarang(String nama, String idBarang, int jmlBarang, String tgl, double harga) {
        Barang b = new Barang(nama, idBarang, jmlBarang, tgl, harga);
        daftarBarang.add(b);
    }

    public void removeBarang(String id) {
        for (int i = 0; i < jmlBarang; i++) {
            if (daftarBarang.get(i).getID_Barang().equals(id)) {
                daftarBarang.remove(i);
                break;
            }
        }
    }

    public void removePetugas(String id) {
        for (int i = 0; i < jmlPetugas; i++) {
            if (daftarPetugas.get(i).getIdPetugas().equals(id)) {
                daftarPetugas.remove(i);
                break;
            }
        }
    }

//    public void createBarang(String nama, String idBarang, int jmlBarang, String tgl, double harga) {
//        daftarBarang.add(new Barang(nama, idBarang, jmlBarang, tgl, harga));
//    }
    public void createPetugas(String nama, String alamat, int noHP) {
        Petugas ptg = new Petugas(nama, alamat, noHP);

    }

    public Barang getBarang(String Id) {
        return daftarBarang.stream()
                .filter(e -> e.getID_Barang().equals(Id))
                .findFirst().orElse(null);
    }

    public Barang getSetBarang(String Id) {
        Barang i = getBarang(Id);
        if ((i != null) && (i instanceof Barang)) {
            return i;
        } else {
            throw new IllegalStateException("Barang tidak ada");
        }
    }
    
    public Petugas getPetugasI(String Id){
        return daftarPetugas.stream()
                .filter(e -> e.getIdPetugas().equals(Id))
                .findFirst().orElse(null);
    }
    
    public Petugas getSetPetugas(String Id) {
        Petugas i = getPetugas(Id);
        if ((i != null) && (i instanceof Petugas)) {
            return i;
        } else {
            throw new IllegalStateException("Barang tidak ada");
        }
    }

    //Tambahan
    public void viewListConsole(String[] list) {
        Arrays.stream(list).forEach(System.out::println);
    }

    public String[] getListBarang() {
        List ID_Barang = daftarBarang.stream()
                .map(e -> e.toStringAll()).collect(Collectors.toList());
        return (String[]) ID_Barang.stream().toArray(size -> new String[size]);
    }

    public String[] getListPenyedia() {
        List idPenyedia = daftarPenyedia.stream()
                .map(e -> e.toStringAll()).collect(Collectors.toList());
        return (String[]) idPenyedia.stream().toArray(size -> new String[size]);
    }

    public String[] getListPetugas() {
        List idPetugas = daftarPetugas.stream()
                .map(e -> e.toStringAll()).collect(Collectors.toList());
        return (String[]) idPetugas.stream().toArray(size -> new String[size]);
    }

    public String[] getListGudang() {
        List idGudang = daftarGudang.stream()
                .map(e -> e.toStringAll()).collect(Collectors.toList());
        return (String[]) idGudang.stream().toArray(size -> new String[size]);
    }

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

}
