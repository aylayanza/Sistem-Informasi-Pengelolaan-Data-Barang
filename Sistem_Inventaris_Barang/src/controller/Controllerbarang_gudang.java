/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Aplikasi;
import Model.Petugas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Farid Kiftirul Aziz
 */
public class Controllerbarang_gudang implements ActionListener {

    private ViewGUI.Petugas viewPtg;
    private Aplikasi apk;

    public Controllerbarang_gudang() {
        viewPtg = new ViewGUI.Petugas();
        viewPtg.setVisible(true);
        viewPtg.ActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        
        if (o.equals(viewPtg.getadd_bpt(viewPtg.getAdd_bpt()))){
            
        }
        
    

}
