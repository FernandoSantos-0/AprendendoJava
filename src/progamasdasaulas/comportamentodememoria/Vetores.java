package progamasdasaulas.comportamentodememoria;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o tamanho do vetor: ");
        int vetsize = sc.nextInt();
        double[] vetor = new double[vetsize];

        for (int i = 0 ; i < vetsize ; i++){
            System.out.println("Insira o valor o "+(i+1)+" do vetor: ");
            vetor[i] = sc.nextDouble();
        }
        for (int i = 0;i <vetsize;i++){
            System.out.printf("O valor da posição %d do vetor é: %.2f%n",(i+1),vetor[i]);
        }

    }
}
