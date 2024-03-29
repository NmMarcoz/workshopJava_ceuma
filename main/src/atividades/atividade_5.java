package atividades;

import java.util.Scanner;

public class atividade_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo à contagem regressiva!");
        System.out.println("Digite um número para que possamos começar!");
        int number = scan.nextInt();
        for(int i =  number; i > 0 ; i--){
            System.out.println(i);
        }
        System.out.println("boom :)");
    }
}
