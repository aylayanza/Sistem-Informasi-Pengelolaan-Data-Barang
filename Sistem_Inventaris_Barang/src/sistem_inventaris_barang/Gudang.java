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
    private int jmlBarang;
    private String idGudang;
    private String Lokasi;

    public String getLokasi() {
        return Lokasi;
    }

    public void setLokasi(String Lokasi) {
        this.Lokasi = Lokasi;
    }
    
    
    public Gudang(String id){
        this.idGudang = id;
    }

    public String getIdGudang() {
        return idGudang;
    }

    public void setIdGudang(String idGudang) {
        this.idGudang = idGudang;
    }
    
    public void addGudang(Barang b){
        if (jmlBarang<daftarBarang.length) {
        this.daftarBarang[jmlBarang] = b;   
        }
        this.jmlBarang++;
    }
    
//    public String getBarang(){
//        
//    } bingung isinya apa, soalnya pake index (liat class diagram di excel)
    
}
