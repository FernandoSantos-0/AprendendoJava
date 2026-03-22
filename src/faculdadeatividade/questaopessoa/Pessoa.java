package faculdadeatividade.questaopessoa;

public class Pessoa {

    protected String nome;
    protected String cpf;

    public Pessoa(String nome, String cpf){
        this.nome=nome;
        this.cpf=cpf;
    }

    public void mostraDados(){

        System.out.println("Nome: " + nome + " ,CPF:  " + cpf + ". ");

    }

}
