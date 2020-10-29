package com.cfainsta.apigateway.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "zuul-server")
@RibbonClient(name = "microservices")
public interface MicroservicesProxy {

    @GetMapping(value = "/microservices/tourists")
    List<Object> allProducts();


}
