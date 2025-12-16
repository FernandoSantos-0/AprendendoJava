package ProjetoFacul1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean rodando = true;
        int op;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Inserir pacote");
            System.out.println("2 - Remover pacote");
            System.out.println("3 - Listar pacotes");
            System.out.println("4 - Analisar pacote por ID");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            op = sc.nextInt();
            sc.nextLine(); // limpa o buffer do teclado

            switch (op) {
                case 1:
                    System.out.println("Inserindo pacote...");
                    // aqui você chamaria algo como: entrega.inserirPacote(novoPacote);
                    break;

                case 2:
                    System.out.println("Removendo pacote...");
                    // entrega.removerPacote(pacote);
                    break;

                case 3:
                    System.out.println("Listando pacotes...");
                    // entrega.listarPacotes();
                    break;

                case 4:
                    System.out.print("Digite o ID do pacote: ");
                    String id = sc.nextLine();
                    // Pacote p = entrega.analisarPacote(id);
                    // if (p != null) System.out.println("Encontrado: " + p);
                    // else System.out.println("Pacote não encontrado!");
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    rodando = false;
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (rodando);

        sc.close();
    }
}
