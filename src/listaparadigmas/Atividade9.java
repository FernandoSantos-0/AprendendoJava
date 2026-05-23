package listaparadigmas;
import java.util.Scanner;

public class Atividade9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aprovados = 0;
        int reprovados = 0;
        double somaTurma = 0;

        for (int i = 0; i < 8; i++) {

            String nome = sc.next();
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();

            double media = (n1 + n2) / 2;

            somaTurma += media;

            System.out.println(nome + " média: " + media);

            if (media >= 7) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Média turma: " + somaTurma / 8);
    }
}