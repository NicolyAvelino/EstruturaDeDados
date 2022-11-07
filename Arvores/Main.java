import java.util.Scanner;
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

        ar.adicionaElemento(5);
        ar.adicionaElemento(35);
        ar.adicionaElemento(56);
        ar.adicionaElemento(3);
        ar.adicionaElemento(81);
        ar.adicionaElemento(99);
        ar.adicionaElemento(33);
        System.out.println("Em Ordem inversa");
		ar.emOrdem(ar.getRaiz());
    }
}