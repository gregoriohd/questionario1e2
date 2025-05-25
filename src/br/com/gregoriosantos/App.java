package br.com.gregoriosantos;

import br.com.gregoriosantos.q1.Product;
import br.com.gregoriosantos.q2.PaymentProcessor;
import br.com.gregoriosantos.q2.PaymentService;
import br.com.gregoriosantos.q2.ThirdPartyPaymentAdapter;
import br.com.gregoriosantos.q2.ThirdPartyPaymentLibrary;

public class App {

	public static void main(String[] args) {
		
		//==============================Q1============================================
		Product p1 = new Product("Notebook", "7891234567890", 3500.00);
        Product p2 = new Product("Notebook Pro", "7891234567890", 4500.00);
        Product p3 = new Product("Smartphone", "9876543210987", 2000.00);
        
        System.out.println(p1.equals(p2)); 
        System.out.println(p1.equals(p3)); 
        
        System.out.println(p1.hashCode() == p2.hashCode()); 
        System.out.println(p1.hashCode() == p3.hashCode());
        
        //==============================Q2=============================================
        
        ThirdPartyPaymentLibrary library = new ThirdPartyPaymentLibrary();
       
        PaymentProcessor processor = new ThirdPartyPaymentAdapter(library);
        
        PaymentService service = new PaymentService(processor);
        
        boolean success = service.makePayment(100.0, "cust123");
        
        
	}

}
