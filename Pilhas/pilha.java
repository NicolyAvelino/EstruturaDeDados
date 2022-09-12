public class Pilha{
    int dados[];
    int topo;

    public Pilha(int capMax){
        dados = new int[capMax];
        topo = -1;
    }

    public boolean cheia(){
        return dados.length == topo;

    }
    public boolean vazia(){
        return topo == 0;
    }
    public void empilha(int e){
        if(cheia()){
            System.out.println("Lista cheia!");
        } else {
            topo = topo + 1;
            dados[topo] = e;
        }
    }
    public int desempilha(){
        if(vazia()){
            System.out.println("Lista vazia!");
        } else{
            topo--;
            return dados[topo];
        }

    }
    // public void to String(){

    // }
}
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pilha pl =  new Pilha(5);

        // entrada de dados
        pl.empilha(10);
        pl.empilha(5);
        pl.empilha(3);
        pl.empilha(40);
        pl.desempilha();
        pl.empilha(11);
        pl.empilha(4);
        pl.empilha(7);
        pl.desempilha();
        pl.desempilha();

        System.out.printf("%d topo: ",pl.desempilha());
        // for(int i = 0; i < dados.length; i++){
        //     int num = sc.nextInt();
        //     if(pl.cheia()){
        //         System.out.println("ERRO! Pilha Cheia.");
        //     } else{
        //         pl.empilha(num);
        //     }
        // }
    }
}