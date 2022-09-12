public class Pilha{
    int dados[];
    int topo;

    public Pilha(int capMax){
        dados = new int[capMax];
        topo = -1;
    }
    // empilha = push
    public void empilhar(int e){
        topo = topo + 1;
        dados[topo] = e;
    }
    // isEmpty = vazia
    public boolean vazia(){
        return (topo == -1);

    }
    // idFull = cheia
    public boolean cheia(){
        // return (topo == 2);
        return (topo == dados.length);
    }
    // desempilha = pop
    public int desempilha(){
        int elem = dados[topo];
        topo --;
        return elem;
    }
}

public class Main{
    public static void main(String[] args){

    }
}