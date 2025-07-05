package progamasdasaulas.estruturacondicional;

import java.util.Scanner;

public class ExercicioFixacao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Insira um numero: ");
        num = sc.nextInt();

        if ((num % 2) == 0){
            System.out.println("O numero e par!");
        }
        else {
            System.out.println("O numero e impar!!");
        }
    }
}
