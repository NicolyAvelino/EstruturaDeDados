public class Arvore{
    private No raiz;

    public Arvore(){
        raiz = null;
    }

    // mostrar os elementos
    public void preOrdem(No n){
        System.out.println(n.elemento);
        preOrdem(n.esquerda);
        preOrdem(n.direita);
    }

    // somar os elemento
    public int somaPreOrdem(No n){
        if(n != null){
            return n.elemento + somaPreOrdem(n.esquerda) + somaPreOrdem(n.direita);
        }
        return 0;
    }
}