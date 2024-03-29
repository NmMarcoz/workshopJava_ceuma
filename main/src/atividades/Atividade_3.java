package atividades;

import java.time.LocalDate;
import java.util.Scanner;

public class Atividade_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Diga o ano e eu te direi se é bissexto");
        int ano = scan.nextInt();
        LocalDate date = LocalDate.ofYearDay(ano, 1);
        System.out.println("resposta: " + (date.isLeapYear()? "É bissexto": "Não é bissexto"));
        scan.close();
    }
}
