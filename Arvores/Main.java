public class Main{
    public static void main(String args[]){
        Arvore ar = new Arvore();

        ar.adicionaElemento(15);
        ar.adicionaElemento(25);
        ar.adicionaElemento(5);
        ar.adicionaElemento(30);
        ar.adicionaElemento(8);
        ar.adicionaElemento(20);
        ar.adicionaElemento(31);

        System.out.println("Pré Ordem");
        ar.preOrdem(ar.getRaiz());
        System.out.println("Pos Ordem");
        ar.preOrdem(ar.getRaiz());
        System.out.println("Em Ordem");
        ar.preOrdem(ar.getRaiz());
    }
}