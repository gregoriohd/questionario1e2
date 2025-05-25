package br.com.gregoriosantos.q2;

public interface PaymentProcessor {
    boolean processPayment(double amount, String customerId);
    boolean refundPayment(String transactionId);
}
