package com.zb.consumer.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URL;

@Service
public class ClientService {

    @Autowired
    RestTemplate restTemplate;


    public String buyService() {
        return  restTemplate.getForObject("http://Service-Provider/buy",String.class);
    }
}

