package progamasdasaulas.comportamentodememoria.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Numeronegativo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira quantos numeros terao: ");
        int escolha = sc.nextInt();

        double[] vect = new double[escolha];

        for (int i = 0 ; i < vect.length ; i++){
            System.out.println("Insira um valor: ");
            vect[i] = sc.nextDouble();
        }
        System.out.println("Numero negativos");
        for (double v : vect) {
            if (v < 0) {
                System.out.println(v);
            }
        }

        sc.close();
    }
}
