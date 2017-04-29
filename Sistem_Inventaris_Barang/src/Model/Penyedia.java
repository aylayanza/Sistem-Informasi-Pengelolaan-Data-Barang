/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author Farid Kiftirul Aziz
 */
public class Penyedia extends Orang implements Serializable{

    private final String idPenyedia;
    private ArrayList<Barang> daftarBarang;
    private int jmlBarang;

    public Penyedia(String nama, String alamat, String idPenyedia) {
        super(nama, alamat);
        this.idPenyedia = idPenyedia;
    }

    public String getIdPenyedia() {
        return idPenyedia;
    }

//    public void setIdPenyedia(String idPenyedia) {
//        this.idPenyedia = idPenyedia;
//    }

    public int getJmlBarang() {
        return jmlBarang;
    }

    public void setJmlBarang(int jmlBarang) {
        this.jmlBarang = jmlBarang;
    }

    public void createBarang(String nama, String idBarang, int jmlBarang, String tgl, double harga) {
        Barang b = new Barang(nama, idBarang, jmlBarang, tgl, harga);
        daftarBarang.add(b);
    }

//    public void addBarang(Barang newBarang){
//        if(jmlBarang < daftarBarang.length){
//            daftarBarang[jmlBarang] = newBarang;
//        }
//        jmlBarang++;
//    }
    
    public Barang getDaftarBarang(int newDaftarBarang) {
        return daftarBarang.get(jmlBarang);
    }

    @Override
    public String getNoHP() {
        return super.noHP;
    }

    @Override
    public void setNoHP(String noHP) {
        super.noHP = noHP;
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
        String s = "Id Penyedia : "+ idPenyedia
                +" Daftar Barang : "+daftarBarang
                +" Jumlah Barang : "+jmlBarang;
        return s;
    }

    public String toStringAll() {
        return idPenyedia + " , " + getNama() + " , " +getAlamat() + " , " + daftarBarang;
    }
    
    

}
