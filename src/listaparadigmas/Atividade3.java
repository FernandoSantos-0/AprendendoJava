package listaparadigmas;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();

        double comissao;

        if (vendas <= 5000) {
            comissao = vendas * 0.05;
        } else {
            comissao = (5000 * 0.05) + ((vendas - 5000) * 0.10);
        }

        double salarioFinal = salario + comissao;

        System.out.println(nome);
        System.out.println(salarioFinal);
    }
}