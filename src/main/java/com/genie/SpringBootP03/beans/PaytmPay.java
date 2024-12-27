package com.genie.SpringBootP03.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  //It gives preference for same bean 
public class PaytmPay implements Partners {

    public PaytmPay() {
        System.out.println("PaytmPay constructor...");
    }

    @Override
    public void payment(String amount) {
        System.out.println("PaytmPay done for: "+amount);
    }
}
