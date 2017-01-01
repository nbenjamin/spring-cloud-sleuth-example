package com.nbenja.springcloud.payment.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PaymentController {

    @PostMapping("/payment")
    public String createPayment(){
        return "Successfully completed the payment";
    }
}
