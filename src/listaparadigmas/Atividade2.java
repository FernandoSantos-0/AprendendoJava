package listaparadigmas;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        int h = s / 3600;
        int m = (s % 3600) / 60;
        int seg = s % 60;

        System.out.println(h + "h " + m + "m " + seg + "s");
    }
}