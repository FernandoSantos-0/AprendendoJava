package progamasdasaulas.entradasaidadedado;

import java.util.Locale;
import java.util.Scanner;

public class EntradaESaidaDeDado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int y = 10;
        double x = 10.30452;
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n",x);

        Scanner sc = new Scanner(System.in);

        String palavra;
        palavra = sc.next();

        System.out.println("A palavra digitada foi "+palavra);

        int i;
        i = sc.nextInt();

        System.out.println("O numero digitado foi: "+i);

        sc.nextLine();
        String linha;
        linha = sc.nextLine();

        System.out.println("O oque foi digitado foi: "+linha);

        sc.close();
    }
}
