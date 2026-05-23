package listaparadigmas;

import java.util.Scanner;

public class Atividade10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 0, c = 0, d = 0, branco = 0;

        while (true) {

            int voto = sc.nextInt();

            if (voto == 0) {
                break;
            }

            if (voto == 1) a++;
            else if (voto == 2) b++;
            else if (voto == 3) c++;
            else if (voto == 4) d++;
            else if (voto == 5) branco++;
        }

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
        System.out.println("Branco: " + branco);

        int vencedor = a;
        String nome = "A";

        if (b > vencedor) { vencedor = b; nome = "B"; }
        if (c > vencedor) { vencedor = c; nome = "C"; }
        if (d > vencedor) { vencedor = d; nome = "D"; }

        System.out.println("Vencedor: " + nome);
    }
}