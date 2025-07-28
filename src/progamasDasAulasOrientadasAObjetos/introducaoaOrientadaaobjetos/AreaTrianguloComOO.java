package progamasDasAulasOrientadasAObjetos.introducaoaOrientadaaobjetos;

import java.util.Locale;
import java.util.Scanner;

public class AreaTrianguloComOO {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Enter the measures of triangle X: ");
        x.A = sc.nextDouble();
        x.B = sc.nextDouble();
        x.C = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.A = sc.nextDouble();
        y.B = sc.nextDouble();
        y.C = sc.nextDouble();

        double areaX = x.areatriangulo();

        double areaY = y.areatriangulo();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }

        else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}
