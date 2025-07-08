package progamasdasaulas.funcoes;

import java.util.Locale;
import java.util.Scanner;

public class Funcao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a=8,b=17;

        int resul = multi(a,b);

        System.out.println(resul);

        sc.close();
    }

    public static int multi(int num1,int num2) {
        int aux;

        if (num1 > num2) {
            aux = num1;
        }
        else{
            aux = num2;
        }

        return aux;
    }

}
