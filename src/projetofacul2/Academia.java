package projetofacul2;

public class Academia {

    private String nome;
    private Instrutor[] instrutores;
    private int numAlunos;
    private Aluno[] alunos;

    public Academia(String nome, int capacidadeAlunos) {
        this.nome = nome;
        alunos = new Aluno[capacidadeAlunos];
        instrutores = new Instrutor[5];
        numAlunos = 0;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        if (numAlunos < alunos.length) {
            alunos[numAlunos] = aluno;
            numAlunos++;
            System.out.println("Aluno adicionado com sucesso!");
        } else {
            System.out.println("Erro: limite de alunos atingido.");
        }
    }

    public int getNumAlunos() {
        return numAlunos;
    }

}
