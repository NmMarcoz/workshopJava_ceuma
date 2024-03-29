package atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade_1 {
    public static void main(String[] args) {
        float salario_minimo_convertido = -1f;
        float salario_usuario_convertido = -1f;
        Scanner scan = new Scanner(System.in).useLocale(Locale.ROOT);
        //=======================================================//
        while(salario_minimo_convertido < 0) {
            System.out.println("Digite o valor do salário mínimo. Apenas números positivos!");
            String salario_minimo = scan.next();
            salario_minimo_convertido = replace(salario_minimo);
        }
        while(salario_usuario_convertido < 0) {
            System.out.println("Digite o seu salário. Apenas números positivos!");
            String salario_usuario = scan.next();
            salario_usuario_convertido = replace(salario_usuario);
        }
        scan.close();
        //=======================================================//
        float resultado = 0;
        resultado = calcularSalarioMinimo(salario_minimo_convertido, salario_usuario_convertido);
        System.out.println("--------------------------");
        System.out.println("Valor do salário mínimo: R$" + salario_minimo_convertido);
        System.out.println("O seu salário: R$" + salario_usuario_convertido);
        System.out.println("Você recebe " +  resultado + " salário(s) mínimo(s)");

    }

    public static float calcularSalarioMinimo(float salario_minimo, float salario){
            return (salario / salario_minimo);
    }
    public static float replace(String numberString){
        float number;
        numberString = numberString.replace(',', '.');
        number = Float.parseFloat(numberString);
        return number;
    }
}
