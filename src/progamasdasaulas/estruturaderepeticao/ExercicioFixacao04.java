package progamasdasaulas.estruturaderepeticao;

import java.util.Scanner;

public class ExercicioFixacao04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool=0,gasolina=0,diesel=0;

        System.out.printf("Alcool[1]%nGasolina[2]%nDiesel[3]%nSair[4]%nQual combustivel você usa: ");
        int op = sc.nextInt();

        while (op != 4) {
            System.out.printf("Alcool[1]%nGasolina[2]%nDiesel[3]%nSair[4]%nQual combustivel você usa: ");
            op = sc.nextInt();
            if (op == 1){
                alcool += 1;
            }
            else if (op == 2){
                gasolina += 1;
            }
            else if (op == 3) {
                diesel += 1;
            }
            else if (op == 4){
                continue;
            }
            else {
                System.out.println("Tente Denovo...");
            }
        }

        System.out.printf("Alcool[1] = %d %nGasolina[2] = %d %nDiesel[3] = %d",alcool,gasolina,diesel);

        sc.close();

    }
}
