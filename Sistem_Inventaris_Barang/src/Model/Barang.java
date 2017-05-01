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
public class Barang implements Serializable {

    private String NamaBarang;
    private final String ID_Barang;
    private int stokBarang;
    private String tanggal_pembelian;
    private double hargaBarang;
    private ArrayList<Gudang> daftarGudang;
    private static int countBr = 1;

    public Barang(String NamaBarang, int stokBarang, String tanggal_pembelian, double hargaBarang) {
        this.NamaBarang = NamaBarang;
        this.stokBarang = stokBarang;
        this.tanggal_pembelian = tanggal_pembelian;
        this.hargaBarang = hargaBarang;
        ID_Barang = "B-" + (countBr++);
        this.daftarGudang = daftarGudang;
    }

    public String getNamaBarang() {
        return NamaBarang;
    }

    public void setNamaBarang(String NamaBarang) {
        this.NamaBarang = NamaBarang;
    }

    public String getID_Barang() {
        return ID_Barang;
    }

//    public void setID_Barang(String ID_Barang) {
//        this.ID_Barang = ID_Barang;
//    }
    public int getStokBarang() {
        return stokBarang;
    }

    public void setStokBarang(int stokBarang) {
        this.stokBarang = stokBarang;
    }

    public String getTanggal_pembelian() {
        return tanggal_pembelian;
    }

    public void setTanggal_pembelian(String tanggal_pembelian) {
        this.tanggal_pembelian = tanggal_pembelian;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    @Override
    public String toString() {
        String s = "Nama Barang : " + NamaBarang + "\n"
                + "Id Barang : " + ID_Barang + "\n"
                + "Stok Barang : " + stokBarang + "\n"
                + "Tanggal Pembelian : " + tanggal_pembelian + "\n"
                + "Harga Barang : " + hargaBarang;
        return s;
    }

    public String toStringAll() {
        return ID_Barang + "," + getNamaBarang() + "," + getStokBarang() + "," + getTanggal_pembelian() + "," + hargaBarang;
    }

    public ArrayList<Gudang> getDaftarGudang() {
        return daftarGudang;
    }

    public void setDaftarGudang(ArrayList<Gudang> daftarGudang) {
        this.daftarGudang = daftarGudang;
    }

    public Barang(String ID_Barang, ArrayList<Gudang> daftarGudang) {
        this.ID_Barang = ID_Barang;
        this.daftarGudang = daftarGudang;
    }



}


