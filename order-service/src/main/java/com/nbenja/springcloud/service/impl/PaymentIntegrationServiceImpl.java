package com.nbenja.springcloud.service.impl;

import com.nbenja.springcloud.service.PaymentIntegrationService;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class PaymentIntegrationServiceImpl implements PaymentIntegrationService {

    private static final String PAYMENT_BASE_URL = "http://localhost:8088";
    private static final String PAYMENT_RESOURCE = "payment";
    private RestTemplate restTemplate = new RestTemplate();
    private UriComponentsBuilder builder = UriComponentsBuilder.fromUri(URI.create(PAYMENT_BASE_URL)).path(PAYMENT_RESOURCE);
    private HttpEntity<String> httpEntity = new HttpEntity<String>(null,null);

    @Override
    public String invokePaymentService() {
        String response;
        response = restTemplate.exchange(builder.build().toString(), HttpMethod.POST, httpEntity, String.class).getBody();
        return response;
    }
}
