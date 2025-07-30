package aulasecao15.exercicio.application;

import aulasecao15.exercicio.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "D:\\Documentos\\Progamação\\Java\\AprendendoJava\\src\\aulasecao15\\exercicio\\summary.csv";

        System.out.println("-----Menu-----");
        System.out.println("Adicionar Produto[1]: ");
        System.out.println("Ver Produtos Adicionados[2]: ");
        System.out.println("Apagar Produtos Adicionados[3]: ");
        System.out.println("Sair[4]: ");
        System.out.print("Escolha uma opção: ");
        int opcoes = sc.nextInt();
        sc.nextLine();

        switch (opcoes) {

            case 1: {

                System.out.print("Quantos produtos para adicionar: ");
                int quantidade = sc.nextInt();
                sc.nextLine();

                List<Product> list = new ArrayList<>();

                String[] lines = new String[quantidade];

                for (int i = 0; i < quantidade; i++) {

                    System.out.println("Informações do " + (i + 1) + "° produto: ");

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();

                    Product product = new Product(name, price, quantity);

                    product.totalPrice();

                    lines[i] = product.toString();

                }

                try (BufferedWriter escrever = new BufferedWriter(new FileWriter(path, true))) {

                    for (String line : lines) {

                        escrever.write(line);
                        escrever.newLine();

                    }

                } catch (IOException e) {

                    System.out.println("Error: " + e.getMessage());

                }
                break;
            }

            case 2: {

                try (BufferedReader ler = new BufferedReader(new FileReader(path))) {

                    String line = ler.readLine();
                    while (line != null) {

                        System.out.println(line);
                        line = ler.readLine();

                    }
                } catch (IOException e) {

                    System.out.println("Error: " + e.getMessage());

                }
                break;
            }

            case 3: {

                try (BufferedWriter escrever = new BufferedWriter(new FileWriter(path, false))) {

                    escrever.write("");

                } catch (IOException e) {

                    System.out.println("Arquivo não limpo!");
                    System.out.println("Error: " + e.getMessage());

                }
                break;
            }

            case 4: {
                System.out.println("Saindo...");
                break;
            }

            default: {
                System.out.println("Escolha uma opção valida!!!");
            }
        }
        sc.close();
    }
}
