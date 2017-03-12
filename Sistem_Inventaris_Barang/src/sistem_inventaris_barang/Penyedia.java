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
public class Penyedia extends Orang {
    private String idPenyedia;
    private Barang[] daftarBarang;
    private int jmlBarang;
    
    
    public Penyedia(String nama, String alamat, String idPenyedia){
        super(nama,alamat);
        this.idPenyedia = idPenyedia;
    }
    
    public String getIdPenyedia() {
        return idPenyedia;
    }

    public void setIdPenyedia(String idPenyedia) {
        this.idPenyedia = idPenyedia;
    }

    public int getJmlBarang() {
        return jmlBarang;
    }

    public void setJmlBarang(int jmlBarang) {
        this.jmlBarang = jmlBarang;
    }
    
    public void addBarang(Barang newBarang){
        if(jmlBarang < daftarBarang.length){
            daftarBarang[jmlBarang] = newBarang;
        }
        jmlBarang++;
    }
    
    public Barang getDaftarBarang(int newDaftarBarang){
        return daftarBarang[newDaftarBarang];
    }
    
}
