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
        form.setLayout(new GridLayout(11, 2, 6,5));
        for(int i = 0; i < lblFields.length; i++){
//            System.out.println(i + "\n" + lblFields.length);

            int posX = i*10;
            lbls[i] = new Label(lblFields[i]);
            lbls[i].setBounds(posX,0,60,20);
            form.add(lbls[i]);
            inputBoxes[i] = new JTextField();
            inputBoxes[i].setBounds(posX,160,60,20);
            if (i == 0 || i == 4){
                inputBoxes[i].setVisible(false);
            }
            form.add(inputBoxes[i]);
        }
        frame.add(form, BorderLayout.CENTER);

        button = new JButton("Salvar");
        frame.add(button, BorderLayout.PAGE_END);
        button.setBounds(100, 60, 40,40);

        frame.setSize(250,300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new aluguel();
    }
}
