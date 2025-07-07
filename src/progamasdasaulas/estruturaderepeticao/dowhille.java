package progamasdasaulas.estruturaderepeticao;

import java.util.Locale;
import java.util.Scanner;

public class dowhille {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        int soma=0;

        do {
            System.out.println("Insira numero para somar{0 para sair}");
            x = sc.nextInt();
            soma += x;
        }while(x != 0);
        System.out.printf("A soma foi %d",soma);
        sc.close();
    }
}
