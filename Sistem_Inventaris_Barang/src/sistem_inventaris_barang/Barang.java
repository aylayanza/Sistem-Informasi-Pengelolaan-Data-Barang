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
    private double harga;
    private int stock;

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

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
