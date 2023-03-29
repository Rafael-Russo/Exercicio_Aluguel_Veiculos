package br.newtonpaiva.UI;

import br.newtonpaiva.dominio.*;

import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDate;

public class Formulario {
    static public JFrame frame;

    public static void main(String[] args) throws ParseException {
        frame = new JFrame("Aluguel de Veículos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLayout(null);

        JLabel dados = new JLabel ("Dados do Cliente:");
        dados.setBounds(80,0,100,20);
        frame.add(dados);

        JLabel lblNome = new JLabel("Nome: ", JLabel.LEFT);
        lblNome.setBounds(80,30,60,20);
        frame.add(lblNome);

        JTextField nome = new JTextField();
        nome.setBounds(120,30,110,20);
        frame.add(nome);

        JLabel lblCPF = new JLabel("CPF: ", JLabel.LEFT);
        lblCPF.setBounds(80,60,60,20);
        frame.add(lblCPF);

        JFormattedTextField cpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        cpf.setBounds(120,60,110,20);
        frame.add(cpf);

        JLabel tel = new JLabel("Tel: ", JLabel.LEFT);
        tel.setBounds(80,90,60,20);
        frame.add(tel);

        JFormattedTextField telefone = new JFormattedTextField(new MaskFormatter("(##)#####-####"));
        telefone.setBounds(120,90,110,20);
        frame.add(telefone);

        JLabel dadosCarro = new JLabel ("Dados do Carro:");
        dadosCarro.setBounds(80,120,100,20);
        frame.add(dadosCarro);

        JLabel nomeCarro = new JLabel("Nome: ", JLabel.LEFT);
        nomeCarro.setBounds(80,150,60,20);
        frame.add(nomeCarro);

        JTextField carro = new JTextField();
        carro.setBounds(120,150,110,20);
        frame.add(carro);

        JLabel placa = new JLabel("Placa: ", JLabel.LEFT);
        placa.setBounds(80,180,60,20);
        frame.add(placa);

        JFormattedTextField placaCarro = new JFormattedTextField(new MaskFormatter("???-####"));
        placaCarro.setBounds(120,180,110,20);
        frame.add(placaCarro);

        JLabel ano = new JLabel("Ano: ", JLabel.LEFT);
        ano.setBounds(80,210,60,20);
        frame.add(ano);

        JFormattedTextField anoCarro = new JFormattedTextField(new MaskFormatter("####/####"));
        anoCarro.setBounds(120,210,110,20);
        frame.add(anoCarro);

        JLabel data = new JLabel("Data de Locação: ", JLabel.LEFT);
        data.setBounds(10,240,105,20);
        frame.add(data);

        JFormattedTextField dataLocacao = new JFormattedTextField(new MaskFormatter("##/##/####"));
        dataLocacao.setBounds(120,240,110,20);
        frame.add(dataLocacao);

        JLabel dataE = new JLabel("Data da Entrega: ", JLabel.LEFT);
        dataE.setBounds(10,270,105,20);
        frame.add(dataE);

        JFormattedTextField dataEntrega = new JFormattedTextField(new MaskFormatter("##/##/####"));
        dataEntrega.setBounds(120,270,110,20);
        frame.add(dataEntrega);

        JButton btnSubmit = new JButton("Salvar");
        btnSubmit.setBounds(150,300,80,20);
        frame.add(btnSubmit);

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nome.getText().isEmpty() || cpf.getText().isEmpty() || telefone.getText().isEmpty() || anoCarro.getText().isEmpty() || dataLocacao.getText().isEmpty() || dataEntrega.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                }else {
                    JOptionPane.showMessageDialog(null, "Aluguel realizado com sucesso!");
                    Cliente c = new Cliente();
                    Veiculo v = new Veiculo();

                    c.cpf = cpf.getText();
                    c.nome = nome.getText();
                    c.tel = telefone.getText();

                    v.ano = Integer.parseInt(anoCarro.getText());
                    v.entrega = LocalDate.parse(dataEntrega.getText());
                    v.nome = nomeCarro.getText();
                    v.placa = placaCarro.getText();
                    v.locacao = LocalDate.parse(dataLocacao.getText());
                }
            }
        });

        frame.setVisible(true);
    }
}
