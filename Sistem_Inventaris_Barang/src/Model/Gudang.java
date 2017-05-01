/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Farid Kiftirul Aziz
 */
public class Gudang implements Serializable {

    private ArrayList<Barang> daftarBarang;
    private String nama;
    private int jmlBarang;
    private final String idGudang;
    private String Lokasi;
    private static int countG = 1;

    public Gudang(String Lokasi) {
        this.daftarBarang = new ArrayList<Barang>();
        this.Lokasi = Lokasi;
        idGudang = "G-" + (countG++);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJmlBarang() {
        return jmlBarang;
    }

    public void setJmlBarang(int jmlBarang) {
        this.jmlBarang = jmlBarang;
    }

    public String getLokasi() {
        return Lokasi;
    }

    public void setLokasi(String Lokasi) {
        this.Lokasi = Lokasi;
    }

//    public Gudang(String id) {
//        this.idGudang = id;
//        daftarBarang = new ArrayList<>();
//    }
    public ArrayList<Barang> getDaftarBarang() {
        return daftarBarang;
    }

    public void setDaftarBarang(ArrayList<Barang> daftarBarang) {
        this.daftarBarang = daftarBarang;
    }

    public String getIdGudang() {
        return idGudang;
    }

//    public void setIdGudang(String idGudang) {
//        this.idGudang = idGudang;
//    }
    public void addBarang(Barang b) {
        this.daftarBarang.add(b);
    }

    public Barang getBarang(int idx) {
        return daftarBarang.get(idx);
    }

    public void removeBarang(String id) {
        for (int i = 0; i < jmlBarang; i++) {
            if (daftarBarang.get(i).getID_Barang().equals(id)) {
                daftarBarang.remove(i);
                break;
            }
        }
    }

    @Override
    public String toString() {
        String s = "Dafta Barang : " + daftarBarang
                + " Jumlah Barang : " + jmlBarang
                + " Id Gudang : " + idGudang
                + " Lokasi Gudang : " + Lokasi;
        return s;
    }

    public String toStringAll() {
        return idGudang + "," + jmlBarang + ",";
    }

}
