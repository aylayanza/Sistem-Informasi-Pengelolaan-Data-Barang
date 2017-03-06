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
public class Penyedia {
    private int idPenyedia;
    private Barang[] daftarBarang;
    private int jumlahBarang;

    public int getIdPenyedia() {
        return idPenyedia;
    }

    public void setIdPenyedia(int idPenyedia) {
        this.idPenyedia = idPenyedia;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
    
    
}
