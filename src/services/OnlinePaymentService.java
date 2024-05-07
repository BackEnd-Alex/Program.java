package services;

public interface OnlinePaymentService {

    Double paymentFree (double amount);
    Double interest(double amount, int months);
}
