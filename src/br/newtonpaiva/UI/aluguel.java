package br.newtonpaiva.UI;

import javax.swing.*;
import java.awt.*;

public class aluguel {
    private JFrame frame;
    private JTextField[] inputBoxes = new JTextField[10];
    private Label[] lbls = new Label[10];
    private String[] lblFields = {"Dados do Cliente: ", "Nome: ", "CPF: ", "Tel: ", "Dados do carro: ", "Nome: ", "Placa: ", "Ano: ", "Data de locação: ", "Data da entrega: "};
    private JButton button;

    public aluguel(){
        frame = new JFrame("Aluguel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel form = new JPanel();
        form.setLayout(new GridLayout(2, 11, 10, 8));
        for(int i = 0; i < lblFields.length; i++){
            System.out.println(i + "\n" + lblFields.length);

            int posX = i*10;
            lbls[i].setText(lblFields[i]);
            lbls[i].setBounds(posX,0,120,40);
            form.add(lbls[i]);
            inputBoxes[i].setBounds(posX,160,120,40);
            form.add(inputBoxes[i]);
        }

        frame.add(form, BorderLayout.CENTER);

        button = new JButton("Salvar");
        frame.add(button, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new aluguel();
    }
}
