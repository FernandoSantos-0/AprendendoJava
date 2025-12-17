package projetofacul2;

public class Aluno {

    private String name;
    private String cpf;
    private int numero;

    private Instrutor instrutorDoAluno;
    private Mensalidade mensalidadeDoAluno;
    private PlanoTreino planoTreinoAluno;

    public Aluno(String name, String cpf, int numerono ) {
        this.name = name;
        this.cpf = cpf;
        this.numero = numero;
    }

    public Aluno() {
    }

    public void imprimirDadosAlunos() {

        System.out.println("===== DADOS DOS ALUNOS DA ACADEMIA =====");

        System.out.println("\n------------------------------------");
        System.out.println("Nome do aluno: " + name);
        System.out.println("Telefone: " + numero);
        System.out.println("CPF: " + cpf);

        System.out.println("\n>> PLANO DE TREINO");
        System.out.println("Descrição: " + planoTreinoAluno.getDescricao());
        System.out.println("Duração: " + planoTreinoAluno.getDuracaoSemanas() + " semanas");

        System.out.println("\n>> INSTRUTOR RESPONSÁVEL");
        System.out.println("Nome: " + instrutorDoAluno.getName());
        System.out.println("CREF: " + instrutorDoAluno.getCpf());
        System.out.println("Telefone: " + instrutorDoAluno.getNumero());

        System.out.println("\n>> MENSALIDADE");
        System.out.println("Valor: R$ " + mensalidadeDoAluno.getValor());
        System.out.println("Vencimento: " + mensalidadeDoAluno.getDataDeVencimento());
        System.out.println("Status do pagamento: " + mensalidadeDoAluno.getStatusDoPagamento());

        System.out.println("------------------------------------");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPlanoTreinoAluno(PlanoTreino planoTreinoAluno) {
        this.planoTreinoAluno = planoTreinoAluno;
    }

    public void setMensalidadeDoAluno(Mensalidade mensalidadeDoAluno) {
        this.mensalidadeDoAluno = mensalidadeDoAluno;
    }

    public void setInstrutorDoAluno(Instrutor instrutorDoAluno) {
        this.instrutorDoAluno = instrutorDoAluno;
    }
}
