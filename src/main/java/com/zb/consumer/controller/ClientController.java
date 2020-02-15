package com.zb.consumer.controller;

import com.zb.consumer.controller.service.ClientService;
import com.zb.consumer.controller.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClientController {

    @Autowired
    ClientService clientService;

    @Autowired
    FeignService feignService;

    @RequestMapping("/shopping")
    @ResponseBody
    public String shoping(){
        return clientService.buyService();
    }
}
