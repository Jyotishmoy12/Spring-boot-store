package com.jyotishmoy.store;

import org.springframework.stereotype.Service;


@Service
// tells spring that this is a service component and spring should manage this class as a bean
public class PaypalPaymentService implements PaymentService {
    // implements the payment service interface
    @Override
    // process payment
    public void processPayment(double amount){
        System.out.println("Paypal");
        System.out.println("Amount: " + amount);
    }
}

// Spring will automatically detect this class as a PaymentService implementation and register it in the Spring container.