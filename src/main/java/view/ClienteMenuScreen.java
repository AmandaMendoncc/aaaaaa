package com.mycompany.bancowinx.view;

import javax.swing.*;
import java.awt.*;

public class ClienteMenuScreen extends JFrame {
    public ClienteMenuScreen() {
        setTitle("Banco Winx - Menu Cliente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(6, 1, 10, 10));

        JButton saldoBtn = new JButton("Saldo");
        JButton depositoBtn = new JButton("Depósito");
        JButton saqueBtn = new JButton("Saque");
        JButton extratoBtn = new JButton("Extrato");
        JButton consultarLimiteBtn = new JButton("Consultar Limite");
        JButton sairBtn = new JButton("Sair");

        sairBtn.addActionListener(e -> System.exit(0));

        add(saldoBtn);
        add(depositoBtn);
        add(saqueBtn);
        add(extratoBtn);
        add(consultarLimiteBtn);
        add(sairBtn);
    }
}
