package controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("customerService")
    public String customerFallback(){
        return "customer service api is down";
    }

    @GetMapping("productService")
    public String productFallback(){
        return "product service api is down";
    }

    @GetMapping("orderService")
    public String orderFallback(){
        return "order service api is down";
    }

}
