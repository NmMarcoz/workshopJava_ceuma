package atividades;

import java.util.Random;
import java.util.Scanner;

public class Atividade_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randomizer = new Random();

        int randomNumber = randomizer.nextInt(1, 100);

        System.out.println("Vamos brincar de advinhação...");
        System.out.println("Escolha um número de 1 a 100");
        int number = scan.nextInt();
        while(number < 1 || number  > 100){
            System.out.println("Somente números de 1 a 100!!!!!");
            number = scan.nextInt();
        }
        int tentativas = 1;
        while(number != randomNumber){
            if(tentativas == 10){
                System.out.println("##################### DICAS ####################");
                int antes = randomNumber - 2;
                int depois = randomNumber + 2;
                System.out.printf("Está entre %d e %d %n", antes, depois);
            }
            else if(number < randomNumber){
                System.out.println("Mais que isso!");
            }
            else if(number > randomNumber){
                System.out.println("Menos que isso!");
            }
            System.out.println("Escolha outro número!");
            number = scan.nextInt();
            while(number < 1 || number  > 100){
                System.out.println("Somente números de 1 a 100!!!!!");
                number = scan.nextInt();
            }
            tentativas++;
        }
        System.out.println("Você  acertou!!!! Demorou um total de: " + tentativas + " tentativas");

    }
}
