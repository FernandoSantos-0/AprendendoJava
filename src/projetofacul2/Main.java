package projetofacul2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Academia academia = new Academia("Academia Corpo Forte",2);

        Instrutor instrutor = new Instrutor("Carlos Silva", "CREF12345",999990000);

        PlanoTreino plano1 = new PlanoTreino("Hipertrofia", 12);
        PlanoTreino plano2 = new PlanoTreino("Emagrecimento", 8);

        Mensalidade mensal1 = new Mensalidade(120.0, "10/10/2025", "Pago");
        Mensalidade mensal2 = new Mensalidade(120.0, "10/10/2025", "Em aberto");

        Aluno aluno1 = new Aluno("João", "123.456.789-00",988881111);
        aluno1.setPlanoTreinoAluno(plano1);
        aluno1.setInstrutorDoAluno(instrutor);
        aluno1.setMensalidadeDoAluno(mensal1);

        Aluno aluno2 = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno2.setName(sc.nextLine());

        System.out.print("Digite o telefone do aluno: ");
        aluno2.setNumero(sc.nextInt());
        sc.nextLine();

        System.out.print("Digite o CPF do aluno: ");
        aluno2.setCpf(sc.nextLine());

        aluno2.setPlanoTreinoAluno(plano2);
        aluno2.setInstrutorDoAluno(instrutor);
        aluno2.setMensalidadeDoAluno(mensal2);

        academia.adicionarAluno(aluno1);
        academia.adicionarAluno(aluno2);

        Aluno[] alunos = academia.getAlunos();

        for (int i = 0; i < academia.getNumAlunos(); i++){
            alunos[i].imprimirDadosAlunos();
        }

        sc.close();
    }

}
