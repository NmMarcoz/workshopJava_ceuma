package atividades;

import java.util.Scanner;

public class Atividade_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        int soma = 0;
        System.out.println("Bem vindo!");
        System.out.println("Digite um número e eu irei te mostrar a soma de todos os pares de 1 até ele!");
        while(number < 1){
            System.out.println("lembre-se de digitar apenas números inteiros maiores do que 1!");
            number = scan.nextInt();
        }
        for(int i = 1; i <= number; i++){
            if(i %2 == 0){
                soma = soma + i;
            }
        }
        System.out.println("A soma de todos os números pares até " + number + " é: " + soma);
    }
}
