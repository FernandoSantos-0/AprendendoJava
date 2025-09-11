package exerciciosfaculdade.lista4.questao1;

import java.util.Scanner;

public class Main {

    public static void conta(){

        Scanner sc = new Scanner(System.in);

        Conta contaCorrente = new Conta("jose",0);
        Conta contaPoupanca = new Conta("Pedro",0);

        System.out.println("Insira o valor do deposito da conta Corrente: ");
        contaCorrente.deposito(sc.nextDouble());
        System.out.println("Insira o valor do deposito da conta Poupanca: ");
        contaPoupanca.deposito(sc.nextDouble());

        System.out.println("Insira o valor de saque da conta corrente: ");
        contaCorrente.sacar(sc.nextDouble());
        System.out.println("Insira o valor de saque da conta Poupanca: ");
        contaPoupanca.sacar(sc.nextDouble());

        System.out.println("Conta corrente: " + contaCorrente);
        System.out.println("Conta Poupanca: " + contaPoupanca);
    }

    public static void main(String[] args) {

        conta();

    }


}
