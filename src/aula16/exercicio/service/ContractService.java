package aula16.exercicio.service;

import aula16.exercicio.entities.Contract;
import aula16.exercicio.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){

        Double INSTALLMENTVALUE = contract.getTotalValue()/months;

        for (int i = 1; i <= months; i++){

            LocalDate dueDate = contract.getDate().plusMonths(i);

            Double interest = onlinePaymentService.interest(INSTALLMENTVALUE,i);
            Double paymentFee = onlinePaymentService.paymentFee(INSTALLMENTVALUE);
            Double amount = INSTALLMENTVALUE+paymentFee+interest;

            Installment installment = new Installment(dueDate,amount);

            contract.getInstallmentList().add(installment);

        }

    }

}
