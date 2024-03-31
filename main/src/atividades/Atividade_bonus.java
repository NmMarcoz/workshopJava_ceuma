package atividades;


public class Atividade_bonus {
    public static void main(String[] args){
       Jogador jogador_1 = new Jogador();
       Jogador jogador_2 = new Jogador();
       jogador_1.setNome("Nogueira");
       jogador_2.setNome("Rafael");
       Jogador[] jogadores = {jogador_1, jogador_2};

       JogodaVelha jogo = new JogodaVelha();
       jogo.setJogadores(jogadores);
       jogo.showJogadores();
       jogo.showGrid();


    }
}
