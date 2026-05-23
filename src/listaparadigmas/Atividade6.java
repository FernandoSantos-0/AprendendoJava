package listaparadigmas;

import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kwh = sc.nextInt();
        double valor;

        if (kwh <= 100) {
            valor = kwh * 0.60;
        } else if (kwh <= 200) {
            valor = kwh * 0.75;
        } else {
            valor = kwh * 0.90;
        }

        System.out.println(valor);
    }
}