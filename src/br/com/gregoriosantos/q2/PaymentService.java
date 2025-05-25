package br.com.gregoriosantos.q2;

public class PaymentService {
    private PaymentProcessor paymentProcessor;
    
    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }
    
    public boolean makePayment(double amount, String customerId) {
        // Lógica de negócios usando apenas a interface PaymentProcessor
        return paymentProcessor.processPayment(amount, customerId);
    }
}
