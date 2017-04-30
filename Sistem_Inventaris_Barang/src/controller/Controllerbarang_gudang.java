/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Aplikasi;
import Model.Petugas;
import ViewGUI.Addbarang_petugas;
import ViewGUI.Addpenyedia_penyedia;
import ViewGUI.Login;
import ViewGUI.MainMenu;
import ViewGUI.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.IOException;
import javax.swing.JOptionPane;

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
        m.addactionlistener(this);
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
                A.ActionListener(this);
                m.dispose();
                viewW = (View) A;
            } else if (source.equals(m.getBtnPenyedia())) {
                Addpenyedia_penyedia pny = new Addpenyedia_penyedia();
                pny.setVisible(true);
                pny.ActionListener(this);
                m.dispose();
                viewW = (View) pny;
            } else if (source.equals(m.getBtnLogin())) {
                Login L = new Login();
                L.setVisible(true);
                L.addListener(this);
                m.dispose();
                viewW = (View) L;
            }
            
        }
    }
}
