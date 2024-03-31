package atividades;

public class Jogador {
    private String nome;
    private int pontos;
    {
        pontos = 0;
    }

    public void console(){
        System.out.println("Nome do jogador: " + this.nome);
        System.out.println("Pontos do jogador: " + this.pontos);
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPontos(int pontos){
        this.pontos+= pontos;
    }
    public int getPontos(){
        return this.pontos;
    }

}
