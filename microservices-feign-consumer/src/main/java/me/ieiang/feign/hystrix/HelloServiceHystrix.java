package me.ieiang.feign.hystrix;

import me.ieiang.feign.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystrix implements HelloService {
    @Override
    public String hi(String name) {
        return "hi," + name + ",sorry error!";
    }
}
