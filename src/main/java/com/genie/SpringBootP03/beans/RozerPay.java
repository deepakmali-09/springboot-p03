package com.genie.SpringBootP03.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class RozerPay implements Partners {

    public RozerPay() {
        System.out.println("RozerPay constructor...");
    }

    @Override
    public void payment(String amount) {
        System.out.println("RozerPay done for: "+amount);
    }
}
