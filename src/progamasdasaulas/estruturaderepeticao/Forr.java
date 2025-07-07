package progamasdasaulas.estruturaderepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Forr {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int soma = 0;

        System.out.println("Quantos numeros vc deseja somar: ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++){
            System.out.printf("Insira o %d numero: ",i+1);
            soma += sc.nextInt();
        }
        System.out.printf("A soma total foi = %d",soma);

        sc.close();
    }
}
