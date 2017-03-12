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
public class Aplikasi {
    private Penyedia[] daftarPenyedia;
    private Petugas[] daftarPetugas;
    private Gudang[] daftarGudang;
    private int jmlPenyedia;
    private int jmlPetugas;
    private int jmlGudang;
   
    
    public void addPenyedia(Penyedia p){
        if(jmlPenyedia < daftarPenyedia.length){
            this.daftarPenyedia[jmlPenyedia] = p;
        }
        this.jmlPenyedia++;
    }
    
    public void addPetugas(Petugas q){
        if(jmlPetugas < daftarPetugas.length){
            this.daftarPetugas[jmlPetugas] = q;
        }
        this.jmlPetugas++;
    }
    
//    public Petugas getPetugas(String id){
//        
//    } bingung isi nya apa, kalo di return Petugas gabisa karna di dalam class ini gak ada petugas
}
