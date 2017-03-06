/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_inventaris_barang;

/**
 *
 * @author Farid Kiftirul Aziz
 */
public class Gudang {
    private Barang[] daftarBarang;
    private int jumlahBarang;
    private String ID_Barang;
    private String lokasi;

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public String getID_Barang() {
        return ID_Barang;
    }

    public void setID_Barang(String ID_Barang) {
        this.ID_Barang = ID_Barang;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    
    
}
