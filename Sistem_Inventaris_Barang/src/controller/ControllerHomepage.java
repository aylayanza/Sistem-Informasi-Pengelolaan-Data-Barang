/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Aplikasi;
import Model.Petugas;
import Model.Barang;
import ViewGUI.Gudang;
import ViewGUI.MenuUtama;
import ViewGUI.Penyedia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Farid Kiftirul Aziz
 */
public class ControllerHomepage implements ActionListener {

    private MenuUtama gui;
    private Aplikasi model;
    private ViewGUI.Petugas view;
    private Penyedia view1;
    private Barang view2;
    private Gudang view3;

    public ControllerHomepage() {
        this.model = model;
        gui = new MenuUtama();
        view = new ViewGUI.Petugas();
        view.setVisible(false);
        view1 = new Penyedia();
        view1.setVisible(false);
        view2 = new Barang();
        view3 = new Gudang();
        gui.setVisible(true);
        gui.addactionlistener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(gui.getMPetugas())) {
            view.setVisible(true);
            gui.dispose();

        }
        if (o.equals(gui.getMpenyedia())) {
            view1.setVisible(true);
            gui.dispose();

        }
        if (o.equals(gui.getMbarang())) {
            view2.setVisible(true);
            gui.dispose();

        }
        if (o.equals(gui.getMgudang())) {
            view3.setVisible(true);
            gui.dispose();

        }
    }

}
