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