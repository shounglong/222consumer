package com.zb.consumer.controller.service;

import org.springframework.stereotype.Service;

@Service
public class FeignHysticService implements FeignService{

    @Override
    public String shopping() {
        return "Sorry!!!";
    }
}
