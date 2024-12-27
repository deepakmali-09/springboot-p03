package com.genie.SpringBootP03.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {

    @Autowired
    //@Qualifier("paytmPay")
    Partners paymentPartner;

    public Flipkart() {
        System.out.println("Flipkart constructor...");
    }

    public void paymentGateWay(String amount) {
        paymentPartner.payment(amount);
    }
}
