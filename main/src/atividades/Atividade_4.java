package atividades;

import javax.swing.*;

public class Atividade_4 {
    public static void main(String[] args){
        String value = JOptionPane.showInputDialog("Digite o valor do produto");
        String code = JOptionPane.showInputDialog("Digite o código do produto");
        String quantity = JOptionPane.showInputDialog("Agora digite a quantidade");
        String tax = JOptionPane.showInputDialog("Agora a taxa a ser aplicada. Escolha de 0 a 100");

        float float_value = Float.parseFloat(value);
        int integer_quantity = Integer.parseInt(quantity);
        int integer_tax = Integer.parseInt(tax);
        System.out.println(float_value);
        System.out.println(integer_quantity);
        System.out.println(integer_tax);
        float price = float_value*integer_quantity;
        float final_price = price - (price*integer_tax/100);
        System.out.println("preço final: R$" + final_price);
        JLabel result = new JLabel("Seu resultado é :" +final_price);
        JFrame frame = new JFrame("Resultado");
        frame.setSize(200, 200);

        frame.setLocation(960, 540);
        frame.setContentPane(result);
        frame.setVisible(true);
      //  System.out.println("Digite o código do item!");

    }
}
