package progamasdasaulas.entradasaidadedado;

import java.util.Locale;

public class EntradaESaidaDeDado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int y = 10;
        double x = 10.30452;
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n",x);
    }
}
