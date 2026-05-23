package listaparadigmas;

import java.util.Scanner;

public class Atividade8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nome = new String[5];
        double[] preco = new double[5];
        int[] qtd = new int[5];

        for (int i = 0; i < 5; i++) {
            nome[i] = sc.next();
            preco[i] = sc.nextDouble();
            qtd[i] = sc.nextInt();
        }

        double totalGeral = 0;

        double maiorPreco = preco[0];
        String maisCaro = nome[0];

        for (int i = 0; i < 5; i++) {
            double total = preco[i] * qtd[i];
            totalGeral += total;

            System.out.println(nome[i] + " = " + total);

            if (preco[i] > maiorPreco) {
                maiorPreco = preco[i];
                maisCaro = nome[i];
            }
        }

        System.out.println("Mais caro: " + maisCaro);
        System.out.println("Total geral: " + totalGeral);
    }
}