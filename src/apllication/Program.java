package apllication;

import entities.Contract;
import entities.Installments;
import services.ContractService;
import services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do Contrato:");
        System.out.print("Número: ");
        int number = sc.nextInt();
        System.out.print("Data(dd/MM/yyy) : ");
        LocalDate date = LocalDate.parse(sc.next(),fmt);
        System.out.print("Entre com o valor do Contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Entre com o número de parcelas: ");
        int n = sc.nextInt();
        ContractService service = new ContractService(new PaypalService());

        service.processContract(contract, n);
        System.out.println("Parcelas :");
        for(Installments installment : contract.getInstallments()){
            System.out.println(installment);
            System.out.println("Fazendo um commit");
        }
        sc.close();
    }
}