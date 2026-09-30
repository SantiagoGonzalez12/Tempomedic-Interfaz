/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tempomedic;

import com.tempomedic.vista.VentanaLogin;

/**
 *
 * @author Santiago González
 */
public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaLogin login = new VentanaLogin();
                login.setLocationRelativeTo(null);
                login.setVisible(true);
            }
        });
    }
    
}
