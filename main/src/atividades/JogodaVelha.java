package atividades;

import java.sql.SQLOutput;

public class JogodaVelha {
    private Jogador[] jogadores = new Jogador[2];
    private int[] fileiras = {1, 2, 3};
    private String[][] grid = new String[3][3];

    //Inicializando todos os elementos como 0
    // 0 Vai significar que não nem X nem O.
    // X vai ser 1, O vai ser 2.
    {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = " ";
            }
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void resetGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = " ";
            }
        }
    }

    public void showJogadores() {
        for (Jogador jogador : this.jogadores) {
            jogador.console();
            System.out.println("--------------");
        }
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores[0] = jogadores[0];
        this.jogadores[1] = jogadores[1];

    }

    public void setPontos(int pontos, int id) {
        this.jogadores[id - 1].setPontos(pontos);
    }

    public boolean hasItems(int[] jogada) {
        int i = jogada[0] - 1;
        int j = jogada[1] - 1;
        if (!this.grid[i][j].equals(" ")) {
            return true;
        }
        return false;
    }

    public void score() {
        System.out.println("PLACAR FINAL");
        System.out.println("            Jogador 1");
        System.out.println("nome: " + this.jogadores[0].getNome());
        System.out.println("pontos: " + this.jogadores[0].getPontos());
        System.out.println("----------------------------------------");
        System.out.println("            Jogador 2");
        System.out.println("nome: " + this.jogadores[1].getNome());
        System.out.println("pontos: " + this.jogadores[1].getPontos());
    }


    public void setGrid(int[] jogada, Jogador jogador) {
        try {
            int i = jogada[0];
            int j = jogada[1];
            i -= 1;
            j -= 1;
            System.out.println("i: " + i);
            System.out.println("j: " + j);
            if ((i < 0 || i > 2) || (j < 0 || j > 2)) {
                throw new Exception("Número inválido para a posição");
            }
           this.grid[i][j] = jogador.getType().toUpperCase();

        } catch (Exception erro) {
            erro.printStackTrace();
        }

    }

    public void showGrid() {
        System.out.println(" | 1 || 2 || 3 |");
        for (int i = 0; i < grid.length; i++) {
            System.out.println("");
            System.out.print(fileiras[i]);

            for (int j = 0; j < grid[i].length; j++) {
                System.out.print("| ");
                System.out.print(grid[i][j]);
                System.out.print(" |");
            }
        }
        System.out.printf("\n\n");
    }

    public boolean iterateGrid(int playerTurn) {
        String itemToSearch;
        if(playerTurn ==1){
            itemToSearch = this.jogadores[0].getType().toUpperCase();
        }else{
            itemToSearch = this.jogadores[1].getType().toUpperCase();
        }
        for (int i = 0; i < this.grid.length; i++) {
            for (int j = 0; j < this.grid[i].length; j++) {
                if (j == 0) {
                    if (this.grid[i][j].equals(itemToSearch)) {
                        if (this.grid[i][j + 1].equals(itemToSearch) && this.grid[i][j + 2].equals(itemToSearch)) {
                            return true;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < this.grid.length; i++) {
            for (int j = 0; j < this.grid[i].length; j++) {
                if (j == 0) {
                    if (this.grid[j][i].equals(itemToSearch)) {
                        if (this.grid[j + 1][i].equals(itemToSearch) && this.grid[j + 2][i].equals(itemToSearch)) {
                            return true;
                        }

                    }
                }
            }
        }
        int diagonalPoints = 0;
        for(int i = 0; i < this.grid.length; i++){
            if(this.grid[i][i].equals(itemToSearch)){
                diagonalPoints++;
                System.out.println(diagonalPoints);
            }
        }
        if (diagonalPoints ==3){
            return true;
        }
        diagonalPoints =0;
        int j = 2;
        for(int i = 0 ; i < this.grid.length ; i++){

            if(this.grid[i][j].equals(itemToSearch)){
                diagonalPoints++;
                System.out.println(diagonalPoints);
            }
            j--;
        }
        if (diagonalPoints == 3){
            return true;
        }

        return false;
    }

    public void showHelp() {
        System.out.println("Bem vindo ao jogo da velha!");
        System.out.println("Para jogar você irá utilizar as cordenadas x e y da tabela.");
        System.out.println("O primeiro número se refere às colunas e o segundo às linhas");
    }


}
