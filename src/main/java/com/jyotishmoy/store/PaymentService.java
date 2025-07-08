package com.jyotishmoy.store;


// this is a java interface which defines a contract for payment service
// Any class implementing this interface must define the method
public interface PaymentService {
    void processPayment(double amount);
}

// it allows flexibility so that different payment
// implementations like paypal and stripe can be plugged in