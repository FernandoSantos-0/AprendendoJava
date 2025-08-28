package exerciciosfaculdade.lista2;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Scanner scNumeros = new Scanner(System.in);

        Filmes[] filmes = new Filmes[3];

        for (int i = 0; i < 3; i++){

            filmes[i] = new Filmes();

            System.out.println("Insira dados sobre o filme: ");
            System.out.print("Nome: ");
            filmes[i].nome = sc.nextLine();
            System.out.print("Autor: ");
            filmes[i].autor = sc.nextLine();
            System.out.print("data: ");
            filmes[i].data = sc.nextLine();
            System.out.print("Preço: ");
            filmes[i].preco = scNumeros.nextFloat();

        }

        for (int i = 0; i < 3; i++){

            System.out.println("Resumo Dados filmes: ");
            System.out.println("Nome: "+filmes[i].nome);
            System.out.println("Autor: "+filmes[i].autor);
            System.out.println("Data: "+filmes[i].data);
            System.out.println("Preço: "+filmes[i].preco);

        }


        scNumeros.close();
        sc.close();
    }

}
