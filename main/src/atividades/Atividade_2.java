package atividades;

import java.util.Scanner;

public class Atividade_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int number = scan.nextInt();
        antecessorSucessor(number);
        scan.close();
    }

    public static void antecessorSucessor(int number){
        int antecessor = number - 1;
        int sucessor = number + 1;
        System.out.println("O numéro antecessor é: " + antecessor);
        System.out.println("O número sucessor é: " + sucessor);

    }
}
