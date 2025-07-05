package progamasdasaulas.entradasaidadedado;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double A,B,C;

        System.out.println("Insira o Valor de A: ");
        A = sc.nextDouble();

        System.out.println("Insira o Valor de B: ");
        B = sc.nextDouble();

        System.out.println("Insira o Valor de C: ");
        C = sc.nextDouble();

        double pot = Math.pow(C,2.0);
        double quadrado = Math.pow(B,2.0);

        System.out.printf("TRIANGULO: %.2f%n",((A*C)/2));
        System.out.printf("CIRCULO: %.2f%n",(3.14159*pot));
        System.out.printf("TRAPEZIO: %.2f%n",((A+B)*C)/2);
        System.out.printf("QUADRADO: %.2f%n",quadrado);
        System.out.printf("RETANGULO: %.2f%n",(A*B));
    }
}
