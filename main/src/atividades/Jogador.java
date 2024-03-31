package atividades;

public class Jogador {
    private String nome;
    private int pontos;
    private String type;
    {
        pontos = 0;
    }

    public void console(){
        System.out.println("Nome do jogador: " + this.nome);
        System.out.println("Pontos do jogador: " + this.pontos);
        System.out.println("Tipo do jogador: " +this.type);
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setType(String type){
        type = type.toLowerCase();
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setPontos(int pontos){
        this.pontos+= pontos;
    }
    public int getPontos(){
        return this.pontos;
    }

}
