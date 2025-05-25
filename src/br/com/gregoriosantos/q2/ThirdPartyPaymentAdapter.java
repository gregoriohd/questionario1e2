package br.com.gregoriosantos.q2;

public class ThirdPartyPaymentAdapter implements PaymentProcessor {
    private ThirdPartyPaymentLibrary library;
    
    public ThirdPartyPaymentAdapter(ThirdPartyPaymentLibrary library) {
        this.library = library;
    }
    
    @Override
    public boolean processPayment(double amount, String customerId) {
        // Adapta nossa interface para a biblioteca de terceiros
        String result = library.chargeCustomer(customerId, amount);
        return result.startsWith("SUCCESS");
    }
    
    @Override
    public boolean refundPayment(String transactionId) {
        // Adapta nossa interface para a biblioteca de terceiros
        return library.issueRefund(transactionId) == 200;
    }
}
