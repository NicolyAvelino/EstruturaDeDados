public class Main{
    public static void main(String[] args){
        ListaLigada lista1 = new ListaLigada();

        lista1.adicionaInicio(30);
        lista1.adicionaInicio(10);
        lista1.adicionaInicio(5);

        System.out.println(lista1.toString());

        int x = lista1.removeInicio();
        System.out.println("Elemento Removido " + x);

        x = lista1.removeInicio();
        System.out.println("Elemento Removido " + x);
        System.out.println(lista1.toString());
    }
}