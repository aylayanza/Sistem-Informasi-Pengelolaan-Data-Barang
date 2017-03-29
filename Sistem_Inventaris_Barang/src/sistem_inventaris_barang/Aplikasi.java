/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_inventaris_barang;

import java.util.ArrayList;

/**
 *
 * @author Farid Kiftirul Aziz
 */
public class Aplikasi {

    private ArrayList<Penyedia> daftarPenyedia = new ArrayList<>();
    private ArrayList<Petugas> daftarPetugas = new ArrayList<>();
    private ArrayList<Gudang> daftarGudang = new ArrayList<>();
    private int jmlPenyedia;
    private int jmlPetugas;
    private int jmlGudang;

    public void addPenyedia(Penyedia p) {
        if (jmlPenyedia < daftarPenyedia.size()) {
            this.daftarPenyedia.add(p);
        }
        this.jmlPenyedia++;
    }

    public void addPetugas(Petugas q) {
        if (jmlPetugas < daftarPetugas.size()) {
            this.daftarPetugas.add(q);
        }
        this.jmlPetugas++;
    }

    public Petugas getPetugas(String id) {
        Petugas p = null;
        for (int i = 0; i < jmlPetugas; i++) {
            if (daftarPetugas.get(i).getIdPetugas().equals(id)) {
                p = daftarPetugas.get(i);
                break;
            }
        }
        return p;
    }
}
