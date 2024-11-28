package com.mycompany.bancowinx.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuScreen extends JFrame {
    public MainMenuScreen(String userType) {
        setTitle("Banco Winx - Menu Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(3, 1, 10, 10));

        JButton funcionarioBtn = new JButton("Menu Funcionário");
        JButton clienteBtn = new JButton("Menu Cliente");
        JButton sairBtn = new JButton("Sair");

        funcionarioBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (userType.equals("funcionario")) {
                    dispose();
                    new FuncionarioMenuScreen().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Acesso negado!");
                }
            }
        });

        clienteBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ClienteMenuScreen().setVisible(true);
            }
        });

        sairBtn.addActionListener(e -> System.exit(0));

        add(funcionarioBtn);
        add(clienteBtn);
        add(sairBtn);
    }
}
