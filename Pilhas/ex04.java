// QUESTÃO DISCURSIVA 4
// Link: https://download.inep.gov.br/educacao_superior/enade/provas/2014/40_tecnologia_analise_desenv_sistemas.pdf
// Uma estrutura de dados do tipo pilha pode ser usada em um algoritmo que permite imprimir uma palavra de forma invertida. Exemplo: FELICIDADE deve ser impresso como EDADICILEF. Utilizando as varíaveis declaradas abaixo:
// pilha[1..50]: caractere;
// i, topo : inteiro;
// palavra: string; 
public class Pilha{
    private char dados[];
    private int topo;

    public Pilha(int capacidade){
        dados = new char[capacidade];
        topo = -1;
    }

    public void empilha(char e){
      if (topo == dados.length-1){
        System.out.println("ERRO! Lista Cheia");
      }else{
        dados[++topo]=e;
      }
   }

    public char desempilha(){
    if (topo == -1){
      System.out.println("ERRO!");
      return ' ';
    } 
    char r = dados[topo--];
    return r;
  }
    
    public String toString(){
      String r = "";
      for (int i = 0; i <= topo; i++){
          r = r + dados[i] + "\t";
      }
      r = r + "\nQuantidade de Elementos: "+ (topo+1);
      return r;
   }
    public int obtemTopo(){
       return topo;   
   }
}
import javax.swing.JOptionPane;

public class Main {
    public static void main(String args[]){
        String entrada="", saida="";
        Pilha pilhaDeLetras = new Pilha(30);
        entrada=JOptionPane.showInputDialog("Palavra?");
        for (int i = 0; i < entrada.length(); i++){
            pilhaDeLetras.empilha(entrada.charAt(i));
        } 
        JOptionPane.showMessageDialog(null,"Texto digitado: " + pilhaDeLetras.toString());
        while (pilhaDeLetras.obtemTopo() > -1){
            saida = saida + pilhaDeLetras.desempilha();
        }
        JOptionPane.showMessageDialog(null,"Texto modificado: " + saida);        
    }
}