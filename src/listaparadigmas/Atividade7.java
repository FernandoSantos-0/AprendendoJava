package listaparadigmas;

import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];

        for (int i = 0; i < 10; i++) {
            v[i] = sc.nextInt();
        }

        int maior = v[0];
        int menor = v[0];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            soma += v[i];

            if (v[i] > maior) maior = v[i];
            if (v[i] < menor) menor = v[i];
        }

        double media = soma / 10.0;

        System.out.println(maior);
        System.out.println(menor);
        System.out.println(soma);
        System.out.println(media);
    }
}