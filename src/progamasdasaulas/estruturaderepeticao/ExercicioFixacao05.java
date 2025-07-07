package progamasdasaulas.estruturaderepeticao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero para ver os multiplos dele e dos seus antecesores: ");
        int x = sc.nextInt();

        for (int i = 1; i <= x ; i++ ) {
            System.out.printf("%d %d %d%n",i,(i*i),(i*i*i));
        }

        sc.close();
    }
}
