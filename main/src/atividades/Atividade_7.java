package atividades;

import domain.Tabuada;

import java.util.Scanner;

public class Atividade_7 {
    public static void main(String[] args) {
        Tabuada tab = new Tabuada();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro!");
        int number = scan.nextInt();
        tab.setNumber(number);
        tab.console();
    }
}
