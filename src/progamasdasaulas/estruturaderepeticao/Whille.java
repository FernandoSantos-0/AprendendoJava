package progamasdasaulas.estruturaderepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Whille {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int op=1,soma=0;

        while (op != 0) {
            System.out.println("Insira um numero: ");
            op = sc.nextInt();
            if (op != 0) {
                soma += op;
            }
        }

        System.out.printf("A soma total foi: %d%n",soma);

        sc.close();

    }
}
