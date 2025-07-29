package progamasdasaulas.tratamentodeexecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        method2();

        System.out.println("Fim do progama");
    }

    public static void method2(){

        System.out.println("*****Inicio Do Method2*****");

        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição invalida!!!");
            e.printStackTrace();
        }
        catch (InputMismatchException e) {
            System.out.println("Erro de entrada!!!");
        }

        System.out.println("*****Fim Do Method2*****");

        sc.close();
    }

}
