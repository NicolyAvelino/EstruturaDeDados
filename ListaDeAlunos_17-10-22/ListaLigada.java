public class ListaLigada{
    private No inicio;

    public ListaLigada(){
        inicio = null;
    }
    public void adicionaInicio(Aluno e){
        // passo 1 - instancia um novo No com o novo elemento(e) 
        No novo = new No(e);
        // passo 2 - atribui o endereço do No que esta no inicio da lista ao atributo prox do novo No 
        novo.prox = inicio;
        // 3 - atribui o endereço do novo No ao inicio da lista
        inicio = novo;
    }
    public Aluno removeInicio(){
        Aluno resp = null;
        if(inicio == null){
            System.out.println("Erro! Lista vazia.");
        } else{
            resp = inicio.dado;
            // apaga o elemento
            inicio = inicio.prox;
        }
        return resp;
    }

    // adicionar um elemento no final
    public void adicionaFinal(Aluno e){
        if(inicio == null){
            inicio = new No(e);
        } else {
            No aux = inicio;
            while(aux.prox != null){
                aux = aux.prox;
            }
            aux.prox = new No(e);
        }
    }

    // remover final
    public Aluno removeFinal(){
        Aluno r = null;
        if (inicio == null) {
            System.out.println("ERRO: Lista vazia");
        }else if(inicio.prox != null){
            No aux1 = inicio;
            No aux2 = null;
            while(aux1.prox != null){
                aux2 = aux1;
                aux1 = aux1.prox;
            }
            r = aux1.dado;
            aux2.prox = null;
        }else{
            r = inicio.dado;
            inicio = null;
        }
        return r;
    }

    public String toString(){
        // criar um No auxiliar para percorrer a lista
        No aux = inicio;
        // declaro uma string que recebera os elementos da lista
        String resp = "";
        // percorre a lista enquanto nao ultrapassar o ultimo No
        while(aux != null){
            // concatena o dado do No atual à String que será devolvida
            resp = resp + " " + aux.dado.toString();
            // obtem a referencia do proximo No
            aux = aux.prox;
        }
        // devolve uma string com todos os elementos da lista
        return resp;
    }
}