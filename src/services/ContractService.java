package services;

import entities.Contract;
import entities.Installments;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
        public void processContract(Contract contrac , int months){
        contrac.getInstallments().add(new Installments
                (LocalDate.of(2018,7,25),206.04));

        contrac.getInstallments().add(new Installments
                    (LocalDate.of(2018,8,25),208.08));
    }


}
