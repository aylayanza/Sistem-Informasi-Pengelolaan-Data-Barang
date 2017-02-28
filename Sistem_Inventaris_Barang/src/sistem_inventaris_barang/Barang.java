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
public class Barang {
    private String NamaBarang;
    private String ID_Barang;
    private int jumlahBarang;
    private int tanggal_pembelian;

    public String getNamaBarang() {
        return NamaBarang;
    }

    public void setNamaBarang(String NamaBarang) {
        this.NamaBarang = NamaBarang;
    }

    public String getID_Barang() {
        return ID_Barang;
    }

    public void setID_Barang(String ID_Barang) {
        this.ID_Barang = ID_Barang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public int getTanggal_pembelian() {
        return tanggal_pembelian;
    }

    public void setTanggal_pembelian(int tanggal_pembelian) {
        this.tanggal_pembelian = tanggal_pembelian;
    }
    
    
}
