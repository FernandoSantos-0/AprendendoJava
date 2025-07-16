package progamasDasAulasOrientadasAObjetos.exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numero da conta: ");
        int numberAccount = sc.nextInt();
        sc.nextLine();

        System.out.println("Insira o nome do dono da conta: ");
        String nameaccount = sc.nextLine();

        Client client = new Client(nameaccount,numberAccount);

        System.out.println(client);

        System.out.println("Tem interesse em um deposito inicial?[s/n]");
        String isInitialDepositAgreed = sc.nextLine();
        isInitialDepositAgreed = isInitialDepositAgreed.toLowerCase();

        if (isInitialDepositAgreed.equalsIgnoreCase("s")){

            System.out.println("Insira o valor do deposito: ");
            double valuedeposit = sc.nextDouble();
            sc.nextLine();

            client.setAccountBalance(valuedeposit,1);

            System.out.println("Quanto quer sacar: ");
            double withDrawAccount = sc.nextDouble();
            sc.nextLine();

            if (client.getAccountBalance() >= withDrawAccount){
                client.setAccountBalance(withDrawAccount,2);
            }
            else{
                System.out.println("Não e possivel sacar esse valor!!");
            }
    }
        else{
                    System.out.println("OK!");
                }
        System.out.println("Informações da conta: ");
        System.out.println(client);

        sc.close();
    }
}
