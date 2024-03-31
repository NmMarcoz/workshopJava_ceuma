package atividades;

import java.util.Arrays;

public class Atividade_bonus {
    public static void main(String[] args){
        int[][] matriz = new int[3][3];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = i + 1;
            }
        }
        for(int i = 0; i < matriz.length; i++){
            for ( int j = 0; j < matriz[i].length; j++){
                System.out.println(matriz[i][j]);
            }
        }

    }
}
