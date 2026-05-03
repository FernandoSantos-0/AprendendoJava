package atividadeestruturadados.questao5;


import atividadeestruturadados.questao4.Pessoa;

public class Estudante extends Pessoa {

    private String matricula;
    private String curso;

    public Estudante(String nome, int idade, String cpf, String matricula, String curso) {
        super(nome, idade, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public void dadosPessoa() {
        super.dadosPessoa();
        System.out.println("Matrícula: " + matricula + ", Curso: " + curso);
    }

}