package atividadeestruturadados.questao4;

public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void dadosPessoa() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", CPF: " + cpf);
    }
}