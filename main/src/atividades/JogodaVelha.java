package atividades;

import java.sql.SQLOutput;

public class JogodaVelha {
    private Jogador[] jogadores = new Jogador[2];
    private int rounds;
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
            if (jogador.getType().equals("x")) {
                this.grid[i][j] = "X";
            } else {
                this.grid[i][j] = "O";
            }

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

    public boolean iterateGrid() {
        for (int i = 0; i < this.grid.length; i++) {
            for (int j = 0; j < this.grid[i].length; j++) {
                if (j == 0) {
                    if (this.grid[i][j].equals("X")) {
                        if (this.grid[i][j + 1].equals("X") && this.grid[i][j + 2].equals("X")) {
                            return true;
                        }
                    } else if (this.grid[i][j].equals("O")) {
                        if (this.grid[i][j + 1].equals("O") && this.grid[i][j + 2].equals("O")) {
                            return true;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < this.grid.length; i++) {
            for (int j = 0; j < this.grid[i].length; j++) {
                if (j == 0) {
                    if (this.grid[j][i].equals("X")) {
                        if (this.grid[j + 1][i].equals("X") && this.grid[j + 2][i].equals("X")) {
                            return true;
                        }

                    } else if (this.grid[j][i].equals("O")) {
                        if (this.grid[j + 1][i].equals("O") && this.grid[j + 2][i].equals("O")) {
                            return true;
                        }
                    }

                }
            }
        }
        for(int i = 0; i < this.grid.length; i++){
            for (int j = 0; j < this.grid[i].length; j++) {

            }
        }
        return false;
    }

    public void showHelp() {
        System.out.println("Bem vindo ao jogo da velha!");
        System.out.println("Para jogar você irá utilizar as cordenadas x e y da tabela.");
        System.out.println("O primeiro número se refere às colunas e o segundo às linhas");
    }


}
