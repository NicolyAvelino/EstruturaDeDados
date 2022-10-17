public class Main{
    public static void main(String[] args){
        ListaLigada lista1 = new ListaLigada();

        Aluno aln =  new Aluno("Nicoly", "1234");
        Aluno aln2 =  new Aluno("Carol", "5678");
        Aluno aln3 =  new Aluno("Mariana", "88888888");

        lista1.adicionaInicio(aln);
        lista1.adicionaFinal(aln2);
        lista1.adicionaInicio(aln3);
        System.out.println(lista1.toString());
        
        Aluno removido = lista1.removeInicio();
        System.out.println("\nRemovido " + removido.toString());
    }
}