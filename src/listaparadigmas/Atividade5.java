package listaparadigmas;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();

        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};

        for (int c : cedulas) {
            System.out.println(v / c + " nota(s) de " + c);
            v = v % c;
        }
    }
}