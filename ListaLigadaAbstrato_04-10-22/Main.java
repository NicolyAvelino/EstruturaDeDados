public class Main{
    public static void main(String[] args){
        ListaLigada lista1 = new ListaLigada();

        Aluno aln =  new Aluno("Nicoly", "1234");

        lista1.adicionaInicio(aln);
        System.out.println(lista1.toString());
    }
}