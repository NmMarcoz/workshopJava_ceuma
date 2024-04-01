package atividades;


import java.util.Scanner;

public class Atividade_bonus {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        Scanner scanJogadas = new Scanner(System.in);
        Scanner optionsScanner = new Scanner(System.in);
        String choice, name;
        Jogador jogador_1 = new Jogador();
        Jogador jogador_2 = new Jogador();

        System.out.println("Vamos configurar o jogador 1!");
        System.out.println("Primeiro, digite seu nome: ");
        name = dados.nextLine();
        jogador_1.setNome(name);
        System.out.println("Perfeito! E qual o tipo? X ou O?");
        choice = dados.nextLine().toLowerCase();
        while (!choice.equals("x") && !choice.equals("o")) {
            System.out.println("Por favor, apenas X ou O");
            choice = dados.nextLine().toLowerCase();
        }
        if (choice.equals("x")) {
            jogador_1.setType("x");
            jogador_2.setType("o");
        } else if (choice.equals("o")) {
            jogador_1.setType("o");
            jogador_2.setType("x");
        }
        System.out.println("Agora vamos configurar o jogador 2");
        System.out.println("Digite o nome: ");
        name = dados.nextLine();
        jogador_2.setNome(name);
        //dados.close();

        Jogador[] jogadores = {jogador_1, jogador_2};


        JogodaVelha jogo = new JogodaVelha();
        jogo.showHelp();
        System.out.println("--------");
        jogo.setJogadores(jogadores);
        jogo.showJogadores();
        jogo.showGrid();
        int op = 1;
        int playerTurn = 1;
        int[] jogada = new int[2];

        while (op == 1) {

            String turnString = playerTurn == 1 ? "Jogador 1" : "Jogador 2";
            System.out.println("Vez do jogador: " + turnString);
            System.out.println("Digite a coordenada da sua jogada");
            jogo.showGrid();
            jogada[0] = dados.nextInt();
            jogada[1] = dados.nextInt();
            while (jogo.hasItems(jogada)) {
                System.out.println("Ja foi feito uma jogada nessa coordenada, selecione outra!");
                jogada[0] = dados.nextInt();
                jogada[1] = dados.nextInt();
            }
            if (playerTurn == 1) {
                jogo.setGrid(jogada, jogador_1);
            } else {
                jogo.setGrid(jogada, jogador_2);
            }

            if (jogo.iterateGrid()) {
                jogo.resetGrid();
                playerTurn = 1;
                System.out.println("GANHOU!!!!");
                jogo.setPontos(10, playerTurn);
                jogo.getJogadores()[playerTurn - 1].console();
                System.out.println("Deseja continuar jogar outra partida? 1(sim) ou 0(nao)");
                op = dados.nextInt();
                while (op < 0 || op > 1) {
                    System.out.println("Somente 1 ou 0 para responder");
                    op = dados.nextInt();
                }
            }

            playerTurn = playerTurn == 1 ? 2 : 1;
        }
        jogo.score();

    }
}
