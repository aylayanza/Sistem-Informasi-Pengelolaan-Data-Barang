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
    private int jmlBarang;
    private final String idGudang;
    private String Lokasi;

    public String getLokasi() {
        return Lokasi;
    }

    public void setLokasi(String Lokasi) {
        this.Lokasi = Lokasi;
    }

    public Gudang(String id) {
        this.idGudang = id;
        daftarBarang = new ArrayList<>();
    }

    public String getIdGudang() {
        return idGudang;
    }

//    public void setIdGudang(String idGudang) {
//        this.idGudang = idGudang;
//    }

    public void addGudang(Barang b) {
        if (jmlBarang < daftarBarang.size()) {
            this.daftarBarang.add(b);
        }
        this.jmlBarang++;
    }

    public Barang getBarang(int idx){
        return daftarBarang.get(idx);
    } 
    
    public void removeBarang(String id){
        for (int i = 0; i < jmlBarang; i++) {
            if (daftarBarang.get(i).getID_Barang().equals(id)) {
                daftarBarang.remove(i);
                break;
            }
        }
    }

    @Override
    public String toString() {
        String s = "Dafta Barang : "+daftarBarang
                +" Jumlah Barang : "+jmlBarang
                +" Id Gudang : "+ idGudang
                +" Lokasi Gudang : "+Lokasi;
        return s;
    }
    
    public String toStringAll(){
        return idGudang + "," + jmlBarang + "," ;
    }
    
}

