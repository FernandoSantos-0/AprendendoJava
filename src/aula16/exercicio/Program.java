package aula16.exercicio;

import aula16.exercicio.entities.Contract;
import aula16.exercicio.entities.Installment;
import aula16.exercicio.service.ContractService;
import aula16.exercicio.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");

        System.out.print("Numero: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(),formatter1);

        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();
        sc.nextLine();

        System.out.print("Entre com o numero de parcelas: ");
        int installments = sc.nextInt();
        sc.nextLine();

        Contract contract = new Contract(number,date,totalValue);

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract,installments);

        System.out.println("Parcelas: ");

        for(Installment list: contract.getInstallmentList()){
            System.out.println(list.toString());
        }

    }
}
