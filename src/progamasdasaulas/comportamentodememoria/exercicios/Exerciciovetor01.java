package progamasdasaulas.comportamentodememoria.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerciciovetor01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o tamanho do vetor: ");
        int vetsize = sc.nextInt();
        sc.nextLine();
        ProductExercicioVetor[] product = new ProductExercicioVetor[vetsize];


        for (int i = 0 ; i < product.length ; i++){
            System.out.println("Insira o nome do produto: ");
            String name = sc.nextLine();


            System.out.println("Insira o preço do produto: ");
            double price = sc.nextDouble();
            sc.nextLine();
            product[i] = new ProductExercicioVetor(name,price);

        }

        for (int i = 0 ; i < product.length ; i++){

            System.out.printf("Informações do produto %d:%n",i+1);
            System.out.println(product[i]);

        }

    }
}

