package progamasdasaulas.tratamentodeexecoes.exercicio02;

import progamasdasaulas.tratamentodeexecoes.exercicio02.entities.Account;
import progamasdasaulas.tratamentodeexecoes.exercicio02.excpetions.AccountExceptions;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter account data:");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine(); // limpar quebra de linha

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
        }
        catch(AccountExceptions e){
            System.out.println("Withdraw error: "+ e.getMessage());
        }
        sc.close();
    }
}
