package progamasDasAulasOrientadasAObjetos.exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double DOLLAR = Conversor.DOLLAR;

        System.out.printf("Valor Do Dollar: %.2f %n",DOLLAR);
        System.out.print("Insira um valor de dollar a ser convertido para reais: ");

        double reais = sc.nextDouble();

        double convertido = Conversor.converterwithtax(reais);

        System.out.printf("Valor dos dollar em reais: %.2f",convertido);


    }
}
