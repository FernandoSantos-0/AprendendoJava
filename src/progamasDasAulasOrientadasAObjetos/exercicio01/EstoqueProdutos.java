package progamasDasAulasOrientadasAObjetos.exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class EstoqueProdutos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product x;
        x = new Product();

        System.out.println("Enter com as informações do produto: ");

        System.out.print("Nome: ");
        x.name = sc.nextLine();

        System.out.print("Preço: ");
        x.price = sc.nextDouble();

        System.out.print("Quantidade No Stock: ");
        x.quantityInStock = sc.nextInt();

        double totalValor = x.updatetotal();

        System.out.printf("Informações Do Produto| Nome: %s | Preço: %.2f | Estoque: %d | Valor total: %.2f%n",x.name,x.price,x.quantityInStock,totalValor);

        System.out.print("Quantos produtos foram adicionadas no estoque: ");
        int numberAddInStock= sc.nextInt();

        x.quantityInStock = x.updateStock(numberAddInStock);
        totalValor = x.updatetotal();

        System.out.printf("Informações Do Produto| Nome: %s | Preço: %.2f | Estoque: %d | Valor total: %.2f%n",x.name,x.price,x.quantityInStock,totalValor);

        System.out.print("Quantos produtos foram removido do estoque: ");
        numberAddInStock = sc.nextInt();

        if (numberAddInStock>0){
            numberAddInStock *= -1;
        }

        x.quantityInStock = x.updateStock(numberAddInStock);
        totalValor = x.updatetotal();

        System.out.printf("Informações Do Produto| Nome: %s | Preço: %.2f | Estoque: %d | Valor total: %.2f%n",x.name,x.price,x.quantityInStock,totalValor);

        sc.close();
    }
}
