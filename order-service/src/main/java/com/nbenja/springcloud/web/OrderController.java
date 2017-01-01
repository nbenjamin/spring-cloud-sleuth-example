package com.nbenja.springcloud.web;


import com.nbenja.springcloud.service.PaymentIntegrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class OrderController {

    @Autowired
    private PaymentIntegrationService paymentIntegrationService;

    @PostMapping(path = "order")
    public String createOrder() {
        String response = paymentIntegrationService.invokePaymentService();
        return "Successfully created new order" + response;
    }
}
