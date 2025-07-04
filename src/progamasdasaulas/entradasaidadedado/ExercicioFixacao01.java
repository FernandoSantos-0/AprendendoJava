package progamasdasaulas.entradasaidadedado;

import java.util.Locale;

public class ExercicioFixacao01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String produto1 = "Computer";
        String produto2 = "White Praxis";

        int quantidade = 30;
        int codigo = 5090;

        char gender = 'F';

        double preco1 = 2100.0;
        double preco2 = 2006.0;
        double preco3 = 1500.5646236;

        System.out.println("Product:");
        System.out.printf("%s, which price is $ %.2f.%n",produto1,preco1);
        System.out.printf("%s, which price is $ %.2f.%n",produto2,preco2);
        System.out.printf("%nRecord: %d years old, code %d and gender: %s%n",quantidade,codigo,gender);
        System.out.printf("Measure with eight decimal places: %f%n",preco3);
        System.out.printf("Rouded (three decimal places): %.3f",preco3);
    }
}
