package com.jyotishmoy.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Component: Tells Spring that this class should be managed as a bean.
public class OrderService {
    private PaymentService paymentService;
    
    public OrderService(PaymentService paymentService, int x){}
    
    @Autowired
    // this is constuctor based dependency injection
    // spring will look for a PaymentService bean and inject it
    // automatically here
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    public void placeOrder(){
       paymentService.processPayment(10);
    }
  
    public void setPaymentService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

  
}
