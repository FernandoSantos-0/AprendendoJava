package ProjetoFaculdade3;

import java.util.Scanner;

public class Funcao  {

    public static void Programa(){

        Scanner sc = new Scanner(System.in);

        String[] listaPessoas = new String[10];

        for (int i = 0; i < listaPessoas.length; i++) {
            listaPessoas[i] = "Pessoa " + (i + 1);
        }
        Chamada chamada = new Chamada(listaPessoas);

        while (true) {
            System.out.println("\n1 - Chamar próximo");
            System.out.println("2 - Ver restantes");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    chamada.ChamarProximo();
                    chamada.ProximoNumeroContador();
                    break;
                case 2:
                    chamada.QuantidadeRestante();
                    break;
                case 3:
                    System.out.println("Encerrando sistema...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}

