package atividades;

public class JogodaVelha {
    private Jogador[] jogadores = new Jogador[2];
    private int rounds;
    private int[] fileiras = {1, 2, 3};
    private int[][] grid = new int[3][3];

    //Inicializando todos os elementos como 0
    // 0 Vai significar que não nem X nem O.
    // X vai ser 1, O vai ser 2.
    {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = 0;
            }
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }
    public void showJogadores(){
        for(Jogador jogador: this.jogadores){
            jogador.console();
            System.out.println("--------------");
        }
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores[0] = jogadores[0];
        this.jogadores[1] = jogadores[1];

    }

    public void setGrid(){

    }

    public void showGrid(){
        System.out.println(" | 1 || 2 || 3 |");
        for (int i = 0; i < grid.length; i++){
            System.out.println("");
            System.out.print(fileiras[i]);

            for (int j = 0; j < grid[i].length ; j++) {
                System.out.print("| ");
                System.out.print(grid[i][j]);
                System.out.print(" |");
            }
        }
    }




}
