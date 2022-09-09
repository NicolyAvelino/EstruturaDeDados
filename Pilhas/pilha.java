public class Pilha{
    int dados[];
    int topo;

    public Pilha(int capMax){
        dados = new int[capMax];
        topo = 0;
    }

    public boolean cheia(){
        return dados.length == topo;

    }
    public boolean vazia(){
        return topo == 0;
    }
    public void empilha(int e){
        if(cheia()){
            return false;
        } else {
            dados[topo] = e;
            topo++;
            return true;
        }
    }
    public int desempilha(){
        if(vazia()){
            return null;
        } else{
            topo--;
            return dados[topo];
        }

    }
    public void to String(){

    }
}
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pilha pl =  new Pilha(3);

        // entrada de dados
        pl.empilha(5);
        pl.empilha(18);
        pl.empilha(4);
        pl.desempilha();
        pl.desempilha();
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