public class Aluno {
    // declarando os atributos
    private String nome, ra;

    // metodo construtor
    public Aluno(String nome, String ra){
        this.nome = nome;
        this.ra = ra;
    }

    // metodos GET e SET do atributo nome
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    // metodos GET e SET do atributo ra
    public String getRa(){
        return ra;
    }
    public void setRa(String ra){
        this.ra = ra;
    }

    // metodo toString
    public String toString(){
        return "Nome: " + nome + "\tRA: " + ra;
    }
}