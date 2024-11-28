package com.mycompany.bancowinx.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {
    private JTextField userField;
    private JPasswordField passwordField;

    public LoginScreen() {
        setTitle("Banco Winx - Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        panel.add(new JLabel("Usuário:"));
        userField = new JTextField();
        panel.add(userField);

        panel.add(new JLabel("Senha:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);

        JButton loginFuncionarioBtn = new JButton("Login Funcionário");
        JButton loginClienteBtn = new JButton("Login Cliente");

        loginFuncionarioBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new MainMenuScreen("funcionario").setVisible(true);
            }
        });

        loginClienteBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new MainMenuScreen("cliente").setVisible(true);
            }
        });

        panel.add(loginFuncionarioBtn);
        panel.add(loginClienteBtn);

        add(panel, BorderLayout.CENTER);
    }
}
