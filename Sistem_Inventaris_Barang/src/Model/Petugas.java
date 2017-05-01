/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.stream.Stream;

/**
 *
 * @author Farid Kiftirul Aziz
 */
public class Petugas extends Orang implements Serializable {

    private static int countP = 1;

    private final String idPetugas;

    public Petugas(String nama, String alamat,String noHp) {
        super(nama, alamat);
        idPetugas = "P-" + (countP++);
        setNoHP(noHp);
    }

    

    public String getIdPetugas() {
        return idPetugas;
    }

//    public void setIdPetugas(String idPetugas) {
//        this.idPetugas = idPetugas;
//    }
    @Override
    public String getNoHP() {
        return super.noHP;
    }

    @Override
    public void setNoHP(String noHP) {
        super.noHP = noHP;
    }

    
    @Override
    public String toString() {
        String s = "Id Petugas : " + idPetugas;
        return s;
    }

    public String toStringAll() {
        return idPetugas + " , " + getNama() + " , " + getNoHP() + " , " + getAlamat();

    }

}
