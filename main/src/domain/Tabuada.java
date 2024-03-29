package domain;

public class Tabuada {
    private int number;

    public Tabuada(){

    }
    public Tabuada(int number){
        this.number = number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }

    public void tabAdicao(){
        int soma = 0;
        System.out.println("Tabuada de adição do " + this.number);
        for(int i = 1; i <=10 ; i++){
            System.out.printf("%d + %d = %d %n", this.number, i, this.number+i);
        }
    }
    public void tabSub(){
        System.out.println("Tabuada de divisão do "+ this.number);
        for (int i = 1; i <=10; i++){
            //System.out.println(this.number + "x" + i + " = " + this.number*i);
            System.out.printf("%d - %d = %d %n", this.number, i, this.number - i);
        }
    }
    public void tabMultp(){
        System.out.println("Tabuada de multiplicação do "+ this.number);
        for (int i = 1; i <=10; i++){
            //System.out.println(this.number + "x" + i + " = " + this.number*i);
            System.out.printf("%dx%d = %d %n", this.number, i, this.number*i);
        }
    }
    public void tabDiv(){
        float number = (float)this.number;
        System.out.println("Tabuada de divisão do "+ this.number);
        for (int i = 1; i <=10; i++){
            //System.out.println(this.number + "x" + i + " = " + this.number*i);
            System.out.printf("%f/%d  = %f %n", number, i, number/i);
        }
    }


    public void console(){
        System.out.println("Todas as tabuadas!");
        tabAdicao();
        tabSub();
        tabMultp();
        tabDiv();
    }

}
