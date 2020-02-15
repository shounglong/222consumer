package com.zb.consumer.controller.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "SERVICE-PROVIDER" , fallback = FeignHysticService.class)
public interface FeignService {

    @RequestMapping("/buy")
    public String shopping();
}
