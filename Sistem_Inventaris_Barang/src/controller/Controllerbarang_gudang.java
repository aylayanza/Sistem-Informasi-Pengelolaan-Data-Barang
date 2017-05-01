/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Aplikasi;
import ViewGUI.Viewgudang;
import ViewGUI.Viewenyedia;
import ViewGUI.Viewpetugas;
import ViewGUI.Addbarang_gudang;
import ViewGUI.Addbarang_penyedia;
import ViewGUI.Addbarang_petugas;
import ViewGUI.Addpenyedia_penyedia;
import ViewGUI.Create;
import ViewGUI.Login;
import ViewGUI.MainMenu;
import ViewGUI.MenuUtama;
import ViewGUI.Showbarang_penyedia;
import ViewGUI.Showbarang_petugas;
import ViewGUI.Showpenyedia_penyedia;
import ViewGUI.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Farid Kiftirul Aziz //
 */
//public class Controllerbarang_gudang implements ActionListener {
//
//    private ViewGUI.Petugas viewPtg;
//    private Aplikasi apk;
//
//    public Controllerbarang_gudang() {
//        viewPtg = new ViewGUI.Petugas();
//        viewPtg.setVisible(true);
//        viewPtg.ActionListener(this);
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        Object o = e.getSource();
//
//        if (o.equals(viewPtg.getadd_bpt(viewPtg.getAdd_bpt()))) {
//
//        }
//    }
//}
public class Controllerbarang_gudang extends MouseAdapter implements ActionListener {

    private Aplikasi apk;

    private View viewW;

    public Controllerbarang_gudang(Aplikasi apk) {
        this.apk = apk;

        MainMenu m = new MainMenu();
        m.setVisible(true);
        m.addListener(this);
        viewW = (View) m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (viewW instanceof MainMenu) {
            MainMenu m = (MainMenu) viewW;
            if (source.equals(m.getBtnPetugas())) {
                Addbarang_petugas A = new Addbarang_petugas();
                A.setVisible(true);
                A.addListener(this);
                m.dispose();
                viewW = (View) A;
            } else if (source.equals(m.getBtnPenyedia())) {
                Addpenyedia_penyedia pny = new Addpenyedia_penyedia();
                pny.setVisible(true);
                pny.addListener(this);
                m.dispose();
                viewW = (View) pny;
            } else if (source.equals(m.getBtnLogin())) {
                Login L = new Login();
                L.setVisible(true);
                L.addListener(this);
                m.dispose();
                viewW = (View) L;
            }
        } else if (viewW instanceof Addbarang_petugas) {
            Addbarang_petugas A = (Addbarang_petugas) viewW;
            if (source.equals(A.getBtnBack())) {
                MainMenu m = new MainMenu();
                m.setVisible(true);
                m.addListener(this);
                A.dispose();
                viewW = (View) m;
            }

        }
    }
//public class Controllerbarang_gudang extends MouseAdapter implements ActionListener {
//
//    private Aplikasi apl;
//
//
//    private String currentView;
//    private JPanel mainPanel;
//
//    private MainMenu m;
//    private MenuUtama mu;
//    private Addbarang_gudang brggd;
//    private Addbarang_penyedia brgpny;
//    private Addpenyedia_penyedia pnypny;
//    private Create crt;
//    private Viewgudang gdg;
//    private Login lgn;
//    private Viewenyedia pn;
//    private Viewpetugas pt;
//    private Showbarang_penyedia sbpny;
//    private Showbarang_petugas sptg;
//    private Showpenyedia_penyedia spny;
//    
//
//    public Controllerbarang_gudang(Aplikasi apl) {
//        this.apl = apl;
//        m = new MainMenu();
//        mu = new MenuUtama();
//        brggd = new Addbarang_gudang();
//        brgpny = new Addbarang_penyedia();
//        pnypny = new Addpenyedia_penyedia();
//        crt = new Create();
//        lgn = new Login();
//        gdg = new Viewgudang();
//        pn = new Viewenyedia();
//        pt = new Viewpetugas();
//        sbpny = new Showbarang_penyedia();
//        sptg = new Showbarang_petugas();
//        spny = new Showpenyedia_penyedia();
//        
//        m.addListener(this);
//        mu.addListener(this);
//        brgpny.addListener(this);
//        brggd.addListener(this);
//        brgpny.addListener(this);
//        crt.addListener(this);
//        lgn.addListener(this);
//        gdg.addListener(this);
//        pn.addListener(this);
//        pt.addListener(this);
//        sbpny.addListener(this);
//        sptg.addListener(this);
//        spny.addListener(this);

}
