public class ListaLigada{
    private No inicio;

    public ListaLigada(){
        inicio = null;
    }
    public void adicionaInicio(int e){
        // passo 1 - instancia um novo No com o novo elemento(e) 
        No novo = new No(e);
        // passo 2 - atribui o endereço do No que esta no inicio da lista ao atributo prox do novo No 
        novo.prox = inicio;
        // 3 - atribui o endereço do novo No ao inicio da lista
        inicio = novo;
    }
    public int removeInicio(){
        int resp = -1;
        if(inicio == null){
            System.out.println("Erro! Lista vazia.");
        } else{
            resp = inicio.dado;
            // apaga o elemento
            inicio = inicio.prox;
        }

        return resp;
    }
    public String toString(){
        // criar um No auxiliar para percorrer a lista
        No aux = inicio;
        // declaro uma string que recebera os elementos da lista
        String resp = "";
        // percorre a lista enquanto nao ultrapassar o ultimo No
        while(aux != null){
            // concatena o dado do No atual à String que será devolvida
            resp = resp + " " + aux.dado;
            // obtem a referencia do proximo No
            aux = aux.prox;
        }
        // devolve uma string com todos os elementos da lista
        return resp;
    }
}