package progamasdasaulas.estruturacondicional;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Escolha de um numero de 1 a 3: ");
        num = sc.nextInt();

        if(num == 1){
            System.out.println("Blasphemus");
        }
        else if (num == 2) {
            System.out.println("GTA V");
        }

        else if(num == 3){
            System.out.println("the elder scrolls V: Skyrim");
        }

        else {
            System.out.println("Tente denovo!!!");
        }

        sc.close();
    }
}
