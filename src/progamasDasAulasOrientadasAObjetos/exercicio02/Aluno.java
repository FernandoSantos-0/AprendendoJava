package progamasDasAulasOrientadasAObjetos.exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Notasaluno x;
        x = new Notasaluno();


        System.out.println("Insira as 3 notas do aluno: ");
        x.grade1 = sc.nextDouble();
        x.grade2 = sc.nextDouble();
        x.grade3 = sc.nextDouble();

        x.finalgrade();
    }
}
