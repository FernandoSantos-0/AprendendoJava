package progamasDasAulasOrientadasAObjetos.encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com as informações do produto:");
        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Preço: ");
        double price = sc.nextDouble();

        System.out.print("Quantidade no estoque: ");
        int quantityInStock = sc.nextInt();

        Product product = new Product(name, price, quantityInStock);

        System.out.printf("Produto: %s | Preço: %.2f | Estoque: %d | Valor total: %.2f%n",
                product.getName(), product.getPrice(), product.getQuantityInStock(), product.totalValueInStock());

        System.out.print("Quantos produtos foram adicionados ao estoque? ");
        int added = sc.nextInt();
        product.addToStock(added);

        System.out.printf("Atualizado: %s | Preço: %.2f | Estoque: %d | Valor total: %.2f%n",
                product.getName(), product.getPrice(), product.getQuantityInStock(), product.totalValueInStock());

        System.out.print("Quantos produtos foram removidos do estoque? ");
        int removed = sc.nextInt();
        product.removeFromStock(removed);

        System.out.printf("Final: %s | Preço: %.2f | Estoque: %d | Valor total: %.2f%n",
                product.getName(), product.getPrice(), product.getQuantityInStock(), product.totalValueInStock());

        sc.close();
    }
}
