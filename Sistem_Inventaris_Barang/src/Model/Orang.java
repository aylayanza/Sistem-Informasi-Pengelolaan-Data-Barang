/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Farid Kiftirul Aziz
 */
public abstract class Orang implements Serializable{
    private String nama;
    private String alamat;
    protected String noHP;
    private String Username;
    private String Password;
    
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

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    

    public abstract String getNoHP();
    public abstract void setNoHP(String noHP);

    @Override
    public String toString() {
        String s = "Nama : "+ nama
                +" Alamat : " + alamat
                +" NoHp : " + noHP;
        return s;
    }
    
    
    
    
}
