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
public abstract class Orang {
    private String nama;
    private String alamat;
    protected String noHP;
    
    public Orang(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public abstract String getNoHP();
    public abstract void setNoHP(String noHP);
    
    
}
