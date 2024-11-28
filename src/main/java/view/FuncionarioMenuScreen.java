package com.mycompany.bancowinx.view;

import javax.swing.*;
import java.awt.*;

public class FuncionarioMenuScreen extends JFrame {
    public FuncionarioMenuScreen() {
        setTitle("Banco Winx - Menu Funcionário");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new GridLayout(7, 1, 10, 10));

        JButton abrirContaBtn = new JButton("Abertura de Conta");
        JButton encerrarContaBtn = new JButton("Encerramento de Conta");
        JButton consultarDadosBtn = new JButton("Consulta de Dados");
        JButton alterarDadosBtn = new JButton("Alteração de Dados");
        JButton cadastrarFuncionarioBtn = new JButton("Cadastro de Funcionário");
        JButton gerarRelatoriosBtn = new JButton("Geração de Relatórios");
        JButton sairBtn = new JButton("Sair");

        sairBtn.addActionListener(e -> System.exit(0));

        add(abrirContaBtn);
        add(encerrarContaBtn);
        add(consultarDadosBtn);
        add(alterarDadosBtn);
        add(cadastrarFuncionarioBtn);
        add(gerarRelatoriosBtn);
        add(sairBtn);
    }
}
