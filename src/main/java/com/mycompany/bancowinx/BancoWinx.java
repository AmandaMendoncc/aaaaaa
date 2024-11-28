package com.mycompany.bancowinx;

import com.mycompany.bancowinx.view.LoginScreen;

public class BancoWinx {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }
}
