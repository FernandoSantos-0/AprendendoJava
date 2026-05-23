package listaparadigmas;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        String situacao;

        if (media >= 7) {
            situacao = "Aprovado";
        } else if (media >= 4) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }

        System.out.println(nome);
        System.out.println(media);
        System.out.println(situacao);
    }
}