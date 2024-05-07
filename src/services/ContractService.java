package services;

import entities.Contract;
import entities.Installments;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contrac, int months) {
        double bacisQuota = contrac.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {

            LocalDate dueDate = contrac.getDate().plusMonths(i);
            double  interest = onlinePaymentService.interest(bacisQuota, i);
           double fee = onlinePaymentService.paymentFree(bacisQuota+ interest);
           double quota = bacisQuota + interest + fee;
           contrac.getInstallments().add(new Installments(dueDate,quota));

        }
    }
}
