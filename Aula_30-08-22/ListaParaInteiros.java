public class ListaDeInteiros{
    //atributos
    private int dados[];
    private int tamanho;


    //metodos
    public ListaDeInteiros(int capacidade){ //metodo construtor
        dados = new int[capacidade];
        tamanho = 0;
    }
    // remover final 
    public int removeFinal(){
        // r para guardar elemento
        int r = Integer.MIN_VALUE;

        // verificar se a lista esta vazia
        if(tamanho == 0){
            System.out.println("ERRO! Lista Vazia.");
        } else {
            r = dados[tamanho-1];
            tamanho = tamanho -1;
        }

        return r;
    }


    // Outra forma de remover final 
    // public int removeFinal(){
    //     // verificar se a lista esta vazia
    //     if(tamanho == 0){
    //         System.out.println("ERRO! Lista Vazia.");
    //         return Integer.MIN_VALUE;
    //     }
    //     return dados[--tamanho];
    // }


    public void adicionaFinal(int e){
        if (tamanho == dados.length){
            System.out.println("ERRO! Lista Cheia");
        }else{
            dados[tamanho++] = e;
        }
    }
    public String toString(){
        String r = "";
        for(int i =0; i < tamanho; i ++){
            r = r + dados[i] + "\t";
        }
        r = r + "Quantidade de Elementos: "+tamanho;
        return r;
    }
}